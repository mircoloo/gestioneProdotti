package spring.restful.gestioneProdotti;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import spring.restful.gestioneProdotti.model.Prodotto;

@SpringBootApplication
public class GestioneProdottiApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestioneProdottiApplication.class, args);
		System.out.println("App in ascolto alla porta 8097: ");
	}

}
