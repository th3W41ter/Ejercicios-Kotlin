// Clase padre marcada con open para permitir herencia; define marca, modelo y mostrarInformacion()
open class Dispositivo(
    val marca: String,
    val modelo: String
) {
    fun mostrarInformacion() {
        println("Marca: $marca")
        println("Modelo: $modelo")
    }
}

// Subclase Smartphone que hereda de Dispositivo (:) y añade la propiedad cantidadCamaras
class Smartphone(
    marca: String,
    modelo: String,
    val cantidadCamaras: Int
) : Dispositivo(marca, modelo) {
    fun mostrarCamaras() {
        println("Cantidad de camaras: $cantidadCamaras")
    }
}

// Subclase Tablet que hereda de Dispositivo (:) y añade la propiedad tieneLapiz
class Tablet(
    marca: String,
    modelo: String,
    val tieneLapiz: Boolean
) : Dispositivo(marca, modelo) {
    fun mostrarLapiz() {
        println("Incluye lapiz: $tieneLapiz")
    }
}

fun main() {
    // Instancia ambos dispositivos y ejecuta tanto los métodos heredados como los propios
    val telefono = Smartphone("Samsung", "Galaxy", 3)
    val tablet = Tablet("Lenovo", "Tab", true)

    println("SMARTPHONE")
    telefono.mostrarInformacion()
    telefono.mostrarCamaras()

    println("\nTABLET")
    tablet.mostrarInformacion()
    tablet.mostrarLapiz()
}