fun main(){
    /*
   5 - Crie um programa que leia um número do teclado até que encontre um
   número igual a zero. No final, mostre a soma dos números
   digitados.(DO...WHILE)
    */

    var num: Int = 0
    var soma: Int = 0

    do{
        println("Digite um número:")
        num = readln().toInt()

        soma += num

    }while(num != 0)

    println("O total da soma dos números é: $soma")


}