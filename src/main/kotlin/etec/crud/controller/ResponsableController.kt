package etec.crud.controller

import etec.crud.model.Responsable
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/responsables")
class ResponsableController {
    @GetMapping
    fun listar(): List<Responsable> = emptyList()

    @PostMapping
    fun crear(@RequestBody entidad: Responsable): Responsable = entidad
}
