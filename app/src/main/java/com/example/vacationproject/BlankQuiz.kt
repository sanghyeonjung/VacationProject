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
        val question = arrayListOf<String>("혹돔은 독도 앞바다에 서식하는 가장 큰 물고기이다","2번째 퀴즈"," ")
        val answerSize = 2
        val confirmBtn = findViewById<Button>(R.id.buttonConfirmQuiz)
        var methanText = findViewById<TextView>(R.id.textQuizMain)
        var methanGet = intent.getStringExtra("methan")
        var methan:Int = methanGet!!.toInt()

        var questionText = findViewById<TextView>(R.id.textviewQuestion)
        val intent = Intent(this, QuizStartActivity::class.java)

        var userAnswer = findViewById<EditText>(R.id.edittextNameQuestion)

        var cnt = 0

        questionText.text = question[cnt]
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
                questionText.text = question[cnt]
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
                questionText.text = question[cnt]
                methanText.text = methan.toString()
            }
        }

    }
}