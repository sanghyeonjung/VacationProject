package com.example.vacationproject.Quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.example.vacationproject.R

class YesNoQuiz : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yes_no_quiz)
        val answer = arrayListOf<Boolean>(true,false,false,false,true)//마지막값은 더미 데이터
        val questionName = arrayListOf<String>(
            "사철나무"
            ,"검정배줄벼룩잎벌레"
            ,"괭이갈매기"
            ,"예쁜이갯민숭이"
            ,"")
        val question = arrayListOf<String>(
            "키가 3~5m쯤 되며 생울타리로 많이 심어 기르며 추위와 공해에 강한 나무"
            ,"보편적으로 적갈색이고 위날개에 다수 불규칙한 흑색의 무늬를 가지고 있다."
            ,"괭이갈매기는 국내에서 가장 희귀한 종이다."
            ,"예쁜이 갯민숭이는 독도바다의 초식동물로 독도를 포함하여 난류의 영향을 받는 비교적 고수온 해역에서 주로 서식한다."
            ,"")

        val imageList = arrayListOf<Int>(
            R.drawable.ic_plant,
            R.drawable.ic_insect1,
            R.drawable.ic_bird3,
            R.drawable.ic_whiteslime,
            0
        )
        val answerSize = 3

        val intent = Intent(this, BlankQuiz::class.java)

        val yesBtn = findViewById<ImageButton>(R.id.imageButtonYesQuiz)
        val noBtn = findViewById<ImageButton>(R.id.imageButtonNoQuiz)
        var methanText = findViewById<TextView>(R.id.textQuizMain)
        var questionText = findViewById<TextView>(R.id.textviewQuestion)
        val imageView = findViewById<ImageView>(R.id.imageviewQuestion)
        val questionNameText = findViewById<TextView>(R.id.textviewNameQuestion)


        var methan = 0
        var cnt = 0
            yesBtn.setOnClickListener{
                if(answer[cnt] == true)
                {
                    Toast.makeText(this@YesNoQuiz,"정답입니다!",Toast.LENGTH_SHORT).show()
                    if(cnt == answerSize)
                    {
                        methan++
                        intent.putExtra("methan","$methan")
                        startActivity(intent)
                        overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
                    }
                    else
                    {
                        methan++
                        cnt++
                        questionText.text = question[cnt]
                        methanText.text = methan.toString()
                        imageView.setImageResource(imageList[cnt])
                        questionNameText.text = questionName[cnt]
                    }
                }
                else
                {
                    Toast.makeText(this@YesNoQuiz,"오답입니다!",Toast.LENGTH_SHORT).show()
                    if(cnt == answerSize)
                    {
                        intent.putExtra("methan","$methan")
                        startActivity(intent)
                        overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
                    }
                    else
                    {
                        cnt++
                        questionText.text = question[cnt]
                        methanText.text = methan.toString()
                        imageView.setImageResource(imageList[cnt])
                        questionNameText.text = questionName[cnt]
                    }
                }
            }
            noBtn.setOnClickListener{
                if(answer[cnt] == false)
                {
                    Toast.makeText(this@YesNoQuiz,"정답입니다!",Toast.LENGTH_SHORT).show()
                    if(cnt == answerSize)
                    {
                        intent.putExtra("methan","$methan")
                        startActivity(intent)
                        overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
                    }
                    else
                    {
                        methan++
                        cnt++
                        questionText.text = question[cnt]
                        methanText.text = methan.toString()
                        imageView.setImageResource(imageList[cnt])
                        questionNameText.text = questionName[cnt]
                    }
                }
                else
                {
                    Toast.makeText(this@YesNoQuiz,"오답입니다!",Toast.LENGTH_SHORT).show()
                    if(cnt == answerSize)
                    {
                        intent.putExtra("methan","$methan")
                        startActivity(intent)
                        overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
                    }
                    else
                    {
                        cnt++
                        questionText.text = question[cnt]
                        methanText.text = methan.toString()
                        imageView.setImageResource(imageList[cnt])
                        questionNameText.text = questionName[cnt]
                    }}
            }
    }
}