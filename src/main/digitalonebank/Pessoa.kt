package main.digitalonebank


class Pessoa {

    var nome: String = "Ricardo"
    var cpf: String = "299.470.628.80"

    private set
}
fun main(){
    val dados = Pessoa()

    println(dados.nome)
    println(dados.cpf)
}
