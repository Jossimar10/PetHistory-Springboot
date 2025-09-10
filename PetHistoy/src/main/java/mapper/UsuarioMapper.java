package mapper;

import com.example.PetHistoy.dto.Usuariodto;
import com.example.PetHistoy.models.Usuario;

public interface UsuarioMapper {
    Usuario toUsuario(Usuariodto usuariodto);
    Usuariodto toUsuariodto(Usuario usuario);

}
