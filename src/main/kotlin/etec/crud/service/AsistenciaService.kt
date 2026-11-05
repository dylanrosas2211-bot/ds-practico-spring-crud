package etec.crud.service

import etec.crud.model.Asistencia
import org.springframework.stereotype.Service

@Service
class AsistenciaService {
    fun listar(): List<Asistencia> = emptyList()
    fun guardar(entidad: Asistencia): Asistencia = entidad
}
