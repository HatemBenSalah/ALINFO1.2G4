package com.vermeg.g4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Local espritchargia =new Local("chargia","esprit cours de soire","Ariena");
      System.out.print(espritchargia);
      Local espritghazela =new Local("Gazela","esprit cours du jour","Ariena");
      System.out.print(espritghazela);
      if(espritchargia.equals(espritghazela))
      {
          System.out.print("meme local");

      }
      else
      {
          System.out.print("n'est pas le meme local");

      }

	}

}
