package spring.restful.gestioneProdotti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import spring.restful.gestioneProdotti.model.Prodotto;
import spring.restful.gestioneProdotti.repository.ProdottoRepository;

//è il controller di un microservizio. Come tale riceverà richieste
// in json e dovrà rispondere nello stesso modo

//localhost:8097 è l'endpoint del programma
//localhost:8097/api/prodotti per endpoint del controller

@RestController
@RequestMapping("/api/prodotti")
public class ProdottoController {
		
	@Autowired //DI: Dependency Injection
	private ProdottoRepository pr;
		
	@PostMapping("/inserimento")
	public String inserimento(@RequestBody Prodotto prodotto) {
		pr.save(prodotto);
		return "Inserimento avvenuto con successo";
	}
	
	@GetMapping("/leggi")
	public List<Prodotto> leggi() {
		return pr.findAll();
	}
	
	@PutMapping("/aggiorna")
	public String aggiorna() {
		return "Modifica avvenuta con successo";
	}
	
	@DeleteMapping("/inserimento")
	public String elimina() {
		return "Elimina avvenuta con successo";
	}
	
}
