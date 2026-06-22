package spring.restful.gestioneProdotti.model;

import java.util.List;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="marche")
public class Marca {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable=false, length=20)
	private String nomeMarca;
	
	@OneToMany(mappedBy="marca") // Nome della variabile
	private List<Prodotto> prodotti;
}
