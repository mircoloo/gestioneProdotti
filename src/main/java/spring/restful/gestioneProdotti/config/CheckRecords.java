package spring.restful.gestioneProdotti.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;

import spring.restful.gestioneProdotti.model.Categoria;
import spring.restful.gestioneProdotti.model.Marca;
import spring.restful.gestioneProdotti.repository.CategoriaRepository;
import spring.restful.gestioneProdotti.repository.MarcaRepository;
import spring.restful.gestioneProdotti.repository.ProdottoRepository;

@Configuration
public class CheckRecords {
	
	@Autowired
	private CategoriaRepository cr;
	@Autowired
	private MarcaRepository mr;
	
	@Bean
	public String checkCategoria() {
		List<Categoria> categorie = cr.findAll();
		Categoria categoria = new Categoria();
		if(categorie.isEmpty()) {
			categoria.setNomeCategoria("Abbigliamento");
			cr.save(categoria);
			categoria.setNomeCategoria("Attrezzatura");
			cr.save(categoria);
		}else {
			System.out.println("Categorie caricate!");
		}
	
		return null;
	}
	
	
	@Bean
	public String checkMarca() {
		List<Marca> categorie = mr.findAll();
		Marca marca = new Marca();
		if(categorie.isEmpty()) {
			marca.setNomeMarca("Nike");
			mr.save(marca);
			marca.setNomeMarca("Adidas");
			mr.save(marca);
			marca.setNomeMarca("Puma");
			mr.save(marca);
		}else {
			System.out.println("Marche caricate!");
		}
	
		return null;
	}
	
}
