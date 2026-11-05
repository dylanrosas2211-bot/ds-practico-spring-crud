package etec.crud.service

import etec.crud.model.Trabajadores
import org.springframework.stereotype.Service

@Service
class TrabajadoresService {
    fun listar(): List<Trabajadores> = emptyList()
    fun guardar(entidad: Trabajadores): Trabajadores = entidad
}
