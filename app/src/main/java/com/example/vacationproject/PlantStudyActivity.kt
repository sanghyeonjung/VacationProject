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

class PlantStudyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plant_study)
        val plant1 = findViewById<ImageButton>(R.id.buttonPlant1)
        val plant2 = findViewById<ImageButton>(R.id.buttonPlant2)
        val plant3 = findViewById<ImageButton>(R.id.buttonPlant3)
        val plant4 = findViewById<ImageButton>(R.id.buttonPlant4)
        val back_btn = findViewById<ImageButton>(R.id.backButtonPlantStudyActivity)
//        val dialog = GuideDialog(this)
//        dialog.show()

//        val mDialogView = LayoutInflater.from(this).inflate(R.layout.custom_dialog,null)
//        val mBuilder = AlertDialog.Builder(this)
//            .setView(mDialogView)
//        val mAlertDialog = mBuilder.show()
//        val CancelBtn = mDialogView.findViewById<Button>(R.id.dialogCancelButton)
//        CancelBtn.setOnClickListener{
//            mAlertDialog.dismiss()
//        }


        plant1.setOnClickListener{
            startActivity(Intent(this@PlantStudyActivity,DetailPlant::class.java))
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
        }
        plant2.setOnClickListener{
            startActivity(Intent(this@PlantStudyActivity,DetailPlant2::class.java))
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
        }
        plant3.setOnClickListener{
            startActivity(Intent(this@PlantStudyActivity,DetailPlant3::class.java))
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
        }
        plant4.setOnClickListener{
            startActivity(Intent(this@PlantStudyActivity,DetailPlant4::class.java))
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
        }

        back_btn.setOnClickListener{
            startActivity(Intent(this@PlantStudyActivity,MainActivity::class.java))
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
        }
    }
}