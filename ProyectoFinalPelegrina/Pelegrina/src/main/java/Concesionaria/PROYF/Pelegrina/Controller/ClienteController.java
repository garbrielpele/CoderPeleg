package Concesionaria.PROYF.Pelegrina.Controller;

import org.springframework.web.bind.annotation.*;
import Concesionaria.PROYF.Pelegrina.Service.ClienteService;
import Concesionaria.PROYF.Pelegrina.model.Cliente;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    private final ClienteService service;

    public ClienteController(ClienteService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public Cliente obtenerCliente(@PathVariable Long id) {
        return service.obtenerCliente(id);
    }
}
