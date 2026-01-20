package ejercicio5

class Tiempo(
    var horas: Int,
    minutosInput: Int = 0,
    segundosInput: Int = 0
) {
    var segundos: Int = 0
    var minutos: Int = 0

    init {
        this.segundos = segundosInput
        this.minutos = minutosInput

        if (segundos >= 60) {
            this.minutos += segundosInput / 60
            this.segundos = segundosInput % 60
        }
        if (minutos >= 60) {
            this.horas += minutos / 60
            this.minutos %= 60
        }
        require(horas <= 24) {"Hora tiene que ser menor o igual a 24"}
    }

    fun pasarSegundos():Int {
        return (horas * 3600) + (minutos * 60) + segundos
    }

    fun incrementar(t:Tiempo):Boolean {
        val segundosTotalesT = t.pasarSegundos()
        val segundosTotalesOg = this.pasarSegundos()
        val segundosTotalesJuntos = segundosTotalesOg + segundosTotalesT
        return if (segundosTotalesJuntos > 86399) false else {
            this.horas = segundosTotalesJuntos / 3600
            val restoSegundos = segundosTotalesJuntos % 3600
            this.minutos = restoSegundos / 60
            this.segundos = restoSegundos % 60
            true
        }
    }

    fun decrementar(t:Tiempo):Boolean {
        val segundosTotalesT = t.pasarSegundos()
        val segundosTotalesOg = this.pasarSegundos()
        val segundosTotalesJuntos = segundosTotalesOg - segundosTotalesT
        return if (segundosTotalesJuntos < 0) false else {
            this.horas = segundosTotalesJuntos / 3600
            val restoSegundos = segundosTotalesJuntos % 3600
            this.minutos = restoSegundos / 60
            this.segundos = restoSegundos % 60
            true
        }
    }

    fun comparar(t:Tiempo):Int {
        val segundosTotalesT = t.pasarSegundos()
        val segundosTotalesOg = this.pasarSegundos()
        return when {
            segundosTotalesOg < segundosTotalesT -> -1
            segundosTotalesOg == segundosTotalesT -> 0
            else -> 1
        }
    }

    fun copiar():Tiempo {
        return Tiempo(horas, minutos, segundos)
    }

    fun copiar(t:Tiempo):Tiempo {
        return Tiempo(t.horas, t.segundos, t.segundos)
    }

    fun sumar(t:Tiempo):Tiempo? {
        val segundosTotalesT = t.pasarSegundos()
        val segundosTotalesOg = this.pasarSegundos()
        val segundosTotalesJuntos = segundosTotalesOg + segundosTotalesT
        return if (segundosTotalesJuntos > 86399) null else Tiempo(segundosTotalesJuntos / 3600, (segundosTotalesJuntos % 3600) / 60, ((segundosTotalesJuntos % 3600) / 60) % 60)
    }

    fun restar(t:Tiempo):Tiempo? {
        val segundosTotalesT = t.pasarSegundos()
        val segundosTotalesOg = this.pasarSegundos()
        val segundosTotalesJuntos = segundosTotalesOg + segundosTotalesT
        return if (segundosTotalesJuntos < 0) null else Tiempo(segundosTotalesJuntos / 3600, (segundosTotalesJuntos % 3600) / 60, ((segundosTotalesJuntos % 3600) / 60) % 60)
    }

    override fun toString(): String {
        return "${horas}h ${minutos}m ${segundos}s"
    }
}

