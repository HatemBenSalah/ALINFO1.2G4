package com.vermeg.g4;

import java.util.Objects;

public class Responsable {
	//1ere commit
	 public int id;
	 public String nom ;
	 public String prenom;
	 public String date_naissance;
	//2eme commit
	public Responsable() {
		
	}
	public Responsable(int id, String nom, String prenom, String date_naissance) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.date_naissance = date_naissance;
	}
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
	public String getDate_naissance() {
		return date_naissance;
	}
	public void setDate_naissance(String date_naissance) {
		this.date_naissance = date_naissance;
	}
	@Override
	public int hashCode() {
		return Objects.hash(date_naissance, id, nom, prenom);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Responsable other = (Responsable) obj;
		return Objects.equals(date_naissance, other.date_naissance) && id == other.id && Objects.equals(nom, other.nom)
				&& Objects.equals(prenom, other.prenom);
	}
	//3eme commit toString
	@Override
	public String toString() {
		return "Responsable [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", date_naissance=" + date_naissance + "]";
	}
	public void methodedeamina()
	{
		System.out.println("amina master");

	}
	}
