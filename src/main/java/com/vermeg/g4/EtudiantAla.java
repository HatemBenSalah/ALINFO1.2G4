package com.vermeg.g4;

public class EtudiantAla {

	private int id;
	private String nompre;
	private int age;
	
	
	//ala1
	//ala2
	//modif 4 alkhls
	
	public EtudiantAla() {
		
	}

	public EtudiantAla(int id, String nompre, int age) {
		super();
		this.id = id;
		this.nompre = nompre;
		this.age = age;
	}
	
	public int getId() {
		return id;
		
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getNompre() {
		return nompre;
	}
	public void setNompre(String nompre) {
		this.nompre = nompre;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "EtudiantAla [id=" + id + ", nompre=" + nompre + ", age=" + age + "]";
	}
	
	
	
	
	

}
