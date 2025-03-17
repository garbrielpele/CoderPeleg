package Concesionaria.PROYF.Pelegrina.model;

import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
public class Moto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String marca;
    private String modelo;
    private int stock;

    @ManyToOne
    @JoinColumn(name = "concesionaria_id")
    private Concesionaria concesionaria;

    @ManyToOne
    @JoinColumn(name = "cliente_id", nullable = true)
    private Cliente cliente;

   
}
