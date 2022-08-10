package com.example.vacationproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    var auth: FirebaseAuth = FirebaseAuth.getInstance()
    private val emailEditText: EditText by lazy { findViewById<EditText>(R.id.emailEditText) }
    private val passwordEditText: EditText by lazy { findViewById<EditText>(R.id.passwordEditText) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val signInBtn = findViewById<Button>(R.id.signInButton)
        val signUpBtn = findViewById<Button>(R.id.signUpButton)
        signInBtn.setOnClickListener {
            loginEmail()
        }
        signUpBtn.setOnClickListener {
            createEmail()
        }
    }

    private fun createEmail() {
        auth!!.createUserWithEmailAndPassword(
            emailEditText.text.toString().trim(),
            passwordEditText.text.toString().trim()
        )
            .addOnCompleteListener(this) {
                if (it.isSuccessful) {
                    val user = auth?.currentUser
                    Toast.makeText(this, "Authentication success.", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(
                        this,
                        "Authentication failed.${it.exception}",
                        Toast.LENGTH_SHORT
                    ).show()
                    Log.e("sign in : ", "${it.exception}")
                }
            }
    }

    private fun loginEmail() {
        auth!!.signInWithEmailAndPassword(
            emailEditText.text.toString().trim(),
            passwordEditText.text.toString().trim()
        )
            .addOnCompleteListener(this) {
                if (it.isSuccessful) {
                    Toast.makeText(this, "signInWithEmail success.", Toast.LENGTH_SHORT).show()
                    val user = auth?.currentUser
                    startActivity(Intent(this@LoginActivity, SplashActivity::class.java))
                    overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
                } else {
                    Toast.makeText(this, "signInWithEmail failed", Toast.LENGTH_SHORT).show()
                }
            }
    }
}