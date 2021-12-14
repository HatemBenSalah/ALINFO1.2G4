package com.vermeg.g4;

public class Local {
	String adresse;
	String name;
	String gouvernement;
	public Local() {
		
	}
	public Local( String adr,String nom,String gov) {
		adresse=adr;
		this.name=nom;
		this.gouvernement=gov;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adresse == null) ? 0 : adresse.hashCode());
		result = prime * result + ((gouvernement == null) ? 0 : gouvernement.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Local other = (Local) obj;
		if (adresse == null) {
			if (other.adresse != null)
				return false;
		} else if (!adresse.equals(other.adresse))
			return false;
		if (gouvernement == null) {
			if (other.gouvernement != null)
				return false;
		} else if (!gouvernement.equals(other.gouvernement))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGouvernement() {
		return gouvernement;
	}
	public void setGouvernement(String gouvernement) {
		this.gouvernement = gouvernement;
	}
	@Override
	public String toString() {
		return "Local [adresse=" + adresse + ", name=" + name + ", gouvernement=" + gouvernement + ", hashCode()="
				+ hashCode() + ", getAdresse()=" + getAdresse() + ", getName()=" + getName() + ", getGouvernement()="
				+ getGouvernement() + "]";
	}
	
	

}
