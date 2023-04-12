package com.example.newproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText


class MainActivity : AppCompatActivity() {

    lateinit var edttext: EditText;
    override fun onCreate(savedInstanceState: Bundle?)  {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btn : Button = findViewById(R.id.button1)
        edttext = findViewById(R.id.text2)
        btn.setOnClickListener{
            birthdaycard(it)
        }

    }
    fun birthdaycard(view: View) {
    val name=edttext.editableText.toString()
        val intent= Intent(this, birthdatgreet::class.java)
        intent.putExtra("name",edttext.text.toString())

        startActivity(intent)
    }

}