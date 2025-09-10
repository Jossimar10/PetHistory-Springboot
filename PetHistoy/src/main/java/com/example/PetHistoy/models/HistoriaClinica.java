package com.example.PetHistoy.models;

import java.sql.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data

public class HistoriaClinica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idHistoria;
    private Date fechaIni;
    private String anotaciones;

    @OneToOne(cascade = CascadeType.ALL )
    @JoinColumn(name = "mascota_id", referencedColumnName = "idMascota", foreignKey = @ForeignKey(name = "FK_historiaclinica_mascota"))
    private Mascota mascota;

    
}
