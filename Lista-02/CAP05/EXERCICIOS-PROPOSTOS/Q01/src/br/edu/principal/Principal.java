package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			for (int g = 1; g <= 5; g++) {
				System.out.println("Grupo " + g);
				System.out.println("Digite o primeiro elemento: ");
				int a = sc.nextInt();
				System.out.println("Digite o segundo elemento: ");
				int b = sc.nextInt();
				System.out.println("Digite o terceiro elemento: ");
				int c = sc.nextInt();
				System.out.println("Digite o quarto elemento: ");
				int d = sc.nextInt();
				System.out.println("Grupo " + g + " --> " + a + ", " + b  + ", " + c + ", " + d);
			    if (a > b) { int t = a; a = b; b = t; }
			    if (a > c) { int t = a; a = c; c = t; }
			    if (a > d) { int t = a; a = d; d = t; }
			    if (b > c) { int t = b; b = c; c = t; }
			    if (b > d) { int t = b; b = d; d = t; }
			    if (c > d) { int t = c; c = d; d = t; }
			    System.out.println("Em ordem crescente: " + a + ", " + b + ", " + c + ", " + d);
			    System.out.println("Em ordem decrescente: " + d + ", " + c + ", " + b + ", " + a);
			}
	}
}
