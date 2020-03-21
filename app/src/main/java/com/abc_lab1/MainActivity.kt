package com.abc_lab1

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //prueba de git
    }

    fun sendMessage(view: View?) {
        val intent = Intent(this, MessageActivity::class.java)
        val editText = findViewById<EditText>(R.id.text_message)
        intent.putExtra("MESSAGE", editText.text.toString())
        startActivity(intent)
    }
}