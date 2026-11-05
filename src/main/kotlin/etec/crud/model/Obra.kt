package etec.crud.model

data class Obra(
    val id_obra: Int,
    val nombre: String,
    val direccion: String,
    val precio_metro_cliente: Float?,
    val estado: String?,
    val id_responsable: Int?
)
