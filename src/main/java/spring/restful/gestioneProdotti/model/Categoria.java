package spring.restful.gestioneProdotti.model;

import java.util.List;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="categorie")
public class Categoria {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable=false, length=20)
	private String nomeCategoria;
	
	@OneToMany(mappedBy="categoria")
	private List<Prodotto> prodotti;
}
