package com.example.ejercicio9resumen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ejercicio9resumen.databinding.EligeclaseActividad2Binding
import com.example.ejercicio9resumen.databinding.EligerazaActividad2Binding


class EligeclaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = EligeclaseActividad2Binding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.imageView.setImageResource(R.drawable.inicio)

        binding.BtnGuerrero.setOnClickListener {
            binding.imageView.setImageResource(R.drawable.guerrero)
            binding.BtnGuerrero.isPressed
        }

        binding.btnMago.setOnClickListener {
            binding.imageView.setImageResource(R.drawable.mago)
            binding.btnMago.isPressed
        }

        binding.berserker.setOnClickListener {
            binding.imageView.setImageResource(R.drawable.berserker)
            binding.berserker.isPressed
        }

        binding.btnLadron.setOnClickListener {
            binding.imageView.setImageResource(R.drawable.descarga)
            binding.btnLadron.isPressed
        }

        binding.btnAceptar.setOnClickListener {
            val intent = Intent(this, ResumenActivity::class.java)

            if (binding.BtnGuerrero.isPressed) {
                intent.putExtra("clase", "Guerrero")
            } else if (binding.btnMago.isPressed) {
                intent.putExtra("clase", "Mago")
            } else if (binding.berserker.isPressed) {
                intent.putExtra("clase", "berserker")
            } else if (binding.btnLadron.isPressed) {
                intent.putExtra("clase", "Ladron")
            }
            startActivity(intent)
        }


    }


}

