package com.alex.digibank

class Pessoa {
    var nome: String = "Alexander"
    val cpf: String = "111.111.111-11"

    inner class Endereco{
        var rua:String = "Rua de Teste"
    }
}

fun main() {
    val alex = Pessoa()
    println(alex.nome)
    println(alex.cpf)
    println(alex.Endereco().rua)

}
