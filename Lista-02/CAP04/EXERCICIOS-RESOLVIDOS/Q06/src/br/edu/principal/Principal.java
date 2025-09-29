package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o número que deseja verificar: ");
		int n = sc.nextInt();
		
		if (n%2 ==0) {
			System.out.print("O número " + n + " é par.");
		}
		else {
			System.out.print("O número " + n + " é ímpar.");
		}

	}

}
