fun main(args: Array<String>) {
    var option: Int
    println("¿Como esta el clima hoy?(1-5)")
    option = readLine()!!.toInt()
    when (option) {
        1 -> println("Soleado")
        2 -> println("Nublado")
        3 -> println("Lluvioso")
        4 -> println("Tormentoso")
        5 -> println("Nevado")
        else -> println("Preguntale a Google")
    }
}