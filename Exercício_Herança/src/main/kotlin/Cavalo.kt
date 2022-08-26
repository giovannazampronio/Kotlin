open class Cavalo(nome:String,
                  idede: Int):Animal(nome, idede) {

    override fun correr() {
        println("Cavalga")
    }

    override fun emiteSom() {
        println("Relincha")
    }
}