fun main(args: Array<String>) {
   /*. Cria uma Classe Cliente, contendo os atributos encapsulados, um construtor padrão
nome (String), endereço (String), telefone (String), listaDeCompras (mutableListOf<Strings>()).

A classe precisará de métodos para adicionar, remover e listar os itens do atributo listaDeCompras.
Crie um método para verificar o nome ao inicializar a classe e, caso esteja vazio, jogue uma exceção.
Ao instanciar a classe cliente na função main(), não esquecer de colocar dentro de um bloco try catch.
    */
try {
    val cliente1 = Cliente("Giovanna", "Rua Dos Bobos,0", "11 0000-0000")

    while (true) {

        println()
        println("1 - Adicionar item")
        println("2 - Remover item")
        println("3 - listar itens")
        println("4 - Sair")

        println("Opção:")
        val opc = readln().toInt()
        println()

        when (opc) {
            1 -> {
                print("Digite o item que deseja adicionar: ")
                val item = readln()
                cliente1.addItem(item)
            }
            2 -> {
                print("Digite o item que deseja remover: ")
                val item = readln()
                cliente1.removerItem(item)
            }
            3 -> {
                cliente1.exibirLista()
            }
            4 -> break
            else -> println("Opção inválida.")

        }
    }
}catch (e: Exception){
    println(e.message)
}
}

