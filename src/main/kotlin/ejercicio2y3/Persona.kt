package ejercicio2y3

class Persona(val peso: Double,val altura: Double) {
    val imc = peso / (altura * altura)
    var nombre = ""
    constructor(peso: Double, altura: Double, nombre: String) : this(peso, altura) {
        this.nombre = nombre
    }
    override fun toString(): String {
        return "Peso >> $peso | Altura >> $altura | Nombre >> $nombre"
    }
    fun saludar(): String{
        return "Hola $nombre"
    }
    fun alturaMedia():Boolean {
        return if (altura >= 1.75) true else false
    }
    fun pesoMedia():Boolean {
        return if (peso >= 70) true else false
    }
    fun obtenerDescImc(): Pesos {
        return when {
            imc < 18.5 -> Pesos.pesoInsuficiente
            imc in 18.5..<24.9 -> Pesos.pesoSaludable
            imc in 25.0..<29.9 -> Pesos.sobrepeso
            else -> Pesos.obesidad
        }
    }
    fun obtenerDesc():String {
         return "$nombre con una altura de ${altura}m (${if (alturaMedia()) "Por encima de la media" else "Por debajo de la media"}) y un peso ${peso}kg (${if (pesoMedia()) "Por encima de la media" else "Por debajo de la media"}) tiene un IMC de $imc (${obtenerDescImc()})"
    }
}