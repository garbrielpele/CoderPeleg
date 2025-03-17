package Concesionaria.PROYF.Pelegrina.Controller;

import Concesionaria.PROYF.Pelegrina.Service.ConcesionariaService;
import Concesionaria.PROYF.Pelegrina.model.Concesionaria;
import Concesionaria.PROYF.Pelegrina.model.Moto;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/concesionarias")
public class ConcesionariaController {
    private final ConcesionariaService service;

    public ConcesionariaController(ConcesionariaService service) {
        this.service = service;
    }

    @GetMapping
    public List<Concesionaria> listarConcesionarias() {
        return service.obtenerTodas();
    }
    @PostMapping
    public ResponseEntity<Concesionaria> crearConcesionaria(@RequestBody Concesionaria concesionaria) {
    Concesionaria nuevaConcesionaria = service.guardarConcesionaria(concesionaria);
    return new ResponseEntity<>(nuevaConcesionaria, HttpStatus.CREATED);
}
@PostMapping("/{id}/motos")
    public ResponseEntity<Concesionaria> agregarMoto(@PathVariable Long id, @RequestBody Moto moto) {
    Concesionaria concesionariaActualizada = service.agregarMotoAConcesionaria(id, moto);
    return new ResponseEntity<>(concesionariaActualizada, HttpStatus.CREATED);
}

    
}
