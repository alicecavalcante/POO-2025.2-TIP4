package edu.br.principal;

public class Principal {

	public static void main(String[] args) {
		for (int num= 1; num <= 10; num++) {
	         System.out.println("Tabuada do número " + num + " :");
	         for (int alg = 1; alg <= 10; alg++) {
	        	 int valor = num * alg;
	        	 System.out.println(num + " * " + alg + " = " + valor);
	         }
	         System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
	    }

	}
}
