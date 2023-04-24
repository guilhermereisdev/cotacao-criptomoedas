package com.guilhermereisdev.cotacaocriptomoedas.api

import com.guilhermereisdev.cotacaocriptomoedas.model.Cotacao
import retrofit2.Response
import retrofit2.http.GET

interface CotacaoAPI {

    @GET("BTC/ticker/")
    suspend fun recuperarCotacaoBitcoin(): Response<Cotacao>

    @GET("ETH/ticker/")
    suspend fun recuperarCotacaoEthereum(): Response<Cotacao>

}