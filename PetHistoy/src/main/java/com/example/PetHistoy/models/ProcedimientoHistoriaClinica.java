package com.example.PetHistoy.models;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
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

    @EmbeddedId
    private ProHistoriaClinicaID id = new ProHistoriaClinicaID();

    @ManyToOne
    @MapsId("idHistoria")
    @JoinColumn(name = "historia_id", foreignKey = @ForeignKey(name="FK_historia_proc"))
    private HistoriaClinica historiaClinica;
    
    @ManyToOne
    @MapsId("idProcedimiento")
    @JoinColumn(name = "procedimiento_id", foreignKey = @ForeignKey(name="FK_procedimiento_historia"))
    private Procedimiento procedimiento;

    @ManyToOne(optional = false)
    @JoinColumn(name = "UsuarioDoc", foreignKey = @ForeignKey(name = "FK_procedimientohisto_usuario"))
    private Usuario usuario;


}
