package makhonko.lab3_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.bottomnavigation.BottomNavigationView
import makhonko.lab3_2.databinding.Activity2Binding
import makhonko.lab3_2.databinding.Activity3Binding


class Activity3 : AppCompatActivity() {
    lateinit var binding: Activity3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity3)
        binding = Activity3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bnToSecond.setOnClickListener { changeActivity2() }
        binding.bnToFirst.setOnClickListener { changeActivity1() }

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        val bottom: BottomNavigationView = binding.navView
        bottom.setOnItemSelectedListener { item ->
            if (item.itemId == R.id.aboutActivity)
                startActivity(Intent(this, Activity4::class.java))
            return@setOnItemSelectedListener true
        }
    }

    private fun changeActivity1() {
        val intent = Intent()
        setResult(2, intent)
        finish()
    }

    private fun changeActivity2() {
        val intent = Intent()
        setResult(1, intent)
        finish()
    }

    fun Nav(item: android.view.MenuItem) {
        val intent = Intent(this, Activity4::class.java)
        startActivity(intent)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}