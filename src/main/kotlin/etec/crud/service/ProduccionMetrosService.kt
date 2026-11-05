package etec.crud.service

import etec.crud.model.ProduccionMetros
import org.springframework.stereotype.Service

@Service
class ProduccionMetrosService {
    fun listar(): List<ProduccionMetros> = emptyList()
    fun guardar(entidad: ProduccionMetros): ProduccionMetros = entidad
}
