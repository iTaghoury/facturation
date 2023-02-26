package fr.facturation.model;

import java.util.LinkedList;

public class Facture {
	
	LinkedList<Produit> listeProduits;
	private Client client;
	private float total;
	
	/*
	 * Constructeur
	 */
	
	public Facture(Client client) {
		this.listeProduits = new LinkedList<Produit>();
		this.client = client;
		this.total = 0;
	}
	
	/*
	 * GETTERS AND SETTERS
	 */
	public LinkedList<Produit> getListeProduits() {
		return listeProduits;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	/**
	 * Calcule le total de la facture
	 */
	public void calculTotal() {
		float sum = 0;
		for(Produit produit : this.listeProduits) {
			sum += produit.getPrixUnitaire() * produit.getQuantite();
		}
		this.setTotal(sum);
	}
	
	
}
