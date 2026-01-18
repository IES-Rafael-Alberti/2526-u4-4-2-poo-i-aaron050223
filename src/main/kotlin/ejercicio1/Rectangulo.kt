package ejercicio1

class Rectangulo(private val base: Int, private val altura: Int) {
    fun calcularArea(): Int {
        return base * altura
    }
    fun calcularPerimetro(): Int {
        return 2 * (base + altura)
    }
    override fun toString(): String {
        return "Base >> $base\nAltura >> $altura\nArea >> ${calcularArea()}\nPerimetro >> ${calcularPerimetro()}"
    }
}