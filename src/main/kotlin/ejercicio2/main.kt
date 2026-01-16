package ejercicio2

fun main() {
    print("Nombre de la Persona 1 >> ")
    val nombrePersona1 = readln()
    val persona1 = Persona(90.0,1.90,nombrePersona1)
    println("--- PERSONA 1 ---")
    println(persona1)
    val persona3 = Persona(80.0,1.80,"Ramoni")
    println("--- PERSONA 3 ---")
    println("Peso >> ${persona3.peso} | Altura >> ${persona3.altura} | IMC >> ${persona3.imc}")
    val persona2 = Persona(70.0,persona3.altura,"Sehito")
    println("--- PERSONA 2 Y 3 ---")
    println(persona2)
    println(persona3)
    println("¿Son iguales? >> ${if (persona2.equals(persona3)) "Si" else "No"}")
}