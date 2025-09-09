package com.example.PetHistoy.dto;

import java.security.Timestamp;
import java.sql.Date;

import com.example.PetHistoy.models.Estado;
import com.example.PetHistoy.models.Procedimiento;
import com.example.PetHistoy.models.Veterinaria;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Agendamientodto {
   
    @NotNull
    private Long idCita;

    @NotNull
    private Timestamp fecAg;

    @NotNull
    private Date fecAsi;

    @NotNull
    private Procedimiento procedimientos;

    @NotNull
    private Veterinaria veterinaria;

    @NotNull
    private Estado estados;
    
}
