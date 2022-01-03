package main.digitalonebank.testes

import main.digitalonebank.Cliente
import main.digitalonebank.ClienteTipo

fun main() {
    val ricardo = Cliente("Ricardo", "123.123.123.11", ClienteTipo.Pf, "123456")
    println(ricardo)

    TesteAutenticacao().autentica(ricardo)
}
