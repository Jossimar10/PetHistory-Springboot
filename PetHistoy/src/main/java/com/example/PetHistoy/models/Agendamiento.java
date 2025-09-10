package com.example.PetHistoy.models;


import java.security.Timestamp;
import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "agendamiento")
public class Agendamiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCita;

    @NotNull
    private Timestamp fecAg;
    @NotNull
    private Date fecAsi;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_mascota", foreignKey = @ForeignKey(name = "FK_mascota"))
    private Mascota mascota;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_procedimiento", foreignKey = @ForeignKey(name = "FK_procedimiento"))
    private Procedimiento procedimiento;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_veterinaria", foreignKey = @ForeignKey(name = "FK_veterinaria"))
    private Veterinaria veterinaria;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_estado", foreignKey = @ForeignKey(name = "FK_estado"))
    private Estado estado;

}
