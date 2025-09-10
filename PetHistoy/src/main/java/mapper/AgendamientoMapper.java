package mapper;

import com.example.PetHistoy.dto.Agendamientodto;
import com.example.PetHistoy.models.Agendamiento;

public interface AgendamientoMapper {
    Agendamiento toAgendamiento(Agendamientodto agendamientodto);
    Agendamientodto toAgendamientodto(Agendamiento agendamiento);
}
