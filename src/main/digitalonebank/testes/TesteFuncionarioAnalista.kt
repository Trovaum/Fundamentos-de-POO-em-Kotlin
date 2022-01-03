package main.digitalonebank.testes

import main.digitalonebank.Analista
import main.digitalonebank.Funcionario

fun main() {
    val funcionario1 = Analista("Ricardo", "299.470.628.80", 2000.0)
    imprimeRelatorio(funcionario1)
}

fun imprimeRelatorio(funcionario: Funcionario) {
    println(funcionario.toString())
}
