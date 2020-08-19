package com.example.calculadorakotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var et1 = findViewById<View>(R.id.et1) as EditText
        var et2 = findViewById<View>(R.id.et2) as EditText
        var tvresultado = findViewById<View>(R.id.tv_resultado) as TextView

        val botonSuma = findViewById<Button>(R.id.bt_suma) as Button
        val botonResta = findViewById<Button>(R.id.bt_resta) as Button

        botonSuma.setOnClickListener(View.OnClickListener {

            var valor1 = et1.text.toString().toInt()
            var valor2 = et2.text.toString().toInt()

            var resultado = valor1 + valor2

            Toast.makeText(this, "El resultado es "+ resultado, Toast.LENGTH_SHORT).show()


        })

        botonResta.setOnClickListener(View.OnClickListener {

            var valor1 = et1.text.toString().toInt()
            var valor2 = et2.text.toString().toInt()

            var resultado = valor1 - valor2

            Toast.makeText(this, "El resultado es "+ resultado, Toast.LENGTH_SHORT).show()


        })
    }





}