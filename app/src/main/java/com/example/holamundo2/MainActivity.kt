package com.example.holamundo2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        startActivity(Intent(this,Pantalla_2::class.java))

        val button: Button = findViewById(R.id.btnIntentToPantalla_2)
        button.setOnClickListener { startActivity(Intent (this,Pantalla_2::class.java)) }

    }
}