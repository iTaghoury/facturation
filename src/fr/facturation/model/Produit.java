package fr.facturation.model;

public class Produit {
	private int quantite;
	private float prixUnitaire;
	private String nom;
	private Categorie categorie;
	
	
	/*
	 * Constructeur
	 */
	public Produit(int quantite, float prixUnitaire, String nom, Categorie categorie) {
		this.quantite = quantite;
		this.prixUnitaire = prixUnitaire;
		this.nom = nom;
		this.categorie = categorie;
	}
	
	/*
	 * GETTERS AND SETTERS
	 */
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public float getPrixUnitaire() {
		return prixUnitaire;
	}
	public void setPrixUnitaire(float prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Categorie getCategorie() {
		return categorie;
	}
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	
	
	
}
