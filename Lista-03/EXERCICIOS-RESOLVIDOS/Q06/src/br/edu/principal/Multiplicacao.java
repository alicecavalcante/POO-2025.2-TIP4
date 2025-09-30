package br.edu.principal;

public class Multiplicacao {

	public static void multiplicando(int n) {
		for (int numero = 1; numero <= n; numero++) {
			for (int num = 1; num <= numero; num++) {
				System.out.print((numero * num) + " ");
			}
			System.out.println();
		}
	}
}
