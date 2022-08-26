class Preguica(nome: String,
               idade: Int): Animal(nome, idade){

    override fun escalaArvore() {
        println("Escala árvores")
    }

    override fun emiteSom() {
        println("Silencioso")
    }
}