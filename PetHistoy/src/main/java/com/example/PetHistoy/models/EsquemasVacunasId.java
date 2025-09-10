package com.example.PetHistoy.models;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Embeddable
public class EsquemasVacunasId implements Serializable {
    private Long idMascota;
    private Long idVacuna;
}
