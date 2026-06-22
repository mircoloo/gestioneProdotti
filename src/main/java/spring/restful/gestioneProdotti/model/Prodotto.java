package spring.restful.gestioneProdotti.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="prodotti")
public class Prodotto {
	
	@Id //PK
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable=false, length=20)
	private String codiceMerceologico;
	
	@Column
	private String descrizione;
	
	@Column
	private int quantita;
	
	@Column
	private double prezzo;
	
	@Column(nullable=false, length=20)
	private String marca;
	
	@Column(nullable=false, length=20)
	private String categoria;
	
}
