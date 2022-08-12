package com.example.vacationproject.DetailFish

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import com.example.vacationproject.MainActivity
import com.example.vacationproject.R

class DetailWhiteFish : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_white_fish)

        val dockdo_btn = findViewById<Button>(R.id.buttonDokdoDetailWhiteFish)
        val next_btn = findViewById<ImageButton>(R.id.nextBtn)

        next_btn.setOnClickListener{
            startActivity(Intent(this, DetailWhiteSlime::class.java))
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
        }
        dockdo_btn.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
        }

    }
}