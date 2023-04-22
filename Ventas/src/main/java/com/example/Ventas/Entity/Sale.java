package com.example.Ventas.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "venta")
public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer idVenta;

    private Float total;

    private String folio;

    private Date fecha;

    @OneToOne
    @JoinColumn(name = "idCliente")
    private Integer idCliente;

}
