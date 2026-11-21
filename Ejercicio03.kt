fun main() {
    // Lee el nombre (String), convierte el precio a Double y la cantidad a Int
    print("Nombre del producto: ")
    val producto = readln()

    print("Precio unitario: $")
    val precio = readln().toDouble()

    print("Cantidad que desea comprar: ")
    val cantidad = readln().toInt()

    // Valida que el precio no sea negativo y que se compre al menos 1 unidad
    if (precio < 0 || cantidad <= 0) {
        println("El precio no puede ser negativo y la cantidad debe ser mayor que cero.")
        return
    }

    // Calcula por separado el subtotal, el 16% de IVA y el total final
    val subtotal = precio * cantidad
    val iva = subtotal * 0.16
    val total = subtotal + iva

    // Muestra el desglose completo de la compra en consola
    println("\nDETALLE DE COMPRA")
    println("Producto: $producto")
    println("Precio unitario: $precio")
    println("Cantidad: $cantidad")
    println("Subtotal: $subtotal")
    println("IVA (16%): $iva")
    println("Total a pagar: $total")
}