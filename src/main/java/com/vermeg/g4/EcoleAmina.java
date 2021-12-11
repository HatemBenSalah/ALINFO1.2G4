package com.vermeg.g4;

import java.util.Objects;
// classe ll branch
// modification numero1
//modification numero2
//modification numero3
//modification numero3-1
//modification numero4
//modification numero5
public class EcoleAmina {
	private int id ; 
	private String nom ; 
	private String adrres ; 
	private int num_tel ;
	public EcoleAmina(int id, String nom, String adrres, int num_tel) {
		this.id = id;
		this.nom = nom;
		this.adrres = adrres;
		this.num_tel = num_tel;
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
	public String getAdrres() {
		return adrres;
	}
	public void setAdrres(String adrres) {
		this.adrres = adrres;
	}
	public int getNum_tel() {
		return num_tel;
	}
	public void setNum_tel(int num_tel) {
		this.num_tel = num_tel;
	}
	@Override
	public String toString() {
		return "EcoleAmina [id=" + id + ", nom=" + nom + ", adrres=" + adrres + ", num_tel=" + num_tel + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, num_tel);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EcoleAmina other = (EcoleAmina) obj;
		return id == other.id && num_tel == other.num_tel;
	} 
	public void methodeImen() {
		System.out.println("imen");
		
	}
}
