package com.example.vacationproject.Quiz

import android.app.Dialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.vacationproject.*
import com.google.firebase.firestore.FirebaseFirestore

class QuizStartActivity : AppCompatActivity() {
    val db = FirebaseFirestore.getInstance()
    val scoreList = arrayListOf<DataScoreBoard>()
    val adapter = RecyclerViewAdapter(scoreList)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_start)
        val quizStartBtn = findViewById<Button>(R.id.buttonQuizStartQuizStart)
        val goHomeBtn = findViewById<ImageButton>(R.id.imagebuttonBackQuizStart)
        var methanNow = findViewById<TextView>(R.id.textviewMethanQuizStart)
        val recyclerview = findViewById<RecyclerView>(R.id.recyclerViewScoreBoardQuizStart)

        val dialog = GuideDialog(this)
        dialog.show()

        recyclerview.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        recyclerview.adapter = adapter

        db.collection("user")
            .document(UtilCode.getInstance().uid!!)
            .get()
            .addOnSuccessListener { it ->
                methanNow.text = it.data!!.get("score").toString()
            }
            db.collection("user")
                .get()
                .addOnSuccessListener { result ->
                    scoreList.clear()
                    for(document in result){
                        val item = DataScoreBoard(document["id"] as String? ?: "-1", document["score"] as String? ?: "-1")
                        scoreList.add(item)
                    }
                    scoreList.sortByDescending { it.score }
                    adapter.notifyDataSetChanged()
                }.addOnFailureListener { exception ->
                    // 실패할 경우
                    Log.e("MainActivity", "Error getting documents: $exception")
                }



        if(intent.hasExtra("methan")){
            db.collection("user")
                .document(UtilCode.getInstance().uid!!)
                .update(mapOf("score" to intent.getStringExtra("methan")))
        }
        quizStartBtn.setOnClickListener{
            startActivity(Intent(this@QuizStartActivity, YesNoQuiz::class.java))
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
        }
        goHomeBtn.setOnClickListener{
            startActivity(Intent(this@QuizStartActivity, MainActivity::class.java))
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
        }

    }
}