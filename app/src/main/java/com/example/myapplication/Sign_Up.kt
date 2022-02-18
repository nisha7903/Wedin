package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Sign_Up : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        supportActionBar?.hide()
        val login = findViewById<Button>(R.id.sign_in)
        val account = findViewById<Button>(R.id.account)
        account.setOnClickListener {
            val intent = Intent(this@Sign_Up, CreateAccount::class.java)
            startActivity(intent)
            finish()
        }
        login.setOnClickListener {
            val intent = Intent(this@Sign_Up, SignIn::class.java)
            startActivity(intent)
            finish()
        }
    }
}