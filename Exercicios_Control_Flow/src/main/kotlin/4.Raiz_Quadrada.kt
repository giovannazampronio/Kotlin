import kotlin.math.sqrt

fun main (){

    /*4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.

     */


    println("Digite um número:")
    val num = readln().toInt()

    var raizQuadrada: Double = sqrt(num.toDouble())

    if(num % 2 == 0){
        println("O número $num é par e a sua raiz quadrada é $raizQuadrada")

    }else{
        println("O número $num é impar e o seu valor elevado ao quadrado é de ${num * num}")
    }
}

