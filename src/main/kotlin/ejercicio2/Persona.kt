package ejercicio2

class Persona(val peso: Double,val altura: Double) {
    val imc = peso % (altura * altura)
    var nombre = ""
    constructor(peso: Double, altura: Double, nombre: String) : this(peso, altura) {
        this.nombre = nombre
    }
    override fun toString(): String {
        return "Peso >> $peso | Altura >> $altura | Nombre >> $nombre"
    }
}