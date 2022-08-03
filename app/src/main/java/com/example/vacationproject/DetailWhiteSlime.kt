package com.example.vacationproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DetailWhiteSlime : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_white_slime)

        val dockdo_btn = findViewById<Button>(R.id.buttonDokdoDetailWhiteSlime)

        dockdo_btn.setOnClickListener{
            startActivity(Intent(this,FirstStudyActivity::class.java))
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
        }

    }
}