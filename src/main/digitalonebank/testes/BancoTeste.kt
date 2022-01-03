package main.digitalonebank.testes

import main.digitalonebank.Banco

fun main() {
    val mDigitalOneBank = Banco("DigitalOne", 123456)

    println(mDigitalOneBank.nome)
    println(mDigitalOneBank.numero)
    println(mDigitalOneBank.info())
}