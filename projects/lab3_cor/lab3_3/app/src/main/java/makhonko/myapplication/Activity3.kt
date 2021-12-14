package makhonko.myapplication


import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import makhonko.myapplication.databinding.Activity2Binding
import makhonko.myapplication.databinding.Activity3Binding


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
            if (item.itemId == R.id.navigation_home)
                startActivity(Intent(this, Activity4::class.java))
            return@setOnItemSelectedListener true
        }
    }

    fun changeActivity1() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP))
        finish()
    }

    fun changeActivity2() {
        val intent = Intent(this, Activity2::class.java)
        startActivity(intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP))//FLAG_ACTIVITY_SINGLE_TOP
        finish()
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
