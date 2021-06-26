package com.alex.digibank

abstract class Funcionario(
    nome:String,
    cpf:String,
    val salario: Double
): Pessoa(nome, cpf){
    abstract fun calcBeneficio():Double
    override fun toString(): String {
        return "${this.nome} - ${this.cpf} - R\$${this.salario} - R\$${this.calcBeneficio()}"
    }
}