package com.example.aplicaciondeclase

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class Activity2 : AppCompatActivity() {
    //Declaración de variables
    var contador = 0
    lateinit var btnIncrementar:Button
    lateinit var btnDecrementar:Button
    lateinit var tvContador:TextView
    //Variables deboton de home
    lateinit var botonInicio2:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        //Inicialización de las variables
        btnIncrementar = findViewById(R.id.btnIncrementar)
        tvContador = findViewById(R.id.tvNumero)

        btnIncrementar.setOnClickListener {
            contador++
            tvContador.text = "$contador"
        }
        //Inicialiamos var de decender
        btnDecrementar = findViewById(R.id.btnDecrementar)
        tvContador = findViewById(R.id.tvNumero)

        btnDecrementar.setOnClickListener {
            contador--
            tvContador.text = "$contador"
        }

        //Vars inicializadas de el mismo boton de inicio
        botonInicio2 = findViewById(R.id.buttonBackHome2)

        botonInicio2.setOnClickListener(View.OnClickListener {
            var miIntent2 = Intent(this,MainActivity::class.java)
            startActivity(miIntent2)

        })
    }
}