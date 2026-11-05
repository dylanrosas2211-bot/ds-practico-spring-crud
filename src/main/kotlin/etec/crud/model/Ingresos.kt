package etec.crud.model

data class Ingresos(
    val id_ingreso: Int,
    val id_obra: Int?,
    val monto: Float?,
    val fecha: String?
)
