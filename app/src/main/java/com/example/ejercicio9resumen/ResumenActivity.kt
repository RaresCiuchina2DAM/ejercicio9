package com.example.ejercicio9resumen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ejercicio9resumen.databinding.ActivityResumenBinding


val Fuerza = 10..15
    val Defensa = 1..5
    val TamanyoMochila=100
    val Vida = 200
    val Monedero= 0

class ResumenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityResumenBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val clase = intent.getStringExtra("clase").toString()
        val raza = intent.getStringExtra("raza")

        //Cuando la clase pasada por el intent sea humano, asignar al Imageview la imagen de persona

        if (clase == "Ladron") {
            binding.ImagenClase.setImageResource(R.drawable.persona)
        } else if (clase == "Mago") {
            binding.ImagenClase.setImageResource(R.drawable.mago)
        } else if (clase == "Guerrero") {
            binding.ImagenClase.setImageResource(R.drawable.guerrero)
        } else if (clase == "berserker") {
            binding.ImagenClase.setImageResource(R.drawable.berserker)
        }



        //Cada vez que se pulsa el boton asignar, se asigna el valor del edittext al textview
        binding.btnAsignar.setOnClickListener {
            binding.tvNombre.text = binding.MostrarNombreAsignado.text
        }

        binding.tvfuerza.text = Fuerza.random().toString()
        binding.tvdefensa.text = Defensa.random().toString()
        binding.tvtamanyoMochila.text = TamanyoMochila.toString()
        binding.tvvida.text = Vida.toString()
        binding.tvmonedero.text = Monedero.toString()

        binding.button.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        binding.button2.setOnClickListener {
            finish()
        }




    }
}