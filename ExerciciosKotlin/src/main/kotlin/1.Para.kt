/*	 * 1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:
a) média do salário da população;
b) média do número de filhos;
c) maior salário;
d) percentual de pessoas com salário até R$100,00.
 {

    inteiro filhos=0 , sal100=0

    real sal , soma=0.0 , mediaSal=0.0 , mediaF=0.0 , maiorSal=0.0 , perc=0.0

    para(inteiro i=1 ; i<=4 ; i ++){
        limpa()

        escreva(i, "º habitante\n\n")

        escreva("Digite o salário: ")
        leia(sal)

        escreva("Digite o número de filhos: ")
        leia(filhos)

        soma += sal
        mediaF += filhos

        se(sal > maiorSal){

            maiorSal = sal

        }

        se(sal <= 100){

            sal100++

        }
    }

    mediaSal = soma / 4
    mediaF = mediaF / 4

    perc = (sal100/4.0) * 100

    limpa()

    escreva("média do salário da população: R$", mediaSal)
    escreva("\nmédia do número de filhor: ", mediaF)
    escreva("\nmaior salário: R$" , maiorSal)
    escreva("\npercentual de pessoas com salário até R$100,00: " , perc, "%")


}
}*/

fun main (){

    var filhos: Int = 0
    var sal100: Int = 0
    var sal: Int = 0
    var soma: Double = 0.0
    var mediaSal: Double = 0.0
    var mediaF: Double = 0.0
    var maiorSal: Double = 0.0
    var perc: Double = 0.0

    for(Int i=1 in i<=4 in i ++)run{
        println("$i habitantes")

    }
}
