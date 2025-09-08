package com.example.PetHistoy.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
@Table(name = "ProcedimientoHistoriaClinica")
public class ProcedimientoHistoriaClinica {

    @Id
    @Column(name = "IdProcedimiento", nullable = false)
    private Long idProcedimiento;

    @Column(name = "IdHistoria", nullable = false)
    private Integer idHistoria;

    @Column(length = 500, nullable = false)
    private String anotaciones;

    @Column(name = "usuarioDoc", nullable = false)
    private Integer usuarioDoc;
}
