// Declara la clase ProductoDigital con un constructor primario cuyas propiedades son de solo lectura (val)
class ProductoDigital(
    val nombre: String,
    val categoria: String,
    val precio: Double,
    val tamanoMB: Double
) {
    // Método que muestra los atributos del producto digital instanciado
    fun mostrarInformacion() {
        println("Producto: $nombre")
        println("Categoria: $categoria")
        println("Precio: $precio")
        println("Tamano: $tamanoMB MB")
    }
}

fun main() {
    // Crea tres instancias enviando los cuatro argumentos requeridos al constructor primario
    val producto1 = ProductoDigital(
        "Editor de fotos", "Fotografia", 49.90, 120.5
    )

    val producto2 = ProductoDigital(
        "Juego movil", "Entretenimiento", 89.00, 850.0
    )

    val producto3 = ProductoDigital(
        "Aplicacion de notas", "Productividad", 0.0, 35.2
    )

    // Imprime la información de cada objeto reutilizando el método mostrarInformacion()
    println("PRODUCTO 1")
    producto1.mostrarInformacion()

    println("\nPRODUCTO 2")
    producto2.mostrarInformacion()

    println("\nPRODUCTO 3")
    producto3.mostrarInformacion()
}