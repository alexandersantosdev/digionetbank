package com.alex.digibank

data class Banco(val number: Int, val name:String){
    fun describe() = "$number - $name"
}


fun main() {
    val banco = Banco(number = 1010, name = "Banco meu")
    val banco2 = banco.copy(number = 2025)
    println(banco.describe())
    println(banco2.describe())
}
