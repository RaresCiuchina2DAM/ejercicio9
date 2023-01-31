package com.example.ejercicio9resumen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ejercicio9resumen.R.drawable.enano
import com.example.ejercicio9resumen.databinding.ActivityResumenBinding
import kotlin.toString as toString


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


        val clase = intent.getStringExtra("clase")
        val raza = intent.getStringExtra("raza")

        //Cuando la clase pasada por el intent sea humano, asignar al Imageview la imagen de persona

        when (clase.toString()) {
            "Ladron" -> {
                binding.ImagenClase.setImageResource(R.drawable.descarga)
            }
            "Mago" -> {
                binding.ImagenClase.setImageResource(R.drawable.mago)
            }
            "Guerrero" -> {
                binding.ImagenClase.setImageResource(R.drawable.guerrero)
            }
            "berserker" -> {
                binding.ImagenClase.setImageResource(R.drawable.berserker)
            }
        }


        //Cuando la raza pasada por el intent sea humano, asignar al Imageview la imagen de persona
        when (raza.toString()) {
            "Humano" -> {
                binding.btnRaza.setImageResource(R.drawable.persona)
            }
            "Elfo" -> {
                binding.btnRaza.setImageResource(R.drawable.elfo)
            }
            "Enano" -> {
                binding.btnRaza.setImageResource(enano)
            }
            "Goblin" -> {
                binding.btnRaza.setImageResource(R.drawable.goblin)
            }
        }


        //Cada vez que se pulsa el boton asignar, se asigna el nombre que se ha introducido en el edittext
        binding.btnAsignar.setOnClickListener {

            binding.MostrarNombreAsignado.text = binding.EtNombre.text

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