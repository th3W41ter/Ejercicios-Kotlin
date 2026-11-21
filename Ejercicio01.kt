// Punto de entrada principal donde inicia la ejecución del programa
fun main() {
// val declara una constante de tipo String que no cambiará
    val nombreCompleto: String = "Andrea López"
// var declara una variable entera (Int) que sí podrá modificarse
    var edad: Int = 20
// Correo electrónico fijo del usuario como cadena de texto
    val correo: String = "andrea@email.com"
// Número telefónico mutable (String) agregado según los requisitos de la guía
    var telefono: String = "8112345678"
// Variable Boolean (true/false) para controlar el estado de la cuenta
    var cuentaActiva: Boolean = true
// Variable Double para almacenar calificación con decimales
    val satisfaccion: Double = 9.5

// Impresión en consola usando interpolación de cadenas ($variable)
    println("INFORMACION DEL USUARIO")
    println("Nombre completo: $nombreCompleto")
    println("Edad: $edad")
    println("Correo: $correo")
    println("Telefono: $telefono")
    println("Cuenta activa: $cuentaActiva")
    println("Satisfaccion: $satisfaccion")

// Reasignación de valores en las variables declaradas con var
    edad = 21
    telefono = "8187654321"
    cuentaActiva = false

// Muestra los datos actualizados tras modificar las variables
    println("\nINFORMACION ACTUALIZADA")
    println("Nueva edad: $edad")
    println("Nuevo telefono: $telefono")
    println("Cuenta activa: $cuentaActiva")
}