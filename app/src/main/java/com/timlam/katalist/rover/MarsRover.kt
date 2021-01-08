package com.timlam.katalist.rover

class MarsRover(private val grid: Grid = Grid()) {

    companion object {

        private const val RIGHT_COMMAND = 'R'
        private const val LEFT_COMMAND = 'L'

    }

    enum class Direction {
        North,
        East,
        South,
        West
    }

    private var coordinates = Coordinates()
    private var direction = Direction.North

    fun execute(command: String): String {
        command.forEach { singleCommand ->
            coordinates = when (singleCommand) {
                RIGHT_COMMAND -> {
                    direction = Direction.values()[findIndex(true)]
                    coordinates
                }
                LEFT_COMMAND -> {
                    direction = Direction.values()[findIndex(false)]
                    coordinates
                }
                else -> move()
            }
        }

        return coordinates.currentPosition(direction.name.first())
    }

    private fun findIndex(clockWise: Boolean): Int {
        return if (clockWise) {
            if (direction.ordinal != Direction.values().size - 1) direction.ordinal + 1 else 0
        } else {
            if (direction.ordinal != 0) direction.ordinal - 1 else Direction.values().size - 1
        }
    }

    private fun move(): Coordinates {
        val (x, y) = when (direction) {
            Direction.North -> Pair(coordinates.x, if (coordinates.y == grid.height - 1) 0 else coordinates.y + 1)
            Direction.East -> Pair(if (coordinates.x == grid.width - 1) 0 else coordinates.x + 1, coordinates.y)
            Direction.South -> Pair(coordinates.x, if (coordinates.y == 0) grid.height - 1 else coordinates.y - 1)
            Direction.West -> Pair(if (coordinates.x == 0) grid.width - 1 else coordinates.x - 1, coordinates.y)
        }

        return if (grid.isFreeSpot(x, y)) coordinates.copy(x = x, y = y) else coordinates.copy(foundObstacle = true)
    }

}
