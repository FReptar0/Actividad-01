fun main(args: Array<String>) {
    val peliculas = arrayOf<String>("El padrino", "Superman", "Avengers: End Game", "My Little Pony")
    var total = arrayOf<Int>()
    for (pelicula in peliculas) {
        total.plus(pelicula.length)
    }

    var maximo = maxOf(peliculas[0].length, peliculas[1].length, peliculas[2].length, peliculas[3].length)

    for (i in peliculas) {
        if (i.length == maximo) {
            println("La pelicula con el titulo mas grande es:\n$i\nY esta en la posicion ${peliculas.indexOf(i)}")
        }
    }

}