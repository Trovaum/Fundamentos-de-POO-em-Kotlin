package main.digitalonebank

class Cliente(
    nome: String,
    cpf: String,
    val clienteTipo: ClienteTipo,
    val senha: String
) : Pessoa(nome, cpf), Login {
    override fun login(): Boolean = "123456" == senha
    override fun toString(): String {
        return "Cliente\n Nome: $nome \n CPF: $cpf (clienteTipo=$clienteTipo, senha='$senha')"
    }

}