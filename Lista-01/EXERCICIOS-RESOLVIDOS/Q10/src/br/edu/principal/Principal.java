package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor do raio da circunferência: ");
		Double raio = sc.nextDouble();
		Double quadradoDoRaio = Math.pow(raio, 2);
		Double area = Math.PI * quadradoDoRaio;
		System.out.println("A área do círculo é: " + area);
	}

}
