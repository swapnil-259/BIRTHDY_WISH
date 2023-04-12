package com.example.newproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class birthdatgreet : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthdatgreet)

        val secText = findViewById<TextView>(R.id.text23)

        val intentValue = intent.getStringExtra("name")
        secText.setText(intentValue)
    }
}