package fr.facturation.domain;

import fr.facturation.model.*;

public class App {
	
	/**
	 * Crée une facture pour chaque client à partir d'une liste
	 * @param clients, la liste des clients
	 */
	public static void creerFactures(Client[] clients) {
		for(Client client : clients) {
			Facture facture = new Facture(client);
			creerListeProduits(facture);
			facture.calculTotal();
			afficherFacture(facture);
		}
	}
	
	/**
	 * Crée une liste de produits pour une facture
	 * @param facture
	 */
	
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
	
	/**
	 * Affiche les détails d'une facture dans la console
	 * @param facture, la facture à afficher
	 */
	
	public static void afficherFacture(Facture facture) {
		System.out.println(String.format("Client %s %s --------------", facture.getClient().getPrenom(), facture.getClient().getNom()));
		for(Produit produit : facture.getListeProduits()) {
			System.out.println(String.format("%s (%s) %d  *  %f", produit.getNom(), produit.getCategorie(), produit.getQuantite(), produit.getPrixUnitaire()));
		}
		System.out.println(String.format("Total                    %f\n", facture.getTotal()));
	}
	
}
