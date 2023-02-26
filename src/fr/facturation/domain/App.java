package fr.facturation.domain;

import fr.facturation.model.*;

public class App {
	
	public static void creerFacture(Client[] clients) {
		for(Client client : clients) {
			Facture facture = new Facture(client);
			creerListeProduits(facture);
		}
	}
	
	public static void creerListeProduits(Facture facture) {
		Produit[] produits = {
				new Produit(2, 4.50f, "Steak haché", Categorie.VIANDE),
				new Produit(1, 12f, "Lessive", Categorie.MENAGER),
				new Produit(1, 2.30f, "Penne 500g", Categorie.PATES)
		};
		
		for(Produit produit : produits) {
			facture.getListeProduits().add(produit);
		}
	}
	
}
