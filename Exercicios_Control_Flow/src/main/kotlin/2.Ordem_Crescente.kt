fun main(){

    //2- Faça um programa que entre com três números e coloque em ordem crescente.

    println("Digite o primero número: ")
    val num1 = readln().toInt()

    println("Digite o segundo número: ")
    val num2 = readln().toInt()

    println("Digite o terceiro número: ")
    val num3 = readln().toInt()

    if(num1 < num2 && num2 < num3){
        println("A ordem crescente dos números é: $num1, $num2, $num3")

    }else if(num2 < num1 && num1 < num3){
        println("A ordem crescente dos números é: $num2, $num1, $num3")

    }else if(num3 < num1 && num1 < num2){
        println("A ordem crescente dos números é: $num3, $num1, $num2")

    }else if(num1 < num3 && num3 < num2){
        println("A ordem crescente dos números é: $num1, $num3, $num2")

    }else if(num2 < num3 && num3 < num1){
        println("A ordem crescente dos números é: $num2, $num3, $num1")

    }else if(num3 < num2 && num2 < num1){
        println("A ordem crescente dos números é: $num3, $num2, $num1")

    }else{(num1 == num2 || num1 == num3 || num2 == num3)
        println("Números repetidos não são aceitos!")}

}