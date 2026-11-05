package etec.crud.model

data class Trabajadores(
    val id_trabajador: Int,
    val nombre: String,
    val tarifa_personal: Float?,
    val id_especialidad: Int?
)
