package makhonko.myapplication

import android.view.Gravity
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers.withId
import makhonko.lab3_2.R

private fun openAboutViaBottomNav() {
    Espresso.onView(withId(R.id.nav_view)).perform(ViewActions.click())
}

fun openAbout() = openAboutViaBottomNav()