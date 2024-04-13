package com.example.app10

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.ComponentActivity
import com.example.app10.databinding.ActivitySplashScreenBinding

class SplashScreenActivity : ComponentActivity() {

    private lateinit var binding: ActivitySplashScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        Handler(Looper.getMainLooper()).postDelayed({

            val i = intent
            val j = Intent(this, DadosPedidoActivity::class.java)
            j.putExtras(i)
            startActivity(j)
            finish()
        }, 2000)

    }
}