open class Cachorro(nome: String,
                    idade: Int) : Animal(nome, idade){

    override fun correr() {
        println("Corre")
    }

    override fun emiteSom() {
        println("Late")
    }
}