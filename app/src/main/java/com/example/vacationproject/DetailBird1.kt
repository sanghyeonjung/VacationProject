package com.example.vacationproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class DetailBird1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_bird1)

        val dockdo_btn = findViewById<Button>(R.id.buttonDokdoDetailPlant)
        val nextBtn = findViewById<ImageButton>(R.id.nextBtn)

        dockdo_btn.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
        }


        nextBtn.setOnClickListener{
            startActivity(Intent(this,DetailBird2::class.java))
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
        }

    }
}