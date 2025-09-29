package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Atenção!"
				+ " Os valores fornecidos devem estar em ordem crescente, apenas o ultimo não precisa seguir a ordem. ");
		
		System.out.println("Digite o primeiro número: ");
		double n1 = sc.nextDouble();

		System.out.println("Digite o segundo número: ");
		double n2 = sc.nextDouble();
		
		System.out.println("Digite o terceiro número: ");
		double n3 = sc.nextDouble();
		
		System.out.println("Digite o quarto número: ");
		double n4 = sc.nextDouble();
		
		
		System.out.println("A ordem decrescente é :"); 
		
		if (n4 >= n3) {
            System.out.println(n4 + " - " + n3 + " - " + n2 + " - " + n1);
        } 
		else if (n4 >= n2) {
            System.out.println(n3 + " - " + n4 + " - " + n2 + " - " + n1);
        } 
		else if (n4 >= n1) {
            System.out.println(n3 + " - " + n2 + " - " + n4 + " - " + n1);
        } 
		else {
            System.out.println(n3 + " - " + n2 + " - " + n1 + " - " + n4);
        }
	}
}




