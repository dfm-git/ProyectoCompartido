package com.example.proyectocompartido

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.proyectocompartido.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.idboton1.setOnClickListener {
            val intent = Intent(this,ActivityDavid::class.java)
            startActivity(intent)
        }

    }
}