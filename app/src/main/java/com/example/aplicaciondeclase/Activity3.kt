package com.example.aplicaciondeclase

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Activity3 : AppCompatActivity() {
    lateinit var botonInicio:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)

        //inicializar las variables
        botonInicio = findViewById(R.id.buttonBackHome)

        //usamos las vars
        botonInicio.setOnClickListener(View.OnClickListener {
            var myIntento = Intent(this,MainActivity::class.java)
            startActivity(myIntento)

        })

    }
}