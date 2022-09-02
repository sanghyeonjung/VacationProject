package com.example.vacationproject

import android.app.Dialog
import android.content.Context
import android.widget.Button

class ShowDialog (context: Context) {
    private val dialog = Dialog(context)

    fun showDia() {
        dialog.setContentView(R.layout.custom_dialog)
        dialog.show()

        val button = dialog.findViewById<Button>(R.id.dialogCancelButton)
        button.setOnClickListener{
            dialog.dismiss()
        }
    }
    interface ButtonClickListener{
        fun onClicked(text: String)
    }

    private lateinit var onClickListener: ButtonClickListener

    fun setOnClickListener(listener: ButtonClickListener){
        onClickListener = listener
    }
}