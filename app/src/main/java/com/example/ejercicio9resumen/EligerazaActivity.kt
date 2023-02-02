package com.example.ejercicio9resumen


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ejercicio9resumen.databinding.EligerazaActividad2Binding


class EligerazaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = EligerazaActividad2Binding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.imageView.setImageResource(R.drawable.inicio)

        val intent = Intent(this, EligeclaseActivity::class.java)

        binding.BtnElfo.setOnClickListener {
            binding.imageView.setImageResource(R.drawable.elfo)
            intent.putExtra("raza", "elfo")

        }

        binding.BtnEnano.setOnClickListener {
            binding.imageView.setImageResource(R.drawable.enano)
            intent.putExtra("raza", "enano")
        }

        binding.BtnGoblin.setOnClickListener {
            binding.imageView.setImageResource(R.drawable.goblin)
            intent.putExtra("raza", "goblin")
        }

        binding.BtnHumano.setOnClickListener {
            binding.imageView.setImageResource(R.drawable.persona)
            intent.putExtra("raza", "humano")
        }


        binding.btnAceptar.setOnClickListener {
            startActivity(intent)

        }




    }

}

