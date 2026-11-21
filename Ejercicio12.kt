class Bateria {
    // Encapsula la propiedad porcentaje con private para impedir modificaciones directas desde fuera
    private var porcentaje: Int = 100

    // Método público que permite leer de forma segura el nivel actual de batería
    fun consultarPorcentaje() {
        println("Bateria actual: $porcentaje%")
    }

    // Método consumir(): valida que la cantidad sea positiva y no supere el porcentaje disponible
    fun consumir(cantidad: Int) {
        if (cantidad <= 0) {
            println("La cantidad a consumir debe ser mayor que cero.")
        } else if (cantidad > porcentaje) {
            println("No hay suficiente bateria.")
        } else {
            porcentaje -= cantidad
            println("Consumo realizado.")
        }
    }

    // Método cargar(): valida que la carga sea positiva y que el total no rebase el 100%
    fun cargar(cantidad: Int) {
        if (cantidad <= 0) {
            println("La cantidad de carga debe ser mayor que cero.")
        } else if (porcentaje + cantidad > 100) {
            println("La carga no puede superar el 100%.")
        } else {
            porcentaje += cantidad
            println("Carga realizada.")
        }
    }
}

fun main() {
    // Prueba los métodos públicos de consulta, consumo y carga respetando las reglas de negocio
    val bateria = Bateria()
    bateria.consultarPorcentaje()

    bateria.consumir(30)
    bateria.consultarPorcentaje()

    bateria.cargar(20)
    bateria.consultarPorcentaje()

    // No se permite acceder directamente por ser private:
    // bateria.porcentaje = 50
}