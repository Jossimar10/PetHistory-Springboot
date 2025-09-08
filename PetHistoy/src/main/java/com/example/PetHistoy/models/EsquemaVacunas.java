package com.example.PetHistoy.models;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter

public class EsquemaVacunas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long IdEsquema;

    @Column(name = "Dosis", length = 255)
    private String dosis;

    @Column(name = "fecVacuna", nullable = false)
    private LocalDateTime fecVacuna;

    @Column(nullable = false)
    private Long IdVacuna;

    @Column(nullable = false)
    private Long IdMascota;

    @Column(name = "UsuarioDoc")
    private Long usuarioDoc;


}
