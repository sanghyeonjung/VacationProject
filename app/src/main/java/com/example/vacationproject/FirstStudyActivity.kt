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
        }
        whiteFish.setOnClickListener{
            startActivity(Intent(this@FirstStudyActivity,DetailWhiteFish::class.java))
        }
        whiteSlime.setOnClickListener{
            startActivity(Intent(this@FirstStudyActivity,DetailWhiteSlime::class.java))
        }
        hair.setOnClickListener{
            startActivity(Intent(this@FirstStudyActivity,DetailHair::class.java))
        }
    }
}