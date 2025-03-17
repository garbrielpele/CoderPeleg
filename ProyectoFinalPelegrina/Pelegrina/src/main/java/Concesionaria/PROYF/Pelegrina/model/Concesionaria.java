package Concesionaria.PROYF.Pelegrina.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Concesionaria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;

    @OneToMany(mappedBy = "concesionaria", cascade = CascadeType.ALL)
    private List<Moto> motosEnStock;


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Moto> getMotosEnStock() {
        return this.motosEnStock;
    }

    public void setMotosEnStock(List<Moto> motosEnStock) {
        this.motosEnStock = motosEnStock;
    }
    
}
