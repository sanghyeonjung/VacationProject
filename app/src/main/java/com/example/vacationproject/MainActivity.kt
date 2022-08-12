package com.example.vacationproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.vacationproject.DetailBird.DetailBird1
import com.example.vacationproject.DetailFish.DetailRedFish
import com.example.vacationproject.DetailPlant.DetailPlant
import com.example.vacationproject.Quiz.QuizStartActivity
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val ocean1 = findViewById<ConstraintLayout>(R.id.layoutFirstStudyMain)
        val ocean2 = findViewById<ConstraintLayout>(R.id.layoutSecondStudyMain)
        val quizBtn = findViewById<ConstraintLayout>(R.id.layoutQuizMain)
        val dockdo = findViewById<ImageButton>(R.id.layoutDokdo)
        val sky = findViewById<ImageButton>(R.id.skyBtn)
        val methanNow = findViewById<TextView>(R.id.textQuizMain)
        val db = Firebase.firestore
        db.collection("user")
            .document(UtilCode.getInstance().uid!!)
            .get()
            .addOnSuccessListener { it ->
                methanNow.text = it.data!!.get("score").toString()
            }

        ocean1.setOnClickListener{
            startActivity(Intent(this@MainActivity, DetailRedFish::class.java))
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
        }
        ocean2.setOnClickListener{
            startActivity(Intent(this@MainActivity, DetailRedFish::class.java))
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
        }
        quizBtn.setOnClickListener{
            startActivity(Intent(this@MainActivity, QuizStartActivity::class.java))
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
        }
        dockdo.setOnClickListener{
            startActivity(Intent(this@MainActivity, DetailPlant::class.java))
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
        }
        sky.setOnClickListener{
            startActivity(Intent(this@MainActivity, DetailBird1::class.java))
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
        }
    }
}