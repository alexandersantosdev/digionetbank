package com.alex.digibank

class Analista (nome: String, cpf: String, salario: Double): Funcionario(nome, cpf, salario) {
    override fun calcBeneficio() = salario * 0.1
}