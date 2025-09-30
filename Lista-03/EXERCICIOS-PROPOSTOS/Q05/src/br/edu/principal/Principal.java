package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o numero inteiro para a verificação: ");
		int n = sc.nextInt();



		String resultado = Verificacao.ParImpar(n);
		System.out.println(resultado);
		

	}

}
