fun main(){

    /*
    3 - Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
    21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
    idade for =-99. (WHILE)
     */

    var idade:Int = 0
    var cont21: Int = 0
    var cont50: Int = 0

    while(idade != -99){
        println("Digite uma idade:")
        idade = readln().toInt()

        if(idade < 21){
            cont21++

        }else if(idade > 50){
            cont50++
        }
    }
    println("O total de idades menores que 21 anos é: $cont21 e maiores que 50 anos é: $cont50")
}