package com.example.vacationproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val nextBtn = findViewById<TextView>(R.id.layoutFirstStudyTextButtonMain)
        val quizBtn = findViewById<ConstraintLayout>(R.id.layoutQuizMain)
        val dockdo = findViewById<ImageButton>(R.id.layoutDokdo)
        nextBtn.setOnClickListener{
            startActivity(Intent(this@MainActivity,FirstStudyActivity::class.java))
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
        }
        quizBtn.setOnClickListener{
            startActivity(Intent(this@MainActivity,YesNoQuiz::class.java))
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
        }
        dockdo.setOnClickListener{
            startActivity(Intent(this@MainActivity,PlantStudyActivity::class.java))
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
        }
    }
}