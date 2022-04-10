package com.mobile.fintech1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import com.mobile.fintech1.home.HomeFragment

class MainActivity : AppCompatActivity() {
    private lateinit var btnHome: Button
    private lateinit var btnProfile: Button
    private lateinit var btnSetting: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnHome = findViewById(R.id.btnHome)
        btnProfile = findViewById(R.id.btnProfile)
        btnSetting = findViewById(R.id.btnSetting)

//        btnHome.setOnClickListener {
//            val intent = Intent(this, HomeActivity::class.java)
//            startActivity(intent)
//        }
//
//        btnProfile.setOnClickListener {
//            val intent = Intent(this, SettingActivity::class.java)
//            startActivity(intent)
//        }

        btnHome.setOnClickListener {
            loadFragment(HomeFragment())
        }
    }

    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, fragment)
            .commitNow()
    }
}