package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main(){
    val jether = Pessoa("Jether Rodrigues", "1234567899")
    println(jether.nome)
    println(jether.cpf)

    val joao = Funcionario("Joao Rodrigues", "1234567890", BigDecimal.valueOf(2000.0))
    println(joao.nome)
    println(joao.cpf)
    println(joao.salario)
}