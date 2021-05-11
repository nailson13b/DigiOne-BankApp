package one.digitalinnovation.digionebank.testes
import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Gerente

fun main(){
    val maria = Gerente("Maria do Carmo", "1234567890", 5000.0)
    ImprimeRelatorioFuncionario.imprime(maria)

}
