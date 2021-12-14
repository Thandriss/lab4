package makhonko.lab4_1

import android.content.pm.ActivityInfo
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.clearText
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Rule
import org.junit.Test

class UIEspTest {
    @Rule @JvmField
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun testButton() {
        Espresso.onView(ViewMatchers.withId(R.id.layout)).check(matches(ViewMatchers.isDisplayed()))
        Espresso.onView(ViewMatchers.withId(R.id.btn)).check(matches(withText(R.string.click_on_it)))
        Espresso.onView(ViewMatchers.withId(R.id.btn)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.btn)).check(matches(withText(R.string.mot)))
        Espresso.onView(ViewMatchers.withId(R.id.btn)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.btn)).check(matches(withText(R.string.mot)))
        activityRule.scenario.onActivity { activity ->
            activity.setRequestedOrientation(
                ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
            )
        }
        Espresso.onView(ViewMatchers.withId(R.id.layout)).check(matches(ViewMatchers.isDisplayed()))
        Espresso.onView(ViewMatchers.withId(R.id.btn)).check(matches(withText(R.string.click_on_it)))
        Espresso.onView(ViewMatchers.withId(R.id.btn)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.btn)).check(matches(withText(R.string.mot)))
    }
    @Test
    fun testET() {
        Espresso.onView(ViewMatchers.withId(R.id.layout)).check(matches(ViewMatchers.isDisplayed()))
        Espresso.onView(ViewMatchers.withId(R.id.text)).check(matches(withText("Hello World!")))
        Espresso.onView(ViewMatchers.withId(R.id.text)).perform(clearText())
        Espresso.onView(ViewMatchers.withId(R.id.text)).perform(typeText("Hmmm...some text here!"))
        activityRule.scenario.recreate()
        Espresso.onView(ViewMatchers.withId(R.id.layout)).check(matches(ViewMatchers.isDisplayed()))
        Espresso.onView(ViewMatchers.withId(R.id.text)).check(matches(withText("Hmmm...some text here!")))
    }
}