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

        binding.BtnElfo.setOnClickListener {
            binding.imageView.setImageResource(R.drawable.elfo)
            binding.BtnElfo.isPressed
        }


        binding.BtnEnano.setOnClickListener {
            binding.imageView.setImageResource(R.drawable.enano)
            binding.BtnEnano.isPressed
        }

        binding.BtnGoblin.setOnClickListener {
            binding.imageView.setImageResource(R.drawable.goblin)
            binding.BtnGoblin.isPressed
        }

        binding.BtnHumano.setOnClickListener {
            binding.imageView.setImageResource(R.drawable.persona)
            binding.BtnHumano.isPressed
        }

        binding.btnAceptar.setOnClickListener {
            val intent = Intent(this, ResumenActivity::class.java)
            val intent2 = Intent(this, EligeclaseActivity::class.java)
            if (binding.BtnElfo.isPressed) {
                intent.putExtra("raza", "Elfo")
            } else if (binding.BtnEnano.isPressed) {
                intent.putExtra("raza", "Enano")
            } else if (binding.BtnGoblin.isPressed) {
                intent.putExtra("raza", "Goblin")
            } else if (binding.BtnHumano.isPressed) {
                intent.putExtra("raza", "Humano")
            }
            startActivity(intent2)
        }





    }

}

