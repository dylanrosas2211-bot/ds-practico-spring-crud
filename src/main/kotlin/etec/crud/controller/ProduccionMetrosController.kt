package etec.crud.controller

import etec.crud.model.ProduccionMetros
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/produccion-metros")
class ProduccionMetrosController {
    @GetMapping
    fun listar(): List<ProduccionMetros> = emptyList()

    @PostMapping
    fun crear(@RequestBody entidad: ProduccionMetros): ProduccionMetros = entidad
}
