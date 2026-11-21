fun main() {
    // Solicita datos por teclado y los convierte de String a Double para operar con decimales
    print("Capacidad total del dispositivo en GB: ")
    val capacidad = readln().toDouble()

    print("Espacio ocupado por aplicaciones en GB: ")
    val aplicaciones = readln().toDouble()

    print("Espacio ocupado por fotografias en GB: ")
    val fotografias = readln().toDouble()

    print("Espacio ocupado por videos en GB: ")
    val videos = readln().toDouble()

    // Evita división entre cero o capacidades negativas deteniendo el programa con return
    if (capacidad <= 0) {
        println("La capacidad debe ser mayor que cero.")
        return
    }

    // Valida con operador OR lógico (||) que ningún espacio ocupado sea menor a cero
    if (aplicaciones < 0 || fotografias < 0 || videos < 0) {
        println("Los espacios ocupados no pueden ser negativos.")
        return
    }

    // Suma los tres rubros para obtener el almacenamiento total ocupado
    val espacioUtilizado = aplicaciones + fotografias + videos

    // Verifica que la suma no exceda la capacidad física del dispositivo
    if (espacioUtilizado > capacidad) {
        println("El espacio ocupado supera la capacidad del dispositivo.")
        return
    }

    // Calcula el espacio libre mediante resta y el porcentaje mediante división y multiplicación
    val espacioDisponible = capacidad - espacioUtilizado
    val porcentaje = (espacioUtilizado / capacidad) * 100

    // Imprime el resumen formateado con unidades en GB y porcentaje
    println("\nRESUMEN DE ALMACENAMIENTO")
    println("Espacio utilizado: $espacioUtilizado GB")
    println("Espacio disponible: $espacioDisponible GB")
    println("Porcentaje ocupado: $porcentaje%")
}