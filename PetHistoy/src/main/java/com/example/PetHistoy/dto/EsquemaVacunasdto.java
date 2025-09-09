package com.example.PetHistoy.dto;

import java.sql.Date;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EsquemaVacunasdto {

    @NotNull
    private Long idEsque;

    @NotNull
    @Size(min = 3, max = 255)
    private String dos;

    @NotNull
    private Date fecVacu;
}
