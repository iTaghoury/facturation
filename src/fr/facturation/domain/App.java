package fr.facturation.domain;

import fr.facturation.model.*;

public class App {
	
	public static void creerFacture(Client[] clients) {
		for(Client client : clients) {
			Facture facture = new Facture(client);
		}
	}
	
}
