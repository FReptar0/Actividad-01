fun main(args: Array<String>) {
    println("Ingrese la cantidad de gramos a agreagar a la pocion")
    val gramos: Int
    gramos = readLine()!!.toInt()

    if (gramos > 100) {
        println("¡Felicidades es una buena pocion multijugos!")
    } else {
        println("La pocion es mediocre, sangre sucia inmunda")
    }
}