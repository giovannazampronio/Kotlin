/*
1.Crie uma hierarquia de classes conforme abaixo com osseguintes
atributos e comportamentos (observe a tabela),utilize os seus
conhecimentos e distribua as características de forma que tudo
o que for comum a todos os animais fique na classe Animal:

2.Implemente um programa que crie os 3 tipos de animais definidos no
exercício anterior e invoque o método que emite o som de cada um de
forma polimórfica, isto é, independente do tipo de animal.

 */


import Animal
fun main(){

    val pet = Cachorro("Bartholomeu", 13)
    println("Nome do pet: ${pet.nome}")
    println("Idade do pet: ${pet.idade}")

   pet.correr()
   pet.emiteSom()

    println()
    println()

    val ponei = Cavalo("Estrela", idede = 5)
    println("Nome do pônei: ${ponei.nome}")
    println("Idade do pônei: ${ponei.idade}")

    ponei.correr()
    ponei.emiteSom()

    println()
    println()

    val bicho = Preguica("Sid", idade = 9)
    println("Nome do bicho preguiça: ${bicho.nome}")
    println("Idade do bicho preguiça: ${bicho.idade}")

    bicho.escalaArvore()
    bicho.emiteSom()

}