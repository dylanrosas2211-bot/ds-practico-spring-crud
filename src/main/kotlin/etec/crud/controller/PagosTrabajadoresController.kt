package etec.crud.controller

import etec.crud.model.PagosTrabajadores
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/pagos-trabajadores")
class PagosTrabajadoresController {
    @GetMapping
    fun listar(): List<PagosTrabajadores> = emptyList()

    @PostMapping
    fun crear(@RequestBody entidad: PagosTrabajadores): PagosTrabajadores = entidad
}
