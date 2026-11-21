fun main() {
    // Inicializa el acumulador consumoTotal en 0.0 y la capacidad máxima en 100.0
    var consumoTotal = 0.0
    val bateriaInicial = 100.0

    // Ciclo for que itera exactamente 5 veces usando el rango 1..5
    for (periodo in 1..5) {
        print("Porcentaje consumido en el periodo $periodo: ")
        val consumo = readln().toDouble()

        // Valida que el consumo del periodo no sea un número negativo
        if (consumo < 0) {
            println("El consumo no puede ser negativo.")
            return
        }

        // Verifica que la suma acumulada no exceda el 100% de la batería inicial
        if (consumoTotal + consumo > bateriaInicial) {
            println("El consumo acumulado no puede superar el 100%.")
            return
        }

        // Suma el consumo válido del periodo al acumulador usando +=
        consumoTotal += consumo
    }

    // Calcula la batería restante y muestra el resumen final
    val bateriaRestante = bateriaInicial - consumoTotal
    println("\nRESUMEN DE BATERIA")
    println("Consumo total: $consumoTotal%")
    println("Bateria restante: $bateriaRestante%")
}