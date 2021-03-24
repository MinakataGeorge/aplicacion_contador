package com.example.aplicaciondeclase

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    //Declaración de las variables
    lateinit var primerBoton:Button
    lateinit var segundoBoton:Button
//otro comenatrio
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("mi_app","Estoy en el método onCreate")
        //inicializar las variables
        //explicación git
        primerBoton = findViewById(R.id.primer_boton)
        segundoBoton = findViewById(R.id.segundo_boton)

        //estoy añadiendo un comentario en una nueva rama
        primerBoton.setOnClickListener(View.OnClickListener {
            val miIntent = Intent(this,Activity2::class.java)
            startActivity(miIntent)
        })

        segundoBoton.setOnClickListener {
            val otroIntent = Intent(this,Activity3::class.java)
            startActivity(otroIntent)
        }

    }

    override fun onStart() {
        super.onStart()
        Log.i("mi_app","Estoy en el método onStart")
    }


    override fun onPause() {
        super.onPause()
        Log.i("mi_app","Estoy en el método onPause")
    }


}