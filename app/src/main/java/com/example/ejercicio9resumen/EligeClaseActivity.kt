package com.example.ejercicio9resumen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.example.ejercicio9resumen.databinding.EligeClaseActividadBinding


class EligeClaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = EligeClaseActividadBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.imageView.setImageResource(R.drawable.inicio)

        binding.BtnGuerrero.setOnClickListener {
            binding.imageView.setImageResource(R.drawable.guerrero)
        }

        binding.btnMago.setOnClickListener {
            binding.imageView.setImageResource(R.drawable.mago)
        }

        binding.btnElfo.setOnClickListener {
            binding.imageView.setImageResource(R.drawable.Berserker)
        }

        binding.btnLadron.setOnClickListener {
            binding.imageView.setImageResource(R.drawable.descarga)
        }

        binding.btnAceptar.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            //añadir el tipo seleccionado
            startActivity(intent)
        }


    }
}