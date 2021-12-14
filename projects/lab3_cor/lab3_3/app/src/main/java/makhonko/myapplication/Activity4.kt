package makhonko.myapplication



import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity


class Activity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity4)
    }

    override fun onBackPressed() {
        finish()
        super.onBackPressed()
    }
    fun Nav(item: android.view.MenuItem) {}

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
