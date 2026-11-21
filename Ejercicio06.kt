fun main() {
    // Define la contraseña esperada, el límite máximo de 3 intentos, el contador y la bandera de acceso
    val contrasenaCorrecta = "Kotlin123"
    var intentos = 0
    val maximoIntentos = 3
    var accesoPermitido = false
    
    // Ciclo while que repite la solicitud mientras queden intentos y no se haya concedido el acceso
    while (intentos < maximoIntentos && !accesoPermitido) {
        print("Ingresa tu contrasena: ")
        // Lee la contraseña escrita por el usuario e incrementa en 1 el contador de intentos
        val contrasenaIngresada = readln()
        intentos++

        if (contrasenaIngresada == contrasenaCorrecta) {
            // Compara cadenas con ==; si coincide cambia accesoPermitido a true para terminar el ciclo
            accesoPermitido = true
            println("Acceso permitido.")
        } else {
            println("Contrasena incorrecta.")
            println("Intentos utilizados: $intentos")
        }
    }

    // Si tras agotar el ciclo el acceso sigue en false, muestra el mensaje de bloqueo
    if (!accesoPermitido) {
        println("Acceso bloqueado. Agotaste los intentos.")
    }
}