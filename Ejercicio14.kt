// Clase base open Notificacion con el método enviar() marcado como open para ser sobrescrito
open class Notificacion {
    open fun enviar() {
        println("Enviando una notificacion general.")
    }
}

// Tres clases hijas que usan override para personalizar el comportamiento del método enviar()
class NotificacionCorreo : Notificacion() {
    override fun enviar() {
        println("Enviando notificacion por correo electronico.")
    }
}

class NotificacionSMS : Notificacion() {
    override fun enviar() {
        println("Enviando notificacion por mensaje SMS.")
    }
}

class NotificacionPush : Notificacion() {
    override fun enviar() {
        println("Enviando notificacion push al dispositivo.")
    }
}

fun main() {
    // Lista polimórfica de tipo List<Notificacion> que agrupa instancias de distintos subtipos
    val notificaciones: List<Notificacion> = listOf(
        NotificacionCorreo(),
        NotificacionSMS(),
        NotificacionPush()
    )

    // Recorre la lista y ejecuta la implementación específica de enviar() según cada objeto
    for (notificacion in notificaciones) {
        notificacion.enviar()
    }
}