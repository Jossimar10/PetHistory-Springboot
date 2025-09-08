package com.example.PetHistoy.models;

import java.math.BigInteger;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Table(name = "Usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private BigInteger Doc;

    @Column(name = "TipoDoc", nullable = false)
    private Integer tipoDoc;

    @Column(length = 20, nullable = false)
    private String nom;

    @Column(length = 20, nullable = false)
    private String ape1;

    @Column(length = 20, nullable = false)
    private String ape2;

    @Column(nullable = false, length = 20)
    private BigInteger tel;

    @Column(nullable = false)
    private Integer contrato;

    @Column(nullable = false, length = 50)
    private String dir;

    @Column(name = "Correo", length = 100)
    private String correo;

    @Column(nullable = false)
    private Date fecNac;

    @Column(nullable = false)
    private Integer IdRol;

    @Column(nullable = false, length = 50)
    private String ContraseñaCorreoUsuario;

}
