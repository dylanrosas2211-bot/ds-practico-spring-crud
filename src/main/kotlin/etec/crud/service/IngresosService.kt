package etec.crud.service

import etec.crud.model.Ingresos
import org.springframework.stereotype.Service

@Service
class IngresosService {
    fun listar(): List<Ingresos> = emptyList()
    fun guardar(entidad: Ingresos): Ingresos = entidad
}
