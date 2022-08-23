class Cliente (var nome: String, endereco: String, telefone: String){

    private var listaDeCompras = mutableListOf<String>("Tomate", "Cebola")

    init {
        checarDados()
    }

    fun addItem(item: String){
        if(item.isNotBlank()){
            listaDeCompras.add(item)
            println("Produto adicionado com sucesso!")
        }else{
            println("Produto inválido.")
        }

    }
    fun removerItem(item: String){
        if(listaDeCompras.contains(item)) {
            listaDeCompras.remove(item)
            println("Produto removido com sucesso!")
        }else{
            println("O produto $item não existe.")
        }
    }
    fun exibirLista(){
        listaDeCompras.forEach {
            println(it)
        }
    }
    private fun checarDados(){
        if(nome.isBlank()){
            throw Exception("Cadastro feito de maneira inválida!")
        }
    }


}
