package com.vermeg.g4;

import java.util.TreeSet;

public class LocalSet {
	private TreeSet <Local> localset ; 
	public LocalSet() {
		localset=new TreeSet();
	}
	public TreeSet<Local> getLocalset() {
		return localset;
	}
	public void setLocalset(TreeSet<Local> localset) {
		this.localset = localset;
	}
	@Override
	public String toString() {
		return "LocalSet [localset=" + localset + ", getLocalset()=" + getLocalset() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((localset == null) ? 0 : localset.hashCode());
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
		LocalSet other = (LocalSet) obj;
		if (localset == null) {
			if (other.localset != null)
				return false;
		} else if (!localset.equals(other.localset))
			return false;
		return true;
	}
	public void affichage() {
		System.out.println("test");
	}

}
