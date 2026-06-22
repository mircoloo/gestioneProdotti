package spring.restful.gestioneProdotti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import spring.restful.gestioneProdotti.model.Prodotto;

@Repository
public interface ProdottoRepository extends JpaRepository<Prodotto, Long>{
	// save() -> crate se id=0; update se id!=0 ed esiste
	//findAll()
	//findById(Long id)
	//existsById(Long id)
	//deleteById(Long id)
}
