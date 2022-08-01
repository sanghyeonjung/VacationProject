package com.example.vacationproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val nextBtn = findViewById<TextView>(R.id.layoutFirstStudyTextButtonMain)
        nextBtn.setOnClickListener{
            startActivity(Intent(this@MainActivity,FirstStudyActivity::class.java))
        }
    }
}