package makhonko.lab3_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.bottomnavigation.BottomNavigationView
import makhonko.lab3_2.databinding.Activity2Binding
import makhonko.lab3_2.databinding.Activity3Binding
import java.util.logging.Logger

class Activity2 : AppCompatActivity() {
    lateinit var binding: Activity2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity2)
        binding = Activity2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bnToThird.setOnClickListener { changeActivity3() }
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
        finish()
    }

    private fun changeActivity3() {
        val intent = Intent(this, Activity3::class.java)
        startActivityForResult(intent, 1)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (resultCode == 1) {
            //
        } else if (resultCode == 2) {
            finish()
        }
        super.onActivityResult(requestCode, resultCode, data)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}