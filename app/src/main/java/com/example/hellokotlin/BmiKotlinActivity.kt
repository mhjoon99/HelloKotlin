package com.example.hellokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.lang.Exception

class BmiKotlinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_view_binding)

        val heightField = findViewById<EditText>(R.id.heightField)
        val weightField = findViewById<EditText>(R.id.weightField)
        val btnBmi = findViewById<Button>(R.id.btnBmi)
        val txtResult = findViewById<TextView>(R.id.txtResult)

        btnBmi.setOnClickListener {
//            val height = heightField.getText().toString().toDouble()
//            val weight = weightField.getText().toString().toDouble()
            val sHeight = heightField.getText().toString()
            val sWeight = weightField.getText().toString()
//            try{
//                val bmi  = sWeight.toDouble() / Math.pow(sHeight.toDouble() / 100.0, 2.0)
//                txtResult.setText("Your BMI = " + bmi)
//            }catch (e : Exception) {
//                txtResult.setText("Input(s) missing")
//            }
            if(!sHeight.equals("") && !sWeight.equals("")) {
                val bmi  = sWeight.toDouble() / Math.pow(sHeight.toDouble() / 100.0, 2.0)
                txtResult.setText("Your BMI = " + bmi)
            }else {
                txtResult.setText("Input(s) missing")
            }
        }
    }
}