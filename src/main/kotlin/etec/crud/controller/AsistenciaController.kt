package etec.crud.controller

import etec.crud.model.Asistencia
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/asistencias")
class AsistenciaController {
    @GetMapping
    fun listar(): List<Asistencia> = emptyList()

    @PostMapping
    fun crear(@RequestBody entidad: Asistencia): Asistencia = entidad
}
