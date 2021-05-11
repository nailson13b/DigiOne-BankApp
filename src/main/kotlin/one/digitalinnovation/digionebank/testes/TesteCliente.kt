package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo

fun main() {
    val jose = Cliente(
        "Jose da Silva",
        "123.123.456-77",
        ClienteTipo.PF,
        "123456"
    )

    println(jose)

    TesteAutenticacao().autentica(jose)
}