package makhonko.myapplication


import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import makhonko.myapplication.databinding.Activity2Binding


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
            if (item.itemId == R.id.navigation_home)
                startActivity(Intent(this, Activity4::class.java))
            return@setOnItemSelectedListener true
        }
    }

    fun changeActivity1() {
        finish()
    }

    fun changeActivity3() {
        val intent = Intent(this, Activity3::class.java)

        //intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)

        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        startActivity(intent)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
