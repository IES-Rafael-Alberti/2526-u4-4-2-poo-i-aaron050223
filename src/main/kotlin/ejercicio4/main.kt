package ejercicio4

fun main() {
    // --- PRUEBA 1 | MARCA NULL
    try {
        val cocheMarca = Coche(null,"Corola", "Rojo", "9197DNC", 70, 4)
    } catch (e: IllegalArgumentException) {
        println("ERROR: ${e.message}")
    }
    // --- PRUEBA 2 | CABALLOS < 70
    try {
        val cocheCaballos = Coche("Toyota","Corola", "Rojo", "9197DNC", 69, 4)
    } catch (e: IllegalArgumentException) {
        println("ERROR: ${e.message}")
    }
    // PRUEBA 3 | PUERTAS < 3"
    try {
        val cochePuertas = Coche("Mercedes","Vito", "Azul", "9197DNC", 70, 2)
    } catch (e: IllegalArgumentException) {
        println("ERROR: ${e.message}")
    }
    // PRUEBA 4 | MATRICULA != 7
    try {
        val cocheMatricula = Coche("Mercedes","Vito", "Azul", "9197DNCQ", 70, 3)
    } catch (e: IllegalArgumentException) {
        println("ERROR: ${e.message}")
    }
    // PRUEBA 5 | COLOR NULL
    try {
        val cocheColor = Coche("Mercedes","Vito", null, "9197DNC", 70, 3)
    } catch (e: IllegalArgumentException) {
        println("ERROR: ${e.message}")
    }
}

