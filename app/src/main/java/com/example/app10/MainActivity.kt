package com.example.app10

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import com.example.app10.databinding.ActivityMainBinding

// App10: Menu de Restaurante

class MainActivity : ComponentActivity() {

    private lateinit var binding: ActivityMainBinding
    private val precoCafe = 5.00
    private val precoBiscoito = 2.50
    private val precoChoco = 10.00

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonPedido.setOnClickListener {
            val i = Intent(this, SplashScreenActivity::class.java)

            i.putExtra("qtd_cafe", binding.editQtdCafe.text.toString())
            i.putExtra("qtd_biscoito", binding.editQtdBiscoito.text.toString())
            i.putExtra("qtd_choco", binding.editQtdChoco.text.toString())

            i.putExtra("preco_cafe", precoCafe)
            i.putExtra("preco_biscoito", precoBiscoito)
            i.putExtra("preco_choco", precoChoco)

            startActivity(i)
        }

        binding.checkCafe.setOnClickListener {
            if (binding.checkCafe.isChecked){
                binding.editQtdCafe.setText("1")
                binding.textPrecoCafe.visibility = View.VISIBLE
            } else {
                binding.editQtdCafe.setText("0")
                binding.textPrecoCafe.visibility = View.GONE
            }
        }

        binding.checkBiscoito.setOnClickListener {
            if (binding.checkBiscoito.isChecked){
                binding.editQtdBiscoito.setText("1")
                binding.textPrecoBiscoito.visibility = View.VISIBLE
            } else {
                binding.editQtdBiscoito.setText("0")
                binding.textPrecoBiscoito.visibility = View.GONE
            }
        }

        binding.checkChoco.setOnClickListener {
            if (binding.checkChoco.isChecked){
                binding.editQtdChoco.setText("1")
                binding.textPrecoChoco.visibility = View.VISIBLE
            } else {
                binding.editQtdChoco.setText("0")
                binding.textPrecoChoco.visibility = View.GONE
            }
        }

    }
}