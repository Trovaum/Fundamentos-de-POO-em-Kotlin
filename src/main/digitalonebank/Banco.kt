package main.digitalonebank

data class Banco(val nome: String, val numero: Int) {
    fun info() = "Banco: $nome \nAgencia: $numero"
}
