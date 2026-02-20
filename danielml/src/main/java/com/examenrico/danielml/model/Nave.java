package com.examenrico.danielml.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "nave")
@NoArgsConstructor
@Data
public class Nave {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre_nave")
    private String nombre_nave;

    @Column(name = "modelo")
    private String modelo;

    @Column(name = "capacidad")
    private int capacidad;
    
}
