package com.example.vacationproject.DetailPlant

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import com.example.vacationproject.MainActivity
import com.example.vacationproject.R

class DetailPlant3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_plant3)

        val dockdo_btn = findViewById<Button>(R.id.buttonDokdoDetailPlant)
        val nextBtn = findViewById<ImageButton>(R.id.nextBtn)

        dockdo_btn.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
        }


        nextBtn.setOnClickListener{
            startActivity(Intent(this, DetailPlant4::class.java))
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
        }
    }
}