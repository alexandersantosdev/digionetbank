package com.alex.digibank

abstract class Funcionario(
    nome:String,
    cpf:String,
    val salario: Double
): Pessoa(nome, cpf){
    abstract fun calcBeneficio()
}