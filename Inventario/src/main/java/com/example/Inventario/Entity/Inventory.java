package com.example.Inventario.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "inventario")
public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idInventario;

    @JoinColumn(name = "idProducto")
    private Integer producto;

    private Integer cantidad;
}
