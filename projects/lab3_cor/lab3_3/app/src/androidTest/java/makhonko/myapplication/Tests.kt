package makhonko.myapplication

import android.content.pm.ActivityInfo
import androidx.test.core.app.launchActivity
import androidx.lifecycle.Lifecycle
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Assert
import org.junit.Rule
import org.junit.Test

class Tests {
    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun FirstTest1() {
        Espresso.onView(withId(R.id.bnToSecond)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.bnToThird)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.bnToSecond)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.bnToThird)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.bnToSecond)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.bnToThird)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.bnToSecond)).perform(ViewActions.click())
        Espresso.pressBack()
        Espresso.onView(withId(R.id.fragment1)).check(ViewAssertions.matches(isDisplayed()))
        ViewActions.pressBackUnconditionally()
        Assert.assertTrue(activityRule.scenario.state.isAtLeast(Lifecycle.State.DESTROYED))
    }

    @Test
    fun FirstTest2() {
        Espresso.onView(withId(R.id.bnToSecond)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.fragment3)).check(ViewAssertions.doesNotExist())
        Espresso.pressBack()
        Espresso.onView(withId(R.id.fragment1)).check(ViewAssertions.matches(isDisplayed()))
    }

    @Test
    fun FirstTest3() {
        Espresso.onView(withId(R.id.bnToSecond)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.bnToThird)).perform(ViewActions.click())
        openAbout()
        Espresso.pressBack()
        Espresso.onView(withId(R.id.fragment2)).check(ViewAssertions.doesNotExist())
        Espresso.onView(withId(R.id.fragment3)).check(ViewAssertions.matches(isDisplayed()))
        Espresso.pressBack()
        Espresso.onView(withId(R.id.fragment2)).check(ViewAssertions.matches(isDisplayed()))
        Espresso.pressBack()
        Espresso.onView(withId(R.id.fragment1)).check(ViewAssertions.matches(isDisplayed()))
    }

    @Test
    fun FirstTest4() {
        Espresso.onView(withId(R.id.bnToSecond)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.bnToThird)).perform(ViewActions.click())
        openAbout()
        Espresso.pressBack()
        Espresso.onView(withId(R.id.fragment2)).check(ViewAssertions.doesNotExist())
        Espresso.onView(withId(R.id.fragment3)).check(ViewAssertions.matches(isDisplayed()))
    }

    @Test
    fun SecondTest1() {
        //Espresso.onView(withId(R.id.activity_main)).check(ViewAssertions.matches(isDisplayed()))
        Espresso.onView(withId(R.id.fragment1)).check(ViewAssertions.matches(isDisplayed()))
        Espresso.onView(withId(R.id.bnToSecond)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.fragment2)).check(ViewAssertions.matches(isDisplayed()))
        //Espresso.onView(withId(R.id.nav_host_fragment_activity_main)).check(ViewAssertions.matches(isDisplayed()))
    }

    @Test
    fun SecondTest2() {
        //Espresso.onView(withId(R.id.activity_main)).check(ViewAssertions.matches(isDisplayed()))
        Espresso.onView(withId(R.id.fragment1)).check(ViewAssertions.matches(isDisplayed()))
        Espresso.onView(withId(R.id.bnToSecond)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.fragment2)).check(ViewAssertions.matches(isDisplayed()))
        Espresso.onView(withId(R.id.bnToFirst)).check(ViewAssertions.matches(isDisplayed()))
    }

    @Test
    fun SecondTest3() {
        //Espresso.onView(withId(R.id.activity_main)).check(ViewAssertions.matches(isDisplayed()))
        Espresso.onView(withId(R.id.fragment1)).check(ViewAssertions.matches(isDisplayed()))
        openAbout()
        Espresso.onView(withId(R.id.activity_about)).check(ViewAssertions.matches(isDisplayed()))
        Espresso.pressBack()
        Espresso.onView(withId(R.id.bnToSecond)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.fragment2)).check(ViewAssertions.matches(isDisplayed()))
        openAbout()
        Espresso.onView(withId(R.id.activity_about)).check(ViewAssertions.matches(isDisplayed()))
        Espresso.pressBack()
        Espresso.onView(withId(R.id.fragment2)).check(ViewAssertions.matches(isDisplayed()))
    }

    @Test
    fun SecondTest4() {
        //Espresso.onView(withId(R.id.activity_main)).check(ViewAssertions.matches(isDisplayed()))
        Espresso.onView(withId(R.id.fragment1)).check(ViewAssertions.matches(isDisplayed()))
        Espresso.onView(withId(R.id.bnToSecond)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.fragment2)).check(ViewAssertions.matches(isDisplayed()))
        openAbout()
        Espresso.onView(withId(R.id.activity_about)).check(ViewAssertions.matches(isDisplayed()))
        Espresso.pressBack()
        Espresso.onView(withId(R.id.fragment2)).check(ViewAssertions.matches(isDisplayed()))
        openAbout()
        Espresso.onView(withId(R.id.activity_about)).check(ViewAssertions.matches(isDisplayed()))
        Espresso.pressBack()
        Espresso.onView(withId(R.id.fragment2)).check(ViewAssertions.matches(isDisplayed()))
        Espresso.onView(withId(R.id.bnToThird)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.fragment3)).check(ViewAssertions.matches(isDisplayed()))
        openAbout()
        Espresso.onView(withId(R.id.activity_about)).check(ViewAssertions.matches(isDisplayed()))
        Espresso.pressBack()
        Espresso.onView(withId(R.id.fragment3)).check(ViewAssertions.matches(isDisplayed()))
    }

    @Test
    fun SecondTest5() {
        //Espresso.onView(withId(R.id.activity_main)).check(ViewAssertions.matches(isDisplayed()))
        Espresso.onView(withId(R.id.fragment1)).check(ViewAssertions.matches(isDisplayed()))
        Espresso.onView(withId(R.id.bnToSecond)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.fragment2)).check(ViewAssertions.matches(isDisplayed()))
        openAbout()
        Espresso.onView(withId(R.id.activity_about)).check(ViewAssertions.matches(isDisplayed()))
    }

    @Test
    fun SecondTest6() {
        //Espresso.onView(withId(R.id.activity_main)).check(ViewAssertions.matches(isDisplayed()))
        Espresso.onView(withId(R.id.fragment1)).check(ViewAssertions.matches(isDisplayed()))
        Espresso.onView(withId(R.id.bnToSecond)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.fragment2)).check(ViewAssertions.matches(isDisplayed()))
        Espresso.onView(withId(R.id.nav_view)).check(ViewAssertions.matches(isDisplayed()))
        Espresso.onView(withId(R.id.nav_view)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.activity_about)).check(ViewAssertions.matches(isDisplayed()))
    }

    @Test
    fun SecondTest7() {
        //Espresso.onView(withId(R.id.activity_main)).check(ViewAssertions.matches(isDisplayed()))
        Espresso.onView(withId(R.id.bnToSecond)).check(ViewAssertions.matches(isDisplayed()))
        Espresso.onView(withId(R.id.bnToSecond)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.bnToThird)).check(ViewAssertions.matches(isDisplayed()))
        Espresso.onView(withId(R.id.bnToFirst)).check(ViewAssertions.matches(isDisplayed()))
        Espresso.onView(withId(R.id.bnToFirst)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.fragment1)).check(ViewAssertions.matches(isDisplayed()))
    }

    @Test
    fun SecondTest8() {
        //Espresso.onView(withId(R.id.activity_main)).check(ViewAssertions.matches(isDisplayed()))
        Espresso.onView(withId(R.id.bnToSecond)).check(ViewAssertions.matches(isDisplayed()))
        Espresso.onView(withId(R.id.bnToSecond)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.bnToThird)).check(ViewAssertions.matches(isDisplayed()))
        Espresso.onView(withId(R.id.bnToFirst)).check(ViewAssertions.matches(isDisplayed()))
        Espresso.onView(withId(R.id.bnToFirst)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.fragment1)).check(ViewAssertions.matches(isDisplayed()))
    }

    @Test
    fun SecondTest9() {
        //Espresso.onView(withId(R.id.activity_main)).check(ViewAssertions.matches(isDisplayed()))
        Espresso.onView(withId(R.id.fragment1)).check(ViewAssertions.matches(isDisplayed()))
        Espresso.onView(withId(R.id.bnToSecond)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.fragment2)).check(ViewAssertions.matches(isDisplayed()))
        Espresso.onView(ViewMatchers.withContentDescription("Navigate up"))
            .perform(ViewActions.click())
        Espresso.onView(withId(R.id.fragment1)).check(ViewAssertions.matches(isDisplayed()))
    }

    @Test
    fun ThirdTest1() {
        //Espresso.onView(withId(R.id.activity_main)).check(ViewAssertions.matches(isDisplayed()))
        rotLand()
        Espresso.onView(withId(R.id.fragment1)).check(ViewAssertions.matches(isDisplayed()))
        Espresso.onView(withId(R.id.fragment3)).check(ViewAssertions.doesNotExist())
        Espresso.onView(withId(R.id.fragment2)).check(ViewAssertions.doesNotExist())
    }

    @Test
    fun ThirdTest2() {
        //Espresso.onView(withId(R.id.activity_main)).check(ViewAssertions.matches(isDisplayed()))
        rotLand()
        Espresso.onView(withId(R.id.fragment1)).check(ViewAssertions.matches(isDisplayed()))
        Espresso.onView(withId(R.id.bnToSecond)).perform(ViewActions.click())
        rotPort()
        Espresso.onView(withId(R.id.fragment2)).check(ViewAssertions.matches(isDisplayed()))
    }

    @Test
    fun ThirdTest3() {
        //Espresso.onView(withId(R.id.activity_main)).check(ViewAssertions.matches(isDisplayed()))
        rotLand()
        Espresso.onView(withId(R.id.fragment1)).check(ViewAssertions.matches(isDisplayed()))
        Espresso.onView(withId(R.id.bnToSecond)).perform(ViewActions.click())
        rotPort()
        Espresso.onView(withId(R.id.fragment2)).check(ViewAssertions.matches(isDisplayed()))
        openAbout()
        rotLand()
        Espresso.onView(withId(R.id.activity_about)).check(ViewAssertions.matches(isDisplayed()))
        Espresso.pressBack()
        Espresso.onView(withId(R.id.fragment2)).check(ViewAssertions.matches(isDisplayed()))
        openAbout()
        Espresso.onView(withId(R.id.activity_about)).check(ViewAssertions.matches(isDisplayed()))
    }

    @Test
    fun ThirdTest4() {
        //Espresso.onView(withId(R.id.activity_main)).check(ViewAssertions.matches(isDisplayed()))
        rotLand()
        Espresso.onView(withId(R.id.fragment1)).check(ViewAssertions.matches(isDisplayed()))
        Espresso.onView(withId(R.id.bnToSecond)).perform(ViewActions.click())
        rotPort()
        Espresso.onView(withId(R.id.fragment2)).check(ViewAssertions.matches(isDisplayed()))
        openAbout()
        rotLand()
        Espresso.onView(withId(R.id.activity_about)).check(ViewAssertions.matches(isDisplayed()))
        Espresso.pressBack()
        Espresso.onView(withId(R.id.fragment2)).check(ViewAssertions.matches(isDisplayed()))
        openAbout()
        Espresso.onView(withId(R.id.activity_about)).check(ViewAssertions.matches(isDisplayed()))
        Espresso.pressBack()
        rotPort()
        Espresso.onView(withId(R.id.fragment2)).check(ViewAssertions.matches(isDisplayed()))
        Espresso.onView(withId(R.id.bnToThird)).perform(ViewActions.click())
        rotLand()
        Espresso.onView(withId(R.id.fragment3)).check(ViewAssertions.matches(isDisplayed()))
        openAbout()
        Espresso.onView(withId(R.id.activity_about)).check(ViewAssertions.matches(isDisplayed()))
        Espresso.pressBack()
        Espresso.onView(withId(R.id.fragment3)).check(ViewAssertions.matches(isDisplayed()))
    }

    fun checkFr1() {
        Espresso.onView(withId(R.id.nav_view)).check(ViewAssertions.matches(isDisplayed()))
        //Espresso.onView(withId(R.id.activity_main)).check(ViewAssertions.matches(isDisplayed()))
        Espresso.onView(withId(R.id.fragment1)).check(ViewAssertions.matches(isDisplayed()))
        openAbout()
        Espresso.onView(withId(R.id.activity_about)).check(ViewAssertions.matches(isDisplayed()))
        Espresso.pressBack()
        //Espresso.onView(withId(R.id.activity_main)).check(ViewAssertions.matches(isDisplayed()))
        Espresso.onView(withId(R.id.bnToSecond)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.fragment2)).check(ViewAssertions.matches(isDisplayed()))
        Espresso.pressBack()
        //Espresso.onView(withId(R.id.activity_main)).check(ViewAssertions.matches(isDisplayed()))
        Espresso.onView(withId(R.id.fragment1)).check(ViewAssertions.matches(isDisplayed()))
        openAbout()
        Espresso.onView(withId(R.id.activity_about)).check(ViewAssertions.matches(isDisplayed()))
        Espresso.pressBack()
    }

    fun checkFr2() {
        Espresso.onView(withId(R.id.nav_view)).check(ViewAssertions.matches(isDisplayed()))
        //Espresso.onView(withId(R.id.activity_main)).check(ViewAssertions.matches(isDisplayed()))
        Espresso.onView(withId(R.id.fragment2)).check(ViewAssertions.matches(isDisplayed()))
        openAbout()
        Espresso.onView(withId(R.id.activity_about)).check(ViewAssertions.matches(isDisplayed()))
        Espresso.pressBack()
        //Espresso.onView(withId(R.id.activity_main)).check(ViewAssertions.matches(isDisplayed()))
        Espresso.onView(withId(R.id.fragment2)).check(ViewAssertions.matches(isDisplayed()))
        Espresso.onView(withId(R.id.bnToFirst)).perform(ViewActions.click())
       // Espresso.onView(withId(R.id.activity_main)).check(ViewAssertions.matches(isDisplayed()))
        Espresso.onView(withId(R.id.fragment1)).check(ViewAssertions.matches(isDisplayed()))
        Thread.sleep(1000)
        Espresso.onView(withId(R.id.bnToSecond)).perform(ViewActions.click())
       // Espresso.onView(withId(R.id.activity_main)).check(ViewAssertions.matches(isDisplayed()))
        Espresso.onView(withId(R.id.fragment2)).check(ViewAssertions.matches(isDisplayed()))
        Thread.sleep(1000)
        Espresso.onView(withId(R.id.bnToThird)).perform(ViewActions.click())
        //Espresso.onView(withId(R.id.activity_main)).check(ViewAssertions.matches(isDisplayed()))
        Espresso.onView(withId(R.id.fragment3)).check(ViewAssertions.matches(isDisplayed()))
        Espresso.pressBack()
        //Espresso.onView(withId(R.id.activity_main)).check(ViewAssertions.matches(isDisplayed()))
        Espresso.onView(withId(R.id.fragment2)).check(ViewAssertions.matches(isDisplayed()))
        openAbout()
        Espresso.onView(withId(R.id.activity_about)).check(ViewAssertions.matches(isDisplayed()))
        Espresso.pressBack()
    }

    @Test
    fun ThirdTest5() {
        Espresso.onView(withId(R.id.fragment1)).check(ViewAssertions.matches(isDisplayed()))
        Espresso.onView(withId(R.id.bnToSecond)).perform(ViewActions.click())
        rotPort()
        rotLand()
        checkFr2()
        Espresso.pressBack()
        Espresso.onView(withId(R.id.bnToSecond)).perform(ViewActions.click())
        Thread.sleep(1000)
        Espresso.onView(withId(R.id.bnToThird)).perform(ViewActions.click())
        rotPort()
        Espresso.pressBack()
        checkFr2()
        rotLand()
        Espresso.pressBack()
        checkFr1()
    }

    @Test
    fun ThirdTest6() {
        Espresso.onView(withId(R.id.fragment1)).check(ViewAssertions.matches(isDisplayed()))
        Espresso.onView(withId(R.id.bnToSecond)).perform(ViewActions.click())
        rotPort()
        rotLand()
        checkFr2()
        Espresso.pressBack()
        Espresso.onView(withId(R.id.bnToSecond)).perform(ViewActions.click())
        Thread.sleep(1000)
        Espresso.onView(withId(R.id.bnToThird)).perform(ViewActions.click())
        rotPort()
        Espresso.pressBack()
        checkFr2()
        rotLand()
        rotPort()
        Espresso.pressBack()
        checkFr1()
        Espresso.onView(withId(R.id.fragment1)).check(ViewAssertions.matches(isDisplayed()))
    }

    @Test
    fun testAbout() {
        launchActivity<MainActivity>()
        openAbout()
        Espresso.onView(withId(R.id.activity_about))
            .check(ViewAssertions.matches(isDisplayed()))
    }

    private fun rotLand() {
        activityRule.scenario.onActivity { activity ->
            activity.setRequestedOrientation(
                ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
            )
        }
        Thread.sleep(1000)
    }

    private fun rotPort() {
        activityRule.scenario.onActivity { activity ->
            activity.setRequestedOrientation(
                ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
            )
        }
        Thread.sleep(1000)
    }
}