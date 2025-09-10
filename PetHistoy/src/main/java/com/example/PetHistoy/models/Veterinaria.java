package com.example.PetHistoy.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data

public class Veterinaria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVet;
    private String nom;
    private String correo;
    private String foto;
    private String direc;


}
