package etec.crud.controller

import etec.crud.model.Ingresos
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/ingresos")
class IngresosController {
    @GetMapping
    fun listar(): List<Ingresos> = emptyList()

    @PostMapping
    fun crear(@RequestBody entidad: Ingresos): Ingresos = entidad
}
