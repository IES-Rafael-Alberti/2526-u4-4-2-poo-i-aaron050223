package ejercicio4

class Coche(
    marcaInput: String?,
    modeloInput: String?,
    colorInput: String?,
    matriculaInput: String?,
    numeroCaballosInput: Int?,
    numeroPuertasInput: Int?
) {
    var marca: String
        get() = field.replaceFirstChar{it.uppercase()}
    val modelo: String
        get() = field.replaceFirstChar{it.uppercase()}
    val matricula: String
    val numeroCaballos: Int
    val numeroPuertas: Int
    var color: String

    init {
        require(!marcaInput.isNullOrBlank()) {"La marca no puede ser nula ni estar vacía."}
        this.marca = marcaInput

        require(!modeloInput.isNullOrBlank()) {"El modelo no puede ser nulo ni estar vacío."}
        this.modelo = modeloInput

        require(numeroCaballosInput != null) {"El número de caballos no puede ser nulo."}
        require(numeroCaballosInput in 70..700) {"El número de caballos debe estar entre 70 y 700"}
        this.numeroCaballos = numeroCaballosInput

        require(numeroPuertasInput != null) {"El número de puertas no puede ser nulo."}
        require(numeroPuertasInput in 3..5) {"El número de puertas debe estar entre 3 y 5"}
        this.numeroPuertas = numeroPuertasInput

        require(!matriculaInput.isNullOrBlank()) {"La matrícula no puede ser nula ni estar vacía."}
        require(marcaInput.length != 7) {"La matrícula debe tener 7 caracteres."}
        this.matricula = matriculaInput

        require(!colorInput.isNullOrBlank()) {"El color no puede ser nulo ni estar vacío."}
        this.color = colorInput
    }
}