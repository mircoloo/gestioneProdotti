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
	
	@Column(nullable=false, length=20)
	private String nomeProdotto;
	
	@Column
	private String descrizione;
	
	@Column
	private int quantita;
	
	@Column
	private double prezzo;
	
	@ManyToOne
	@JoinColumn(name="id_marca", referencedColumnName="id")
	private Marca marca;
	
	@ManyToOne
	@JoinColumn(name="id_categoria", referencedColumnName="id")
	private Categoria categoria;
	
}
