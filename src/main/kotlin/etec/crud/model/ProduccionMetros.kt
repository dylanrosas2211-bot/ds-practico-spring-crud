package etec.crud.model

data class ProduccionMetros(
    val id_produccion: Int,
    val id_obra: Int?,
    val id_trabajador: Int?,
    val metros_propios: Float?,
    val metros_cuadrados: Float?,
    val fecha: String?
)
