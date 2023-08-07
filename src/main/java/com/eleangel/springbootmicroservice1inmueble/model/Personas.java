package com.eleangel.springbootmicroservice1inmueble.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="personas")
public class Personas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre",length = 100,nullable = false)
    private String nombre;

    @Column(name = "correo",length = 100,nullable = false)
    private String correo;

    @Column(name = "fecha_nacimiento",nullable = false)
    private Date fecha_nacimiento;

    @Column(name = "edad",nullable = false)
    private Integer edad;

    @Column(name = "telefono",length = 50,nullable = false)
    private Integer telefono;

}
