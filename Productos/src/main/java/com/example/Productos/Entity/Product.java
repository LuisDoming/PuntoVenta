package com.example.Productos.Entity;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.Data;

@Data
@Entity
@Table(name = "producto")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProducto;

    private String nombre;

    private String marca;

    @JoinColumn(name = "idUnidadMedida")
    private UnidadMedida unidadMedida;

    private Float precio;

    private String codigo;

}
