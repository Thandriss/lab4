package makhonko.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import makhonko.myapplication.databinding.Activity1Binding


class MainActivity : AppCompatActivity() {
    lateinit var binding: Activity1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity1)

        binding = Activity1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bnToSecond.setOnClickListener { changeActivity() }
        val bottom: BottomNavigationView = binding.navView
        bottom.setOnItemSelectedListener { item ->
            if (item.itemId == R.id.navigation_home)
                startActivity(Intent(this, Activity4::class.java))
            return@setOnItemSelectedListener true
        }
    }

    fun changeActivity() {
        val intent = Intent(this, Activity2::class.java)
        startActivity(intent)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}