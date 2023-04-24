package com.guilhermereisdev.cotacaocriptomoedas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.guilhermereisdev.cotacaocriptomoedas.api.CotacaoAPI
import com.guilhermereisdev.cotacaocriptomoedas.databinding.ActivityMainBinding
import com.guilhermereisdev.cotacaocriptomoedas.extension.toBrazilianCurrencyFormat
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    private val logging = HttpLoggingInterceptor()
        .setLevel(HttpLoggingInterceptor.Level.BODY)

    private val clientRules = OkHttpClient.Builder()
        .addInterceptor(logging)
        .build()

    private val cotacaoAPI: CotacaoAPI by lazy {
        Retrofit.Builder()
            .baseUrl("https://www.mercadobitcoin.net/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .client(clientRules)
            .build()
            .create(CotacaoAPI::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnRefreshPrices.apply {
            setOnClickListener {
                CoroutineScope(Dispatchers.IO).launch {
                    var resposta = cotacaoAPI.recuperarCotacaoBitcoin()
                    if (resposta.isSuccessful) {
                        val cotacao = resposta.body()
                        if (cotacao != null) {
                            withContext(Dispatchers.Main) {
                                binding.tvBitcoinPrice.apply {
                                    text =
                                        cotacao.ticker.last.toDouble().toBrazilianCurrencyFormat()
                                }
                            }
                        }
                    }

                    resposta = cotacaoAPI.recuperarCotacaoEthereum()
                    if (resposta.isSuccessful) {
                        val cotacao = resposta.body()
                        if (cotacao != null) {
                            withContext(Dispatchers.Main) {
                                binding.tvEthereumPrice.apply {
                                    text =
                                        cotacao.ticker.last.toDouble().toBrazilianCurrencyFormat()
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
