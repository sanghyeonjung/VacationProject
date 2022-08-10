package com.example.vacationproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class DetailWhiteSlime : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_white_slime)

        val dockdo_btn = findViewById<Button>(R.id.buttonDokdoDetailWhiteSlime)
        val next_btn = findViewById<ImageButton>(R.id.nextBtn)

        next_btn.setOnClickListener{
            startActivity(Intent(this,DetailHair::class.java))
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
        }
        dockdo_btn.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
        }

    }
}