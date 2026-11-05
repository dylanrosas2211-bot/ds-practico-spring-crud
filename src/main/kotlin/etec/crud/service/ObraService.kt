package etec.crud.service

import etec.crud.model.Obra
import org.springframework.stereotype.Service

@Service
class ObraService {
    fun listar(): List<Obra> = emptyList()
    fun guardar(entidad: Obra): Obra = entidad
}
