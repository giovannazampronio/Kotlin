fun main(){

    //2 - Faça um programa em que o usuário digite o diâmetro de um círculo e calcule a área e o perímetro dele.

    var diametro: Double = 0.0
    var area: Double = 0.0
    var perimetro: Double = 0.0

    println("Digite o diâmetro do círculo: ")
    diametro = readln().toDouble()

    area = 3.14 * (diametro * diametro) / 4
    perimetro = diametro * 3.14

    println("A área de círgulo é de: $area e o perímetro é de: $perimetro")

}