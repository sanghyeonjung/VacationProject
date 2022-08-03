package com.example.vacationproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DetailWhiteFish : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_white_fish)

        val dockdo_btn = findViewById<Button>(R.id.buttonDokdoDetailWhiteFish)

        dockdo_btn.setOnClickListener{
            startActivity(Intent(this,FirstStudyActivity::class.java))
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
        }

    }
}