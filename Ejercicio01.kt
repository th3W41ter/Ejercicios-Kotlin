fun main() {
    val nombreCompleto: String = "Andrea López"
    var edad: Int = 20
    val correo: String = "andrea@email.com"
    var telefono: String = "8112345678"
    var cuentaActiva: Boolean = true
    val satisfaccion: Double = 9.5

    println("INFORMACION DEL USUARIO")
    println("Nombre completo: $nombreCompleto")
    println("Edad: $edad")
    println("Correo: $correo")
    println("Telefono: $telefono")
    println("Cuenta activa: $cuentaActiva")
    println("Satisfaccion: $satisfaccion")

    edad = 21
    telefono = "8187654321"
    cuentaActiva = false

    println("\nINFORMACION ACTUALIZADA")
    println("Nueva edad: $edad")
    println("Nuevo telefono: $telefono")
    println("Cuenta activa: $cuentaActiva")
}