fun main (){

    //1 - O usuário digitará sua idade e o programa deverá printar o ano em que ele nasceu.

    var idade: Int = 0
    var ano: Int = 0

    println("Quantos anos de idade você completará neste ano? ")
    idade = readln().toInt()

    ano = 2022 - idade

    print("Você completará $idade anos de idade, pois nasceu no ano de $ano.")
}