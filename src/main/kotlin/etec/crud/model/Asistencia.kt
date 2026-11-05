package etec.crud.model

data class Asistencia(
    val id_asistencia: Int,
    val id_trabajador: Int?,
    val id_obra: Int?,
    val fecha: String?,
    val dias_trabajados: Float?,
    val precio_dia_aplicado: Float?
)
