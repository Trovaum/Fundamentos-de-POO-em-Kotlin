package main.digitalonebank

class Gerente(nome: String, cpf: String, salario: Double): Funcionario(nome, cpf, salario) {
    override fun calculoAuxilio(): Double = salario * 0.4
    override fun toString(): String {
        return "Nome: $nome \nCPF: $cpf \nSalario: $salario \nAuxilio: ${calculoAuxilio()}"
    }


}