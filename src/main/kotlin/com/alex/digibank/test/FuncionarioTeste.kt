package com.alex.digibank.test

import com.alex.digibank.Analista
import com.alex.digibank.Funcionario
import com.alex.digibank.Gerente

fun main() {
    var analista = Analista("Alexander", "111.111.222-44", 2000.0)
    var gerente = Gerente("Lucas", "222.444.555-88", 8000.00)

    ImprimeRelatorioFuncionario.imprimeRelatorioFuncionario(analista)
    ImprimeRelatorioFuncionario.imprimeRelatorioFuncionario(gerente)
}