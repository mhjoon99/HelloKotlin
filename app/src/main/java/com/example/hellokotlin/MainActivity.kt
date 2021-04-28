package com.example.hellokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //var btnHello : Button   //var->일반적인 변수   val->값이 정해져 있음 ==const, final
        val btnHello = findViewById<Button>(R.id.btnHello)
        //btnHello = findViewById(R.id.btnHello)
        btnHello.setOnClickListener {
            Toast.makeText(this@MainActivity, "Hello Kotlin", Toast.LENGTH_LONG).show()
        }
    }
}