package main.digitalonebank.testes

import main.digitalonebank.Funcionario
import main.digitalonebank.Gerente

fun main() {
    val manager = Gerente("Enzo", "299.470.628.80", 4000.0, "123")
    imprimeRelatorio2(manager)

    TesteAutenticacao().autentica(manager)
}

fun imprimeRelatorio2(funcionario: Funcionario) {
    println(funcionario)
}
