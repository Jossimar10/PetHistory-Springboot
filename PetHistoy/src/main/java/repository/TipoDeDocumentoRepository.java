package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.PetHistoy.models.TipoDoc;

public interface TipoDeDocumentoRepository extends JpaRepository <TipoDoc, Integer>{

}
