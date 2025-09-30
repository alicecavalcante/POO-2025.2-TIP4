package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double n1, n2;
		System.out.println("Digite um número: ");
		n1 = sc.nextDouble();
		System.out.println("Digite outro número: ");
		n2 = sc.nextDouble();
		double menor;
		if (n1 < n2) {
			System.out.println("O menor número é: " + n1);
		}
		else if (n2 < n1) {
			System.out.println("O menor número é: " + n2);
		}
		else if (n1 == n2) {
			System.out.println("São o mesmo número.");

		}
	}

}
