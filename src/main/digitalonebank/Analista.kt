package main.digitalonebank


class Analista(
    nome: String,
    cpf: String,
    salario: Double
) :
    Funcionario(nome, cpf, salario) {
    override fun calculoAuxilio() = salario * 0.1

    override fun toString(): String {
        return "Nome: $nome \nCPF: $cpf \nSalario: $salario \nAuxilio: ${calculoAuxilio()}"
    }


}