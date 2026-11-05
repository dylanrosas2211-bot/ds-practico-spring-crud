package etec.crud.service

import etec.crud.model.Responsable
import org.springframework.stereotype.Service

@Service
class ResponsableService {
    fun listar(): List<Responsable> = emptyList()
    fun guardar(entidad: Responsable): Responsable = entidad
}
