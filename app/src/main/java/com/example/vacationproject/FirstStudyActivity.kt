package com.example.vacationproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class FirstStudyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_study)
        val redFish = findViewById<ImageButton>(R.id.buttonRedFishStudyActivity)
        val whiteFish = findViewById<ImageButton>(R.id.buttonWhiteFishStudyActivity)
        val whiteSlime= findViewById<ImageButton>(R.id.buttonWhiteSlimeStudyActivity)
        val hair = findViewById<ImageButton>(R.id.buttonHairStudyActivity)

        redFish.setOnClickListener{
            startActivity(Intent(this@FirstStudyActivity,DetailRedFish::class.java))
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
        }
        whiteFish.setOnClickListener{
            startActivity(Intent(this@FirstStudyActivity,DetailWhiteFish::class.java))
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
        }
        whiteSlime.setOnClickListener{
            startActivity(Intent(this@FirstStudyActivity,DetailWhiteSlime::class.java))
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
        }
        hair.setOnClickListener{
            startActivity(Intent(this@FirstStudyActivity,DetailHair::class.java))
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
        }
    }
}