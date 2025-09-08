package com.example.PetHistoy.models;

import java.security.Timestamp;
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

public class Agendamiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long IdCita;

    @Column(nullable = false)
    private Timestamp fecAg;

    @Column(name = "fecAsi", nullable = false)
    private LocalDateTime fecAsi;

    @Column(nullable = false)
    private Long IdMascota;

    @Column(nullable = false)
    private Long IdEstado;

    @Column(nullable = false)
    private Long IdProcedimiento;

    @Column(nullable = false)
    private Long IdVet;
}
