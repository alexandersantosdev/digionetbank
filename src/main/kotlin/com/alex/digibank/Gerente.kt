package com.alex.digibank

class Gerente(nome:String, cpf:String, salario:Double, val senha:String):Funcionario(nome, cpf, salario), Logavel {
    override fun calcBeneficio() = salario * 0.3
    override fun login(): Boolean = "senha123" == senha
}
