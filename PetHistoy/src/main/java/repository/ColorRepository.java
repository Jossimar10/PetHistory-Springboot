package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.PetHistoy.models.Color;

public interface ColorRepository extends JpaRepository <Color, Long>{

}
