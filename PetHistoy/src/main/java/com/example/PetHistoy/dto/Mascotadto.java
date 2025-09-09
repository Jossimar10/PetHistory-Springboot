package com.example.PetHistoy.dto;

import java.security.Timestamp;
import java.sql.Date;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Mascotadto {
    
    @NotNull
    private Long idMasc;

    @NotNull
    @Size(min = 3, max = 50)
    private String masc;

    @NotNull
    private Date fecNam;

    @NotNull
    @Size(min = 3, max = 255)
    private String foto;



}
