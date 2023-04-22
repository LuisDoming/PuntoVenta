package com.example.Productos.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "unidadmedida")
public class UnidadMedida {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUnidadMedida;

    private String nombre;

    private String codigo;
}
