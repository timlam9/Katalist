package com.timlam.katalist

import androidx.annotation.IdRes
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions.actionOnItemAtPosition
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.Assert.assertEquals
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    private val context = InstrumentationRegistry.getInstrumentation().targetContext
    private val message = context.getString(R.string.app_name)

    private val katas = KatasRepository.katas

    @Test
    fun useAppContext() {
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.timlam.katalist", appContext.packageName)
    }

    @Test
    fun starting_the_app_show_the_list_of_katas() {

        isViewShown(R.id.list_kata)
    }

    @Test
    fun when_first_item_clicked_show_Kata_fragment() {
        val firstItemPosition = 0
        onView(withId(R.id.list_kata)).perform(
            actionOnItemAtPosition<KataAdapter.KataViewHolder>(
                firstItemPosition,
                click()
            )
        )

        onView(withId(R.id.text_details_title)).check(matches(withText(katas[firstItemPosition].title)))
    }

    private fun onViewClicked(@IdRes viewId: Int) = onView(withId(viewId)).perform(click())

    private fun isViewShown(@IdRes viewId: Int) = onView(withId(viewId)).check(matches(isDisplayed()))

    private infix fun Int.isListSize(size: Int) = onView(withId(this)).check(matches(isDisplayed()))
}
