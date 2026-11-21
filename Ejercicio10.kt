// Define la clase Usuario y sus propiedades inicializadas con valores por defecto
class Usuario {
    var nombre: String = ""
    var correo: String = ""
    var edad: Int = 0
    var cuentaActiva: Boolean = true

    // Método interno de la clase que imprime en consola los datos de cada instancia
    fun mostrarInformacion() {
        println("Nombre: $nombre")
        println("Correo: $correo")
        println("Edad: $edad")
        println("Cuenta activa: $cuentaActiva")
    }
}

fun main() {
    // Crea la primera instancia (usuario1) y asigna valores a sus propiedades mediante operador punto
    val usuario1 = Usuario()
    usuario1.nombre = "Andrea"
    usuario1.correo = "andrea@email.com"
    usuario1.edad = 21
    usuario1.cuentaActiva = true

    // Crea una segunda instancia independiente (usuario2) con datos distintos
    val usuario2 = Usuario()
    usuario2.nombre = "Luis"
    usuario2.correo = "luis@email.com"
    usuario2.edad = 24
    usuario2.cuentaActiva = false

    // Invoca el método mostrarInformacion() de cada objeto por separado
    println("PRIMER USUARIO")
    usuario1.mostrarInformacion()

    println("\nSEGUNDO USUARIO")
    usuario2.mostrarInformacion()
}