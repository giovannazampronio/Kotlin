/*programa
{

	funcao inicio()
	{
		real n1,n2,n3,n4

		escreva("valor de n1:")
		leia(n1)
		escreva("valor de n2:")
		leia(n2)
		escreva("valor de n3:")
		leia(n3)
		escreva("valor de n4:")
		leia(n4)

		limpa()

		n1 = n1 * n1
		n2 = n2 * n2
		n3 = n3 * n3
		n4 = n4 * n4

		se (n3 >= 1000){
		escreva("n3 * n3:", n3)

		}senao{
		escreva("n1 * n1:", n1)

		escreva("\n n2 * n2:", n2)

		escreva("\n n3 * n3:", n3)

		escreva("\n n4 * n4:", n4)
		}}
}*/

fun main () {
    var n1: Int
    var n2: Int
    var n3: Int
    var n4: Int

    println("Valor de n1: ")
    n1 = readln().toInt()

    println("Valor de n2: ")
    n2 = readln().toInt()

    println("Valor de n3: ")
    n3 = readln().toInt()

    println("Valor de n4: ")
    n4 = readln().toInt()


    n1 = n1 * n1
    n2 = n2 * n2
    n3 = n3 * n3
    n4 = n4 * n4

    if (n3 >= 1000) {
        println("n3 * n3 = $n3")

    }else{
        println("n1 * n1 = $n1")
        println("n2 * n2 = $n2")
        println("n3 * n3 = $n3")
        println("n4 * n4 = $n4")

    }



}