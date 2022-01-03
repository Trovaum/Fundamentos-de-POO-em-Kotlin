package main.digitalonebank

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: String
) : Funcionario(nome, cpf, salario), Login {
    override fun calculoAuxilio(): Double = salario * 0.4

    override fun login(): Boolean = "123" == senha

    override fun toString(): String {
        return "Nome: $nome \nCPF: $cpf \nSalario: $salario \nAuxilio: ${calculoAuxilio()}"
    }


}