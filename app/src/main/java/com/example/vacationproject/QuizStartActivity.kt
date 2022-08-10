package com.example.vacationproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView

class QuizStartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_start)
        val quizStartBtn = findViewById<Button>(R.id.buttonQuizStartQuizStart)
        val goHomeBtn = findViewById<ImageButton>(R.id.imagebuttonBackQuizStart)
        var methanNow = findViewById<TextView>(R.id.textviewMethanQuizStart)
        if(intent.hasExtra("methan")){
            methanNow.text = intent.getStringExtra("methan")
        }
        quizStartBtn.setOnClickListener{
            startActivity(Intent(this@QuizStartActivity,YesNoQuiz::class.java))
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
        }
        goHomeBtn.setOnClickListener{
            startActivity(Intent(this@QuizStartActivity,MainActivity::class.java))
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
        }

    }
}