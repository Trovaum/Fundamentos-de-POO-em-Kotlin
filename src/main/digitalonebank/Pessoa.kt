package main.digitalonebank


class Pessoa {

    var nome: String = "Ricardo"
    var cpf: String = "299.470.628.80"

    // proibe que as variaveis sejam mudadas em outra classe
    private set

    fun pessoaInfo() = "$nome e $cpf"
}
fun main(){
    val dados = Pessoa()

    println(dados.nome)
    println(dados.cpf)
    println(dados.pessoaInfo())
}
