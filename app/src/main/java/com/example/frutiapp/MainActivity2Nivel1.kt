package com.example.frutiapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main_activity2_nivel1.*

class MainActivity2Nivel1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activity2_nivel1)

        val intent = intent
        val name = intent.getStringExtra("Clave")
        textViewNombre.text = name

    }
}