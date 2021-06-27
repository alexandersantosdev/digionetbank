package com.alex.digibank

class Cliente (nome:String, cpf:String, clienteTipo: ClienteTipo, val senha:String): Pessoa(nome, cpf), Logavel {
    override fun login(): Boolean = "senhacliente" == senha
}