package com.example.vacationproject

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val nextBtn = findViewById<TextView>(R.id.layoutFirstStudyTextButtonMain)
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

        nextBtn.setOnClickListener{
            startActivity(Intent(this@MainActivity,DetailRedFish::class.java))
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
        }
        quizBtn.setOnClickListener{
            startActivity(Intent(this@MainActivity,QuizStartActivity::class.java))
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
        }
        dockdo.setOnClickListener{
            startActivity(Intent(this@MainActivity,DetailPlant::class.java))
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
        }
        sky.setOnClickListener{
            startActivity(Intent(this@MainActivity,DetailBird1::class.java))
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
        }
    }
}