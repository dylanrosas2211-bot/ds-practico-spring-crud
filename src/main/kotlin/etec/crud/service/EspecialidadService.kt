package etec.crud.service

import etec.crud.model.Especialidad
import org.springframework.stereotype.Service

@Service
class EspecialidadService {
    // Aquí conectarías con tu repositorio correspondiente
    fun listar(): List<Especialidad> = emptyList()
    fun guardar(entidad: Especialidad): Especialidad = entidad
}
