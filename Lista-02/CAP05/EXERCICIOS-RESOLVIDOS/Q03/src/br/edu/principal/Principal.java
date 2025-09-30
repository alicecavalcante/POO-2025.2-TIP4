package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número inteiro positivo: ");
		int n = sc.nextInt();
		for (int num = 0; num <= n; num++) {
			int fat = 1;
			for (int j = 1; j <= num; j++) {
				fat *= j;
			}
			System.out.printf("%-10d %-10d\n", num, fat);
		}
		
	}

}
