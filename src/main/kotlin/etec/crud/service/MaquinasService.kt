package etec.crud.service

import etec.crud.model.Maquinas
import org.springframework.stereotype.Service

@Service
class MaquinasService {
    fun listar(): List<Maquinas> = emptyList()
    fun guardar(entidad: Maquinas): Maquinas = entidad
}
