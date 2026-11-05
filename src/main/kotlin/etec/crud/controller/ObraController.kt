package etec.crud.controller

import etec.crud.model.Obra
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/obras")
class ObraController {
    @GetMapping
    fun listar(): List<Obra> = emptyList()

    @PostMapping
    fun crear(@RequestBody entidad: Obra): Obra = entidad
}
