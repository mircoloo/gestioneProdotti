package spring.restful.gestioneProdotti.model;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Prodotto {
	
	private Long id;
	private String codiceMerceologico;
	private String descrizione;
	private int quantita;
	private double prezzo;
	private String marca;
	private String categoria;
	
}
