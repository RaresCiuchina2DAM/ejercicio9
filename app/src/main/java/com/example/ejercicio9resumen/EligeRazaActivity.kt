package com.example.ejercicio9resumen

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.graphics.drawable.DrawableCompat.setTint
import com.example.ejercicio9resumen.databinding.EligeRazaActividadBinding



class EligeRazaActivity : AppCompatActivity() {
    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = EligeRazaActividadBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.imageView.setImageResource(R.drawable.inicio)

        binding.BtnElfo.setOnClickListener() {
            binding.imageView.setImageResource(R.drawable.elfo)

        }

        binding.BtnEnano.setOnClickListener {
            binding.imageView.setImageResource(R.drawable.enano)



        }
        binding.BtnGoblin.setOnClickListener {
            binding.imageView.setImageResource(R.drawable.goblin)

        }

        binding.BtnHumano.setOnClickListener {
            binding.imageView.setImageResource(R.drawable.persona)

        }

        binding.btnAceptar.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            //añadir el tipo seleccionado
            startActivity(intent)
        }





    }

}

