package main.digitalonebank.testes

import main.digitalonebank.ClienteTipo

fun main() {
    ClienteTipo.values().forEach {
        println(it.name)
    }
    ClienteTipo.values().forEach {
        println("${it.name} - ${it.description}")
    }
}