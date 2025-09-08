package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.PetHistoy.models.Especie;

public interface EspecieRepository extends JpaRepository <Especie, Long>{

}
