package ejercicio5

//    val logger = LoggerFactory.getLogger("main")
//    val t1 = Tiempo(12)
//    logger.info(t1.toString())
//    for (i in 1..90) {
//        logger.info("$i >> $t1")
//    }

fun preguntar(): Triple<Int, Int, Int> {
    print("Hora >> ")
    val hora = readln().toIntOrNull()?:0
    print("Minutos >> ")
    val minuto = readln().toIntOrNull()?:0
    print("Segundos >> ")
    val segundo = readln().toIntOrNull()?:0
    return Triple(hora, minuto, segundo)
}

fun main() {
    println("--- TIEMPO 1 ---")
    val (hora1, minuto1, segundo1) = preguntar()
    val tiempoOg = Tiempo(hora1, minuto1, segundo1)
    println("--- TIEMPO 2 ---")
    val (hora2, minuto2, segundo2) = preguntar()
    val tAuxiliar = Tiempo(hora2, minuto2, segundo2)
    println("----------------")
    tiempoOg.incrementar(tAuxiliar)
    println("Hora incrementada (${tAuxiliar.horas}h ${tAuxiliar.minutos}m ${tAuxiliar.segundos}s más) >> $tiempoOg")
    tiempoOg.decrementar(tAuxiliar)
    println("Hora decrementada (${tAuxiliar.horas}h ${tAuxiliar.minutos}m ${tAuxiliar.segundos}s menos) >> $tiempoOg")
    println("Horas Comparadas (${tAuxiliar.horas}h ${tAuxiliar.minutos}m ${tAuxiliar.segundos}s la hora comparada) >> ${tiempoOg.comparar(tAuxiliar)}")
    println("Hora Copiada 1 >> ${tiempoOg.copiar()}")
    println("Hora Copiada 2 >> ${tiempoOg.copiar(tAuxiliar)}")
    println("Hora Sumada >> ${tiempoOg.sumar(tAuxiliar)}")
    println("Hora Restada >> ${tiempoOg.restar(tAuxiliar)}")
}