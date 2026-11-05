package etec.crud.model

data class AdelantosPagos(
    val id_adelanto: Int,
    val id_obra: Int?,
    val id_trabajador: Int?,
    val monto: Float?,
    val fecha: String?
)
