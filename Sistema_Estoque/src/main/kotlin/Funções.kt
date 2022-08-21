val estoque = mutableListOf<String>()

fun addProdutos (produto : String){
    if(produto != " ") {
        estoque.add(produto)
        println("$produto foi adicionado com sucesso ao estoque")
    }else{
        println("Produto Inválido")
    }
}

fun removerProduto(){

    while(true){
        println("Digite o item à ser excluido:")
        val produto = readln()

        if(estoque.contains(produto)) {
            estoque.remove(produto)
            println("$produto foi excluído com sucesso!")
            break
        }else{
            println("$produto não existe no estoque.")
        }
    }
}
fun atualizarProduto(){
    println("Digite o produto à ser atualizado:")
    val produto = readln()

    if(estoque.contains(produto)) {
        val pos = estoque.indexOf(produto)
        println("Digite o novo nome do produto: ")
        estoque[pos] = readln()
        println("Item atualizado com sucesso!")

    }else{
        println("$produto não existe no estoque.")
    }
}
fun listProdutos(){
    println()
    println(estoque)
}