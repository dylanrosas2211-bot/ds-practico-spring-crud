package etec.crud.service

import etec.crud.model.PagosTrabajadores
import org.springframework.stereotype.Service

@Service
class PagosTrabajadoresService {
    fun listar(): List<PagosTrabajadores> = emptyList()
    fun guardar(entidad: PagosTrabajadores): PagosTrabajadores = entidad
}
