package com.example.PetHistoy.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Veterinariadto {

    @NotNull
    private Long idVeteterinaria;
    @NotNull
    private String nombre;
    @NotNull
    private String correo;
    @NotNull
    private String foto;
    @NotNull
    private String direccion;
    
}
