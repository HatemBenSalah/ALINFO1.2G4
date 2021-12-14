package com.vermeg.g4;

public class EtudiantAla {

	private int id;
	private String nompre;
	private int age;
	private int numTel; 
	
	
	//ala1
	//ala2
	//modif 4 alkhls
	//ajouter attribut et modifier to string et constructeurs. 
	//5eme 1Modif dimanchee
	//5eme Modif dimanchek
	//merge1
	

	
	public EtudiantAla() {
		
	}

	public EtudiantAla(int id, String nompre, int age) {
		super();
		this.id = id;
		this.nompre = nompre;
		this.age = age;
	}
	
	
	
	public EtudiantAla(int id, String nompre, int age, int numTel) {
		super();
		this.id = id;
		this.nompre = nompre;
		this.age = age;
		this.numTel = numTel;
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
	
	

	public int getNumTel() {
		return numTel;
	}

	public void setNumTel(int numTel) {
		this.numTel = numTel;
	}

	@Override
	public String toString() {
		return "EtudiantAla [id=" + id + ", nompre=" + nompre + ", age=" + age + ", numTel=" + numTel + "]";
	}

	
	
	
	
	
	

}
