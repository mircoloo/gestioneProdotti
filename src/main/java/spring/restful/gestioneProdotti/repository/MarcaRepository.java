package spring.restful.gestioneProdotti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import spring.restful.gestioneProdotti.model.Categoria;
import spring.restful.gestioneProdotti.model.Marca;

@Repository
public interface MarcaRepository extends JpaRepository<Marca, Long>{
	public Marca findById(long id);
}
