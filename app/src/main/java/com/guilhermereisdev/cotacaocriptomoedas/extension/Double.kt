package com.guilhermereisdev.cotacaocriptomoedas.extension

import java.text.NumberFormat
import java.util.Currency
import kotlin.math.roundToInt


fun Double.toBrazilianCurrencyFormat(): String {
    val format: NumberFormat = NumberFormat.getCurrencyInstance()
    format.maximumFractionDigits = 2
    format.currency = Currency.getInstance("BRL")

    return format.format(this.roundToInt())
}