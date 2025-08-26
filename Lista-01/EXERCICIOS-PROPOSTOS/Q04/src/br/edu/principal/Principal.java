package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a nota 1: ");
		Double n1 = sc.nextDouble();
		
		System.out.println("Digite a nota 2: ");
		Double n2 = sc.nextDouble();
		
		Double media = ((n1*2)+(n2*3))/5;
		
		System.out.println("A média ponderada foi: " + media);
		
	}

}
