package com.example.PetHistoy.dto;

import java.sql.Time;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Procedimientodto {

    private Long idProcedimiento;

    @NotNull
    @Size(max = 50)
    private String procedimiento;

    @NotNull
    private String costo;

    @NotNull
    private Time duracion;

    @NotNull
    @Size(max = 500)
    private String anotaciones;
}
