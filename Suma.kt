fun main(args: Array<String>) {
    var rsFor: Int = 0
    var rsWhile: Int = 0
    println("Ingresa un numero:")
    var numero = readLine()!!.toInt()

    for (i in numero downTo 1) {
        rsFor += i
    }

    while (numero > 0) {
        rsWhile += numero
        numero--
    }

    println("La suma de los numeros es: $rsFor usando for")
    println("La suma de los numeros es: $rsWhile usando while")
}