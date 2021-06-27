package com.alex.digibank.test

import com.alex.digibank.Analista
import com.alex.digibank.Cliente
import com.alex.digibank.ClienteTipo
import com.alex.digibank.Gerente

fun main() {
    var analista = Analista("Alexander", "111.111.222-44", 2000.0)
    var gerente = Gerente("Lucas", "222.444.555-88", 8000.00, "senha123")
    var cliente = Cliente("Maria", "123.321.456.-78", ClienteTipo.PF, "senhacliente")

    ImprimeRelatorioFuncionario.imprimeRelatorioFuncionario(analista)
    ImprimeRelatorioFuncionario.imprimeRelatorioFuncionario(gerente)

    AutenticacaoTeste.autentica(gerente)
    AutenticacaoTeste.autentica(cliente)
}