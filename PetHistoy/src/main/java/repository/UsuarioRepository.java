package repository;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.PetHistoy.models.Usuario;

public interface UsuarioRepository extends JpaRepository <Usuario, BigInteger>{

}
