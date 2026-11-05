package etec.crud.controller

import etec.crud.model.Trabajadores
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/trabajadores")
class TrabajadoresController {
    @GetMapping
    fun listar(): List<Trabajadores> = emptyList()

    @PostMapping
    fun crear(@RequestBody entidad: Trabajadores): Trabajadores = entidad
}
