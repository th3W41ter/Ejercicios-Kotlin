// Función booleana que verifica con isNotBlank() que el nombre no esté vacío ni tenga solo espacios
fun validarNombre(nombre: String): Boolean {
    return nombre.isNotBlank()
}

// Función booleana que comprueba con contains("@") el formato básico del correo
fun validarCorreo(correo: String): Boolean {
    return correo.contains("@")
}

// Función booleana que valida que la edad sea mayor o igual a 18
fun validarEdad(edad: Int): Boolean {
    return edad >= 18
}

// Función booleana que exige una longitud mínima de 8 caracteres para la contraseña
fun validarContrasena(contrasena: String): Boolean {
    return contrasena.length >= 8
}

fun main() {
    print("Nombre: ")
    val nombre = readln()

    print("Correo: ")
    val correo = readln()

    print("Edad: ")
    val edad = readln().toInt()

    print("Contrasena: ")
    val contrasena = readln()

    // Invoca cada función de validación y guarda sus resultados Boolean
    val nombreValido = validarNombre(nombre)
    val correoValido = validarCorreo(correo)
    val edadValida = validarEdad(edad)
    val contrasenaValida = validarContrasena(contrasena)

    // Evalúa con el operador AND (&&) que todas las reglas se cumplan para permitir el registro
    println("\nRESULTADO DE VALIDACIONES")
    println("Nombre valido: $nombreValido")
    println("Correo valido: $correoValido")
    println("Edad valida: $edadValida")
    println("Contrasena valida: $contrasenaValida")

    if (nombreValido && correoValido && edadValida && contrasenaValida) {
        println("Informacion correcta. Registro permitido.")
    } else {
        println("Hay datos que necesitan corregirse.")
    }
}