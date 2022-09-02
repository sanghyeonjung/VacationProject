package com.example.vacationproject.Quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.example.vacationproject.R
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class BlankQuiz : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_blank_quiz)
        val imageList = arrayListOf<Int>(
            R.drawable.ic_whiteslime,
            R.drawable.ic_bird2,
            R.drawable.ic_plant_4,
            R.drawable.ic_insect6,
            0
        )
        val answer = arrayListOf<String>("예쁜이갯민숭이","딱새","참나리","소나무무당벌레","")
        val answerSize = 3
        val confirmBtn = findViewById<Button>(R.id.buttonConfirmQuiz)
        var methanText = findViewById<TextView>(R.id.textQuizMain)
        var methanGet = intent.getStringExtra("methan")
        var methan:Int = methanGet!!.toInt()
        val imageView = findViewById<ImageView>(R.id.imageviewQuestion)

        val db = Firebase.firestore

        val intent = Intent(this, QuizStartActivity::class.java)

        var userAnswer = findViewById<EditText>(R.id.edittextNameQuestion)

        var cnt = 0

        methanText.text = methan.toString()

        confirmBtn.setOnClickListener{
            if(answer[cnt] == userAnswer.text.toString())
            {
                Toast.makeText(this,"정답입니다!", Toast.LENGTH_SHORT).show()
                methan++
                if(cnt == answerSize)
                {
                    intent.putExtra("methan","$methan")
                    startActivity(intent)
                    overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
                }
                else{
                    cnt++
                    methanText.text = methan.toString()
                    imageView.setImageResource(imageList[cnt])
                }
            }
            else
            {
                Toast.makeText(this,"오답입니다!", Toast.LENGTH_SHORT).show()
                if(cnt == answerSize)
                {
                    intent.putExtra("methan","$methan")
                    startActivity(intent)
                    overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
                }
                else
                {
                    cnt++
                    methanText.text = methan.toString()
                    imageView.setImageResource(imageList[cnt])
                }
            }
        }

    }
}