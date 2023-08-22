package com.example.hw5_month3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            val fragment = FirstFragment()
            supportFragmentManager.beginTransaction()
                .add(R.id.container, fragment)
                .commit()
        }
    }
}