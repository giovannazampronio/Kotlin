/*fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}*/
/*programa
{

	funcao inicio()
	{
		real P
		real E
		real M

		escreva("João comprou tomates com o peso de: ")
		leia(P)
		limpa()

		se (P > 50.0){
			E = P - 50
			M = 4.0 * E
		}senao{E = 0
		M = 0
	}
	escreva("então o valor da multa é de: " , M, "\n excesso em kg é de: ", E)
}
}*/

fun main (){

    var Peso: Int
    var Excesso: Int = 0
    var Multa: Int

    println("Insira o peso do tomate: ")
    Peso = readln().toInt()

    if(Peso > 50) {
        Excesso = Peso - 50
        Multa = 4 * Excesso

    }else{
        Multa = 0
    }
    println("então o valor da multa é de: $Multa")
    println("excesso em kg é de: $Excesso")

}