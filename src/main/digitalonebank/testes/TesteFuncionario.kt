package main.digitalonebank.testes

import main.digitalonebank.Funcionario
import java.math.BigDecimal

fun main() {
    val funcionario1 = Funcionario("Ricardo", "299.470.628.80", BigDecimal.valueOf(2000.0))

    println(funcionario1.nome)
    println(funcionario1.cpf)
    println(funcionario1.salario)
}