package makhonko.lab3_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import makhonko.lab3_2.databinding.Activity1Binding
import makhonko.lab3_2.databinding.Activity3Binding
import java.util.logging.Logger

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
            if (item.itemId == R.id.aboutActivity)
                startActivity(Intent(this, Activity4::class.java))
            return@setOnItemSelectedListener true
        }
    }

    private fun changeActivity() {
        val intent = Intent(this, Activity2::class.java)
        startActivity(intent)
    }


    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}