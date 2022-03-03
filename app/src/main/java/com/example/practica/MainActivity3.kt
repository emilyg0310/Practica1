package com.example.practica

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val boton1 = findViewById<Button>(R.id.b1)
        boton1.setOnClickListener{
            val pase_vista = Intent(this, MainActivity::class.java)
            startActivity(pase_vista)
        }

        val boton2 = findViewById<Button>(R.id.b2)
        boton2.setOnClickListener{
            val pase_vista = Intent(this, MainActivity2::class.java)
            startActivity(pase_vista)
        }

        val boton3 = findViewById<Button>(R.id.b3)
        boton3.setOnClickListener{
            val pase_vista = Intent(this, MainActivity3::class.java)
            startActivity(pase_vista)
        }

        val boton4 = findViewById<Button>(R.id.b4)
        boton4.setOnClickListener{
            val pase_vista = Intent(this, MainActivity4::class.java)
            startActivity(pase_vista)
        }
    }
}