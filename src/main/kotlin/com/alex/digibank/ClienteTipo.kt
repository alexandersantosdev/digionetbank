package com.alex.digibank

enum class ClienteTipo(val descricao: String) {
    PF("Pessoa Física"),
    PJ("Pessoa Jurídica");


}

fun main() {
    ClienteTipo.values().forEach {println(it.descricao)}

}