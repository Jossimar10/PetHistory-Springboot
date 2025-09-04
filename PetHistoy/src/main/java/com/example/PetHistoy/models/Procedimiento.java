package com.example.PetHistoy.models;

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
@Table(name = "Procedimiento")
public class Procedimiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long IdProcedimiento;

    @Column(length = 50, nullable = false)
    private String procedimiento;

    @Column( nullable = false)
    private Integer costo;

    @Column(nullable = false)
    private Date duracion;

    @Column(length = 500, nullable = false)
    private String anotaciones;



}
