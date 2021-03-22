package com.example.proyectocompartido

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.proyectocompartido.databinding.ActivityDavidBinding

class ActivityDavid : AppCompatActivity()  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityDavidBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

}