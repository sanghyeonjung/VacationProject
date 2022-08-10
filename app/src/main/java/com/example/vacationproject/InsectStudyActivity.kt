package com.example.vacationproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class InsectStudyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_insect_study)

        val bird1 = findViewById<ImageButton>(R.id.buttonBird1)
        val bird2 = findViewById<ImageButton>(R.id.buttonBird2)
        val bird3 = findViewById<ImageButton>(R.id.buttonBird3)
        val bird4 = findViewById<ImageButton>(R.id.buttonBird4)
        val slideLeft = findViewById<ImageButton>(R.id.slideBtnLeft)
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


        bird1.setOnClickListener{
            startActivity(Intent(this@InsectStudyActivity,DetailPlant::class.java))
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
        }
        bird2.setOnClickListener{
            startActivity(Intent(this@InsectStudyActivity,DetailPlant2::class.java))
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
        }
        bird3.setOnClickListener{
            startActivity(Intent(this@InsectStudyActivity,DetailPlant3::class.java))
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
        }
        bird4.setOnClickListener{
            startActivity(Intent(this@InsectStudyActivity,DetailPlant4::class.java))
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
        }

        back_btn.setOnClickListener{
            startActivity(Intent(this@InsectStudyActivity,MainActivity::class.java))
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
        }

        slideLeft.setOnClickListener{
            startActivity(Intent(this@InsectStudyActivity,BirdStudyActivity::class.java))
            overridePendingTransition(R.anim.slide_left_enter, R.anim.slide_left_exit)
        }



    }
}