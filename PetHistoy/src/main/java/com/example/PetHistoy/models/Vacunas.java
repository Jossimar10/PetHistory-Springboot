package com.example.PetHistoy.models;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Vacunas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long IdVacuna;

    @Column(length = 50, nullable = false)
    private String vacuna;

    @Column(nullable = false)
    private Integer idEspecie;

    @Column(nullable = false)
    private Integer costo;

    @Column(name = "Dosis", length = 255)
    private String dosis;

    @Column(name = "Duracion", length = 255)
    private String duracion;
    
}
