package com.alex.digibank

import java.math.BigDecimal

class Conta(
    var agencia: String,
    val numero: String,
    var saldo: BigDecimal
) {
    fun deposito(valor: BigDecimal){}
    fun saque(valor: BigDecimal){}
}