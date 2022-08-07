package com.example.vacationproject

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.Window
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AlertDialog

class FirstStudyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_study)
        val redFish = findViewById<ImageButton>(R.id.buttonRedFishStudyActivity)
        val whiteFish = findViewById<ImageButton>(R.id.buttonWhiteFishStudyActivity)
        val whiteSlime= findViewById<ImageButton>(R.id.buttonWhiteSlimeStudyActivity)
        val hair = findViewById<ImageButton>(R.id.buttonHairStudyActivity)
        val back_btn = findViewById<ImageButton>(R.id.backButtonFirstStudyActivity)

        val mDialogView = LayoutInflater.from(this).inflate(R.layout.custom_dialog,null)
        val mBuilder = AlertDialog.Builder(this)
            .setView(mDialogView)
        val mAlertDialog = mBuilder.show()
        val CancelBtn = mDialogView.findViewById<Button>(R.id.dialogCancelButton)
        CancelBtn.setOnClickListener{
            mAlertDialog.dismiss()
        }


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

        back_btn.setOnClickListener{
            startActivity(Intent(this@FirstStudyActivity,MainActivity::class.java))
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
        }
    }
}