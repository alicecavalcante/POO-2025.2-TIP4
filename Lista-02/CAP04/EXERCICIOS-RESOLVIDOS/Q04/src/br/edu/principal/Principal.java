package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro número: ");
		double n1 = sc.nextDouble();

		System.out.println("Digite o segundo número: ");
		double n2 = sc.nextDouble();
		
		System.out.println("Digite o terceiro número: ");
		double n3 = sc.nextDouble();
		
		if (n1>n2 && n1>n3 && n2>n3) {
			System.out.println(n3 + " - " + n2 + " - " + n1);
		}
		else if (n1>n2 && n1>n3 && n2<n3) {
			System.out.println(n2 + " - " + n3 + " - " + n1);
		}
		
		
		else if (n2>n1 && n2>n3 && n1>n3) {
			System.out.println(n3 + " - " + n1 + " - " + n2);
		}
		else if (n2>n1 && n2>n3 && n1<n3) {
			System.out.println(n1 + " - " + n3 + " - " + n2);
		}
		
		else if (n3>n1 && n3>n2 && n2>n1) {
			System.out.println(n1 + " - " + n2 + " - " + n3);
		}
		else {
			System.out.println(n2 + " - " + n1 + " - " + n3);
		}
	}

}
