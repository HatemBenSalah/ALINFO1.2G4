package com.vermeg.g4;

public class Enseignant {
	private int id;
	private String nom;
	private String prenom;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Enseignant(int id, String nom, String prenom) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
	}
	@Override
	public String toString() {
		return "Enseignant [id=" + id + ", nom=" + nom + ", prenom=" + prenom + "]";
	}
	public void affichage() {
		System.out.println("done");
	}	
	public void ajouterEnseignant() {}
		//ajout
	public void amina()
	{
		System.out.println("methode ajouter de la part amina");

	}
	//commentaire
	
	public void imentest() {
		System.out.println("testest");
	}

}
