package com.example.vacationproject.DetailInsect

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import com.example.vacationproject.MainActivity
import com.example.vacationproject.R

class DetailInsect2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_insect2)

        val dockdo_btn = findViewById<Button>(R.id.buttonDokdoDetailPlant)
        val nextBtn = findViewById<ImageButton>(R.id.nextBtn)

        dockdo_btn.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
        }


        nextBtn.setOnClickListener{
            startActivity(Intent(this, DetailInsect3::class.java))
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
        }

    }
}