package com.alex.digibank

class Pessoa {
    var nome: String = "Alexander"
    val cpf: String = "055.813.279-04"
}

fun main() {
    val alex = Pessoa()
    println(alex.nome)
    println(alex.cpf)
}
