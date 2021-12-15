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
<<<<<<< HEAD
	
	public void ajouterEnseignant() {
		//ajout
=======
	public void amina()
	{
		System.out.println("methode ajouter de la part amina");

>>>>>>> 30aa63a7595d65de1d6a0e9b6c7c34215ff1fbfb
	}

}
