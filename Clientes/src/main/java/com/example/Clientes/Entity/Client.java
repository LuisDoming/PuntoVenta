package com.example.Clientes.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "cliente")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCliente;

    private String nombre;

    private String correo;

    private String RFC;

    private String telefono;

    private String contrasenia;

}
