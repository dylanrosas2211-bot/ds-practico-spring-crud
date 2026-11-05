package etec.crud.controller

import etec.crud.model.Especialidad
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/especialidades")
class EspecialidadController {
    @GetMapping
    fun listar(): List<Especialidad> = emptyList()

    @PostMapping
    fun crear(@RequestBody entidad: Especialidad): Especialidad = entidad
}
