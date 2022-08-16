fun main() {

    //1- Faça um programa que receba três inteiros e diga qual deles é o maior.

    var num1: Int = 0
    var num2: Int = 0
    var num3: Int = 0

    println("Escreva o primero número: ")
    num1 = readln().toInt()

    println("Escreva o segundo número: ")
    num2 = readln().toInt()

    println("Escreva o terceiro número: ")
    num3 = readln().toInt()

    if (num1 > num2 && num1 > num3){
        println("O maior número é: $num1")

    }else if(num2 > num1 && num2 > num3){
        println("O maior número é: $num2")

    }else if(num3 > num1 && num3 > num2){
        println("O maior número é: $num3")

    }else{(num1 == num2 || num1 == num3 || num2 == num3)
        println("Números repetidos não são aceitos!")}

}