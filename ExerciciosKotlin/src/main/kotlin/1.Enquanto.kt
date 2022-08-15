/* 1- Elaborar um programa que efetue a leitura sucessiva de valores numéricos e apresente
	 no final o total do somatório, a média e o total de valores lidos. O programa deve fazer
	 as leituras dos valores enquanto o usuário estiver fornecendo valores positivos. Ou seja,
	 o programa deve parar quando o usuário fornecer um valor negativo.


{

    inteiro num=0 , soma=0 , cont=0
    real media=0


    enquanto(num>=0){

        escreva("\n\nDigite um número:")
        leia(num)

        cont++
        soma += num
        media = soma/cont

        escreva("\nTotal da soma: " , soma)
        escreva("\nQuantidade de números lidos: " , cont)
        escreva("\nMédia: " , media , " %")

        se(num>=0){
        }
    }
}
}*/

fun main (){

    var num: Int = 0
    var soma: Int = 0
    var cont: Int = 0
    var media: Double = 0.0

    while(num>=0){

        println("Escreva um número:")
        num = readln().toInt()

        cont++
        soma += num
        media = (soma / cont).toDouble()

        println("Total da soma: $soma")
        println("Quantidade de números lidos: $cont")
        println("Média: $media")

    }

}
