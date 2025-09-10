package mapper;


import org.springframework.stereotype.Component;

import com.example.PetHistoy.dto.Usuariodto;
import com.example.PetHistoy.models.Cuenta;
import com.example.PetHistoy.models.TipoDoc;
import com.example.PetHistoy.models.Usuario;

import jakarta.persistence.EntityNotFoundException;
import repository.CuentaRepository;
import repository.TipoDocRepository;

@Component
public class UsuarioMapperImple implements UsuarioMapper {

    private final TipoDocRepository tipoDocRepository;
    private final CuentaRepository cuentaRepository;

    public UsuarioMapperImple(CuentaRepository cuentaRepository, TipoDocRepository tipoDocRepository){
        this.cuentaRepository= cuentaRepository;
        this.tipoDocRepository= tipoDocRepository;

    }

    @Override
    public Usuario toUsuario (Usuariodto usuariodto){
        if (usuariodto ==null) {
            return null;
        }
    Usuario usuario = new Usuario();
    usuario.setDoc(usuariodto.getNumDoc());
    usuario.setNom(usuariodto.getNombre());
    usuario.setApe1(usuariodto.getApeUno());
    usuario.setApe2(usuariodto.getApeDos());
    usuario.setTel(usuariodto.getTelefono());
    usuario.setContrato(usuariodto.getNumContra());
    usuario.setDir(usuariodto.getDireccion());
    usuario.setFecNac(usuariodto.getFechaNac());

    TipoDoc tipoDoc = tipoDocRepository.findById(usuariodto.getTipdoc()).orElseThrow(()-> new EntityNotFoundException("Tipo de documento no encontrado"));
    usuario.setTipoDoc(tipoDoc);

    Cuenta cuenta = cuentaRepository.findById(usuariodto.getCorreo()).orElseThrow(()-> new EntityNotFoundException("Correo electronico no encontrado"));
    usuario.setCuenta(cuenta);
    cuenta.setContra(usuariodto.getPassw());

    return usuario;
    }
    
    @Override
    public Usuariodto toUsuariodto(Usuario usuario){
        if (usuario == null) {
            return null;
        }
        return new Usuariodto(
            usuario.getDoc(),
            usuario.getNom(),
            usuario.getApe1(),
            usuario.getApe2(),
            usuario.getTel(),
            usuario.getContrato(),
            usuario.getDir(),
            usuario.getFecNac(),
            usuario.getTipoDoc().getIdTipo(),
            usuario.getTipoDoc().getTipoDoc(),
            usuario.getCuenta().getCorreo(),
            usuario.getCuenta().getContra());
    }

}
