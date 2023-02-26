package fr.facturation.domain;

import fr.facturation.model.Client;

public class Main {

	public static void main(String[] args) {
		
		Client[] listeClients = {
				new Client(),
				new Client("Taghoury", "Idriss"),
				new Client("Dupont", "Charles")
		};
		
		App.creerFacture(listeClients);

	}

}
