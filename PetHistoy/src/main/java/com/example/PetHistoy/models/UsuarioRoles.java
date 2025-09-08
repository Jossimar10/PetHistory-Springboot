package com.example.PetHistoy.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter

public class UsuarioRoles {

    @Id
    @Column(name = "UsuarioDoc", nullable = false)
    private Long usuarioDoc;  

    @Column(name = "VeterinariasIdVet", nullable = false)
    private Long veterinariasIdVet;

    @Column(name = "IdRol", nullable = false)
    private Integer idRol;  
}
