package spring.restful.gestioneProdotti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import spring.restful.gestioneProdotti.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
	public Categoria findById(long id);
}
