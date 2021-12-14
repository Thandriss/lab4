package makhonko.lab4_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun changeText(view: View) {
        val btnToChange: Button = findViewById(R.id.btn)
        btnToChange.text = String.format(getString(R.string.mot))
    }
}