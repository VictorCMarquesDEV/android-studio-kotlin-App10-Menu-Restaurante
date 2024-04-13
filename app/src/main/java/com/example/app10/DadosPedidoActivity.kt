package com.example.app10

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.app10.databinding.ActivityDadosPedidoBinding

class DadosPedidoActivity : ComponentActivity() {

    private lateinit var binding: ActivityDadosPedidoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityDadosPedidoBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val i = intent

        val qtd_cafe = i.getStringExtra("qtd_cafe").toString().toInt()
        val qtd_biscoito = i.getStringExtra("qtd_biscoito").toString().toInt()
        val qtd_choco = i.getStringExtra("qtd_choco").toString().toInt()

        val preco_cafe = i.getDoubleExtra("preco_cafe", 0.0)
        val preco_biscoito = i.getDoubleExtra("preco_biscoito", 0.0)
        val preco_choco = i.getDoubleExtra("preco_choco", 0.0)

        val resumo = (qtd_cafe * preco_cafe) + (qtd_biscoito * preco_biscoito) + (qtd_choco * preco_choco)

        binding.textCafe.text = "Café:      ${qtd_cafe}x R$${preco_cafe} = ${preco_cafe * qtd_cafe}"
        binding.textBiscoito.text = "Biscoito:  ${qtd_biscoito}x R$${preco_biscoito} = ${qtd_biscoito * preco_biscoito}"
        binding.textChoco.text = "Chocolate: ${qtd_choco}x R$${preco_choco} = ${qtd_choco * preco_choco}"
        binding.textResumo.text = "Valor Total do seu pedido: R$${resumo}"

        binding.buttonVoltar.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}