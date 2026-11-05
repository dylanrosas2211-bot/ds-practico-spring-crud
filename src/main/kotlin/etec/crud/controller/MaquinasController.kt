package etec.crud.controller

import etec.crud.model.Maquinas
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/maquinas")
class MaquinasController {
    @GetMapping
    fun listar(): List<Maquinas> = emptyList()

    @PostMapping
    fun crear(@RequestBody entidad: Maquinas): Maquinas = entidad
}
