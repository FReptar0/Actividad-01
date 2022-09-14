fun main(args: Array<String>) {
    var ct: Int = 0
    var km: Double
    var estado: Boolean
    var resp: String = "S"
    do {
        if (ct > 0) {
            println("Deseas continuar? (S/N)")
            resp = readLine()!!.toString()
            if (resp == "N") {
                break
            }
        }
        println("Ingresa tu distancia en km")
        km = readLine()!!.toDouble()
        println("Ingresa tu disponibilidad\n1. Disponible\n2. No Disponible")
        var disponibilidad = readLine()!!.toInt()
        ct += 1
        estado = disponibilidad == 1


        if (km <= .5 && estado) {
            println("Listo para iniciar el recorrido ")
            resp = "N"
        }

        if (km <= .5 && !estado) {
            println("Conductor cercano, pero no disponible")
        }

        if (km > .5 && estado) {
            println("Conductor disponible, pero muy lejos aplicaran tarifas mas altas")
        }

        if (km > .5 && !estado) {
            println("No hay conductores disponibles")
        }

    } while (resp == "S")
}