package com.example.Ventas.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "detalle")
public class Detail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDetalle;

    @OneToOne
    @JoinColumn(name = "idVenta")
    private Integer idVenta;

    @ManyToOne
    @JoinColumn(name = "idProducto")
    private Integer idProducto;

    private Float cantidad;

    private  float total;

}
