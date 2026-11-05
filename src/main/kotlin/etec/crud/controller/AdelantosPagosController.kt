package etec.crud.controller

import etec.crud.model.AdelantosPagos
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/adelantos-pagos")
class AdelantosPagosController {
    @GetMapping
    fun listar(): List<AdelantosPagos> = emptyList()

    @PostMapping
    fun crear(@RequestBody entidad: AdelantosPagos): AdelantosPagos = entidad
}
