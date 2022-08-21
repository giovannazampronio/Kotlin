fun main(){

    /*Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
trabalhar com Collection do tipo List do Kotlin para manipular os dados desse estoque, o
programa deverá atender as seguintes funcionalidades:

Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.*/

    while(true){
        println("1 - Adicionar um produto")
        println("2 - Remover produto")
        println("3 - Atualizar produto")
        println("4 - Exibir produto")
        println("5 - Sair")
        println()
        println("Escolha uma das opções acima: ")

        when(readln().toInt()){
            1 -> {
                println("Digite o nome do produto:")
                val produto = readln()
                addProdutos(produto)}

            2 -> removerProduto()
            3 -> atualizarProduto()
            4 -> listProdutos()
            5 -> {
                println("Sistema atualizado!")
                break

            }
            else -> println("Opção inválida.")
        }
    }
}