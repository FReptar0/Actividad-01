fun main(args: Array<String>) {
    var validacion: Boolean = false
    do {
        println("Ingresa un numero")
        var numero = readLine()!!.toInt()
        if (numero >= 1) {
            for (i in 1..numero) {
                if (i % 2 == 0) {
                    println(i)
                }
            }

            println("Desea continuar? (S/N)")
            var respuesta = readLine()!!.toString()
            validacion = respuesta == "S" || respuesta == "s"
        } else {
            println("Inserta un numero positivo")
            validacion = true
        }
    } while (validacion)
}