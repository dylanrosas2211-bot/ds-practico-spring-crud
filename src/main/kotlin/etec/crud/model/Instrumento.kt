package etec.crud.model
data class Instrumento(
    val id: Int,           // Este NUNCA puede ser null
    val nombre: String,     // Este NUNCA puede ser null
    val descripcion: String? // Este PUEDE ser null (fijate el ?)
)
