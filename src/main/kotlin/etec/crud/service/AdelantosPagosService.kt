package etec.crud.service

import etec.crud.model.AdelantosPagos
import org.springframework.stereotype.Service

@Service
class AdelantosPagosService {
    fun listar(): List<AdelantosPagos> = emptyList()
    fun guardar(entidad: AdelantosPagos): AdelantosPagos = entidad
}
