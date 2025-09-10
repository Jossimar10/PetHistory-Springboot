package mapper;

import org.springframework.stereotype.Component;

import com.example.PetHistoy.dto.Agendamientodto;
import com.example.PetHistoy.models.Agendamiento;

@Component
public class AgendamientoMapperImple implements AgendamientoMapper{

    @Override
    public Agendamiento toAgendamiento(Agendamientodto agendamientodto) {
        Agendamiento agendamiento = new Agendamiento();
        agendamiento.setIdCita(agendamientodto.getIdCita());
        agendamiento.setFecAg(agendamientodto.getFecAg());
        agendamiento.setFecAsi(agendamientodto.getFecAsi());
        agendamiento.setProcedimiento(agendamientodto.getProcedimientos());
        agendamiento.setVeterinaria(agendamientodto.getVeterinaria());
        agendamiento.setEstado(agendamientodto.getEstados());
        return agendamiento;
    }

    @Override
    public Agendamientodto toAgendamientodto(Agendamiento entity){
        return new Agendamientodto(
            entity.getIdCita(),
            entity.getFecAg(),
            entity.getFecAsi(),
            entity.getProcedimiento(),
            entity.getVeterinaria(),
            entity.getEstado());
    }
}



