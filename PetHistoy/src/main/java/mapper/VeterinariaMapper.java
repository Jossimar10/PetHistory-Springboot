package mapper;

import com.example.PetHistoy.dto.Veterinariadto;
import com.example.PetHistoy.models.Veterinaria;

public interface VeterinariaMapper {
    Veterinaria toVeterinaria(Veterinariadto veterinariadto);
    Veterinariadto toVeterinariadto(Veterinaria veterinaria);

}
