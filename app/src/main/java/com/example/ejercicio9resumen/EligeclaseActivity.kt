package com.example.ejercicio9resumen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ejercicio9resumen.databinding.EligeclaseActividad2Binding


class EligeclaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = EligeclaseActividad2Binding.inflate(layoutInflater)
        setContentView(binding.root)



        val intent = Intent(this, ResumenActivity::class.java)

        val recogeraza = intent.getStringExtra("raza")

        binding.imageView.setImageResource(R.drawable.inicio)

        binding.BtnGuerrero.setOnClickListener {
            binding.imageView.setImageResource(R.drawable.guerrero)
            intent.putExtra("clase", "guerrero")
        }

        binding.btnMago.setOnClickListener {
            binding.imageView.setImageResource(R.drawable.mago)
            intent.putExtra("clase", "mago")

        }

        binding.berserker.setOnClickListener {
            binding.imageView.setImageResource(R.drawable.berserker)
            intent.putExtra("clase", "berserker")
        }

        binding.btnLadron.setOnClickListener {
            binding.imageView.setImageResource(R.drawable.descarga)
            intent.putExtra("clase", "ladron")
        }

        if (recogeraza == "elfo"){
            binding.imageView2.setImageResource(R.drawable.elfo)
        }


        binding.btnAceptar.setOnClickListener {
            intent.putExtra("raza", recogeraza)
            startActivity(intent)
        }


    }


}

