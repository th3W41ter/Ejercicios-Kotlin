// Declara cuatro funciones independientes que reciben dos Double y retornan un Double
fun sumar(a: Double, b: Double): Double {
    return a + b
}

fun restar(a: Double, b: Double): Double {
    return a - b
}

fun multiplicar(a: Double, b: Double): Double {
    return a * b
}

fun dividir(a: Double, b: Double): Double {
    return a / b
}

fun main() {
    // Solicita los dos operandos en consola y los convierte a tipo Double
    print("Ingresa el primer numero: ")
    
    val numero1 = readln().toDouble()

    print("Ingresa el segundo numero: ")
    val numero2 = readln().toDouble()

    // Muestra el menú de operaciones y lee la opción seleccionada como Int
    println("1. Sumar")
    println("2. Restar")
    println("3. Multiplicar")
    println("4. Dividir")

    // Estructura when que invoca la función correspondiente usando interpolación ${...}
    print("Selecciona una operacion: ")
    val opcion = readln().toInt()

    when (opcion) {
        1 -> println("Resultado: ${sumar(numero1, numero2)}")
        // Valida que el divisor (numero2) no sea 0.0 antes de llamar a dividir()
        2 -> println("Resultado: ${restar(numero1, numero2)}")
        3 -> println("Resultado: ${multiplicar(numero1, numero2)}")
        4 -> {
            if (numero2 == 0.0) {
                println("No se puede dividir entre cero.")
            } else {
                println("Resultado: ${dividir(numero1, numero2)}")
            }
        }
        else -> println("Opcion no valida.")
    }
}