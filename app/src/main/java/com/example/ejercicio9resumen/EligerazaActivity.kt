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





        //Cuando se pulsa el boton aceptar, se envia la raza elegida como texto a la actividad resumen, se cierra esta
        //actividad y se abre la actividad elegir clase

        binding.btnAceptar.setOnClickListener {
            val intent = Intent(this, EligeclaseActivity::class.java)
            val intent2 = Intent(this, ResumenActivity::class.java)
            if (binding.BtnElfo.isPressed) {
                intent2.putExtra("raza", binding.BtnElfo.text)
            } else if (binding.BtnEnano.isPressed) {
                intent2.putExtra("raza", binding.BtnEnano.text)
            } else if (binding.BtnGoblin.isPressed) {
                intent2.putExtra("raza", binding.BtnGoblin.text)
            } else if (binding.BtnHumano.isPressed) {
                intent2.putExtra("raza", binding.BtnHumano.text)
            }

            startActivity(intent)
            finish()
        }




        //Cuando se pulsa el bot

    }

}

