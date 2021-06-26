package com.alex.digibank

data class Banco(val number: Int, val name:String){
    fun describe() = "$number - $name"
}
