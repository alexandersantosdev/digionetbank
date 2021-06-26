package com.alex.digibank

//outter class - classe externa
class Pessoa {

    var nome: String = "Alexander"
    var cpf: String = "111.111.111-11"
    private set

    constructor()

    fun describe() = "$nome - $cpf"

    //classe interna
    /*
    inner class Endereco{
        var rua:String = "Rua de Teste"
    }
     */
}

fun main() {

    val alex = Pessoa()

    println(alex.describe())

    //println(alex.Endereco().rua)

}
