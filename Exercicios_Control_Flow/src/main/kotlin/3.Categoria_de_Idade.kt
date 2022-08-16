fun main(){

    /*3- Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra:
 10-14 infantil
 15-17 juvenil
 18-25 adulto

     */

    println("Digite a uma idade:")
    val idade = readln(). toInt()

    if(idade <= 14 && idade >= 10){
        println("A idade de $idade anos, se encontra na categoria infantil.")

    }else if(idade <= 17 && idade >= 15){
        println("A idade de $idade anos, se encontra na categoria juvenil.")

    }else if(idade <= 25 && idade >= 18){
        println("A idade de $idade anos, se encontra na categoria adulto.")

    }else{(idade <= 9 || idade >= 26)
        println("Esta idade não esta classificada!")}
}
