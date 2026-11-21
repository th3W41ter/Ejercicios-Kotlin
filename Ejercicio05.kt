fun main() {
    // Declara dos variables Boolean mutables (var) para guardar los estados de configuración
    var notificacionesActivas = true
    var modoOscuro = false

    // Muestra en consola las opciones del menú de configuración
    println("CONFIGURACION DE LA APLICACION")
    println("1. Activar notificaciones")
    println("2. Desactivar notificaciones")
    println("3. Activar modo oscuro")
    println("4. Consultar informacion")
    println("5. Salir")

    // Lee la opción elegida por el usuario y la convierte a entero (Int)
    print("Selecciona una opcion: ")
    val opcion = readln().toInt()

    // Estructura when que evalúa la opción ingresada y modifica el estado correspondiente
    when (opcion) {
        1 -> {
            notificacionesActivas = true
            println("Notificaciones activadas.")
        }
        2 -> {
            notificacionesActivas = false
            println("Notificaciones desactivadas.")
        }
        3 -> {
            modoOscuro = true
            println("Modo oscuro activado.")
        }
        4 -> {
            println("Aplicacion: Configuracion movil")
            println("Version: 1.0")
        }
        5 -> println("Has seleccionado salir.")
        // Rama else que captura cualquier número fuera del rango 1..5
        else -> println("Opcion no valida.")
    }

    // Imprime el estado final de las notificaciones y el modo oscuro
    println("\nESTADO ACTUAL")
    println("Notificaciones activas: $notificacionesActivas")
    println("Modo oscuro: $modoOscuro")
}