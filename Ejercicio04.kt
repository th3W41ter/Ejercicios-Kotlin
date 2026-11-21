fun main() {
    // Solicita la edad al usuario y la convierte a número entero (Int)
    print("Ingresa tu edad: ")
    val edad = readln().toInt()

    // Primera condición: descarta edades negativas inválidas
    if (edad < 0) {
        println("La edad no puede ser negativa.")
        // Segunda condición: verifica si cumple con la mayoría de edad (>= 18)
    } else if (edad >= 18) {
        println("Registro permitido. Puedes continuar.")
    } else {
        // Rama else: bloquea el registro si la edad está entre 0 y 17 años
        println("Registro no permitido: necesitas tener 18 años.")
    }
}