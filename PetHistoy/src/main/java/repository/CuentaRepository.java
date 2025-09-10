package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.PetHistoy.models.Cuenta;

public interface CuentaRepository extends JpaRepository<Cuenta, String>{

}
