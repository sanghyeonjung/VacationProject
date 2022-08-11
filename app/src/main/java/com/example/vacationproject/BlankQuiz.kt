package com.example.vacationproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.lang.NumberFormatException

class BlankQuiz : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_blank_quiz)
        val answer = arrayListOf<String>("흑돔","2번째"," ")
        val answerSize = 2
        val confirmBtn = findViewById<Button>(R.id.buttonConfirmQuiz)
        var methanText = findViewById<TextView>(R.id.textQuizMain)
        var methanGet = intent.getStringExtra("methan")
        var methan:Int = methanGet!!.toInt()

        val intent = Intent(this, QuizStartActivity::class.java)

        var userAnswer = findViewById<EditText>(R.id.edittextNameQuestion)

        var cnt = 0

        methanText.text = methan.toString()

        confirmBtn.setOnClickListener{
            if(answer[cnt] == userAnswer.text.toString())
            {
                Toast.makeText(this,"정답입니다!", Toast.LENGTH_SHORT).show()
                methan++
                cnt++
                if(cnt == answerSize)
                {
                    intent.putExtra("methan","$methan")
                    startActivity(intent)
                    overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
                }
                methanText.text = methan.toString()
            }
            else
            {
                Toast.makeText(this,"오답입니다!", Toast.LENGTH_SHORT).show()
                cnt++
                if(cnt == answerSize)
                {
                    intent.putExtra("methan","$methan")
                    startActivity(intent)
                    overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
                }
                methanText.text = methan.toString()
            }
        }

    }
}