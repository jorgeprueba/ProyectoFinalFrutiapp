package com.example.frutiapp

import android.media.MediaPlayer
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var numeroAleatorio = ((Math.random() * 10) + 1).toInt()
    lateinit var mp : MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Metodo para motrar el icono en el acctionbar
        supportActionBar?.setDisplayShowHomeEnabled(true)
        supportActionBar?.setIcon(R.mipmap.ic_launcher)

        //Metodo para que la imagen del MainActivity se aleatoria

        val id: Int

        if (numeroAleatorio == 0 || numeroAleatorio == 10) {
            id = resources.getIdentifier("mango", "drawable", packageName)
            imageViewPersonaje.setImageResource(id)
        } else
            if (numeroAleatorio == 1 || numeroAleatorio == 9) {
                id = resources.getIdentifier("fresa", "drawable", packageName)
                imageViewPersonaje.setImageResource(id)
            } else
                if (numeroAleatorio == 2 || numeroAleatorio == 8) {
                    id = resources.getIdentifier("manzana", "drawable", packageName)
                    imageViewPersonaje.setImageResource(id)
                } else
                    if (numeroAleatorio == 3 || numeroAleatorio == 7) {
                        id = resources.getIdentifier("sandia", "drawable", packageName)
                        imageViewPersonaje.setImageResource(id)
                    } else
                        if (numeroAleatorio == 4 || numeroAleatorio == 5 || numeroAleatorio == 6) {
                            id = resources.getIdentifier("uva", "drawable", packageName)
                            imageViewPersonaje.setImageResource(id)
                        }
// Metodo para iniciar cancion de bienvenida
        mp = MediaPlayer.create(this , R.raw.alphabet_song)
        mp.start()
        mp.isLooping
    }
// Metodo para que el usuario ingrese el nombre e inicie el juego
    fun onButtonClicked(view: View) {
        var nombre = editTextName.text.toString()

    }

}
