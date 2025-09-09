package com.example.PetHistoy.models;

import java.security.Timestamp;

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

public class Mascota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long IdMascota;

    @Column(length = 50, nullable = false)
    private String nom;

    @Column(nullable = false)
    private Timestamp fecNac;

    @Column(nullable = false)
    private Integer idColor;

    @Column(nullable = false)
    private Integer idEsquema;

    @Column(name = "Foto", length = 255)
    private String foto;

    @Column(name = "UsuarioDoc")
    private Long usuarioDoc;

    @Column(name = "IdRaza")
    private Integer idRaza;

}
