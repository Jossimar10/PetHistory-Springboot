package com.example.PetHistoy.models;

import java.sql.Date;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
public class EsquemaVacunas {

    private Date fecVacu;
    private String dosis;
    @EmbeddedId
    private EsquemasVacunasId id = new EsquemasVacunasId();

    @ManyToOne
    @MapsId("idVacuna")
    @JoinColumn(name = "Vacuna", foreignKey = @ForeignKey(name = "FK_vacu"))
    private Vacunas vacunas;

    @ManyToOne
    @MapsId("idMascota")
    @JoinColumn(name = "Mascota", foreignKey = @ForeignKey(name = "FK_masc"))
    private Mascota mascota;

    @ManyToOne(optional = false)
    @JoinColumn(name = "Usuario", foreignKey = @ForeignKey(name = "FK_Usuario_0"))
    private Usuario usuario;


}
