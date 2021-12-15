package com.vermeg.g4;

public class FirstClass {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
       System.out.print("test");
       
//heyyy
		// TODO Auto-generated method stub
       System.out.print("test");
       

		// TODO Auto-generated method stub
		Responsable resp =new Responsable(98,"Chamakh","Med_malek","25/12/1998");
		System.out.println(resp);
		Responsable resp1 =new Responsable(101,"bensalah","Hatem","14/10/1998");
		System.out.println(resp1);
		Responsable resp3 =new Responsable(101,"abbes","imen","12/08/1999");
		System.out.println(resp3);
		if (resp.equals(resp1))
		{
			System.out.println("responsable egaux");
		}
         Local l =new Local();
         System.out.print(l);

	}
// test
}


