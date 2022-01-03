package main.digitalonebank.testes

import main.digitalonebank.Analista
import main.digitalonebank.Funcionario
import main.digitalonebank.Gerente
import java.math.BigDecimal

fun main() {
    val manager = Gerente("Enzo", "299.470.628.80", 4000.0)
    imprimeRelatorio2(manager)
}

fun imprimeRelatorio2(funcionario: Funcionario) {
    println(funcionario)
}
