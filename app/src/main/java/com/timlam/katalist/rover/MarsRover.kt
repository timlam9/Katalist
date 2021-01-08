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

    fun execute(command: String): String {
        command.forEach { singleCommand ->
            coordinates = when (singleCommand) {
                RIGHT_COMMAND -> coordinates.copy(direction = Direction.values()[findIndex(true)])
                LEFT_COMMAND -> coordinates.copy(direction = Direction.values()[findIndex(false)])
                else -> move()
            }
        }

        return coordinates.currentPosition()
    }

    private fun findIndex(clockWise: Boolean): Int {
        return if (clockWise) {
            if (coordinates.direction.ordinal != Direction.values().size - 1) coordinates.direction.ordinal + 1 else 0
        } else {
            if (coordinates.direction.ordinal != 0) coordinates.direction.ordinal - 1 else Direction.values().size - 1
        }
    }

    private fun move(): Coordinates {
        val (x, y) = when (coordinates.direction) {
            Direction.North -> Pair(coordinates.x, if (coordinates.y == grid.height - 1) 0 else coordinates.y + 1)
            Direction.East -> Pair(if (coordinates.x == grid.width - 1) 0 else coordinates.x + 1, coordinates.y)
            Direction.South -> Pair(coordinates.x, if (coordinates.y == 0) grid.height - 1 else coordinates.y - 1)
            Direction.West -> Pair(if (coordinates.x == 0) grid.width - 1 else coordinates.x - 1, coordinates.y)
        }

        return if (grid.isFreeSpot(x, y)) coordinates.copy(x = x, y = y) else coordinates.copy(foundObstacle = true)
    }

}
