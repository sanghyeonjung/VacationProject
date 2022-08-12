package com.example.vacationproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class YesNoQuiz : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yes_no_quiz)
        val answer = arrayListOf<Boolean>(true,false,true)//마지막값은 더미 데이터
        val question = arrayListOf<String>("혹돔은 독도 앞바다에 서식하는 가장 큰 물고기이다","2번째 퀴즈", "")
        val answerSize = 2

        val intent = Intent(this, BlankQuiz::class.java)

        val yesBtn = findViewById<ImageButton>(R.id.imageButtonYesQuiz)
        val noBtn = findViewById<ImageButton>(R.id.imageButtonNoQuiz)
        var methanText = findViewById<TextView>(R.id.textQuizMain)
        var questionText = findViewById<TextView>(R.id.textviewQuestion)


        var methan = 0
        var cnt = 0

            yesBtn.setOnClickListener{
                if(answer[cnt] == true)
                {
                    Toast.makeText(this@YesNoQuiz,"정답입니다!",Toast.LENGTH_SHORT).show()
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
                    Toast.makeText(this@YesNoQuiz,"오답입니다!",Toast.LENGTH_SHORT).show()
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
            noBtn.setOnClickListener{
                if(answer[cnt] == false)
                {
                    Toast.makeText(this@YesNoQuiz,"정답입니다!",Toast.LENGTH_SHORT).show()
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
                    Toast.makeText(this@YesNoQuiz,"오답입니다!",Toast.LENGTH_SHORT).show()
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