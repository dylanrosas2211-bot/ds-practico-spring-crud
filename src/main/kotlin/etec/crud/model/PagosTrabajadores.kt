package etec.crud.model

data class PagosTrabajadores(
    val id_pago: Int,
    val id_obra: Int?,
    val id_trabajador: Int?,
    val fecha: String?,
    val descripcion: String?,
    val monto: Float?
)
