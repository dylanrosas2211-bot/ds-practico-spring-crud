package etec.crud.model

data class Maquinas(
    val id_maquina: Int,
    val nombre: String,
    val marca_modelo: String?,
    val estado: String?,
    val id_obra: Int?
)
