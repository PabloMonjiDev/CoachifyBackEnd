package com.pablodelacruz.coachify.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;

@Data
@NoArgsConstructor
@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clienteID;

    private String nombreCompleto;
    private Date fechaNacimiento;
    private String genero;
    private String direccion;
    private String mail;
    private String telefono;

    // Constructor con todos los campos
    public Cliente(String nombreCompleto, Date fechaNacimiento, String genero, String direccion, String mail,
            String telefono) {
        this.nombreCompleto = nombreCompleto;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.direccion = direccion;
        this.mail = mail;
        this.telefono = telefono;
    }
}