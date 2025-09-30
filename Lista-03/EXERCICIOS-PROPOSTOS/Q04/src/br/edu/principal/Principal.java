package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do raio da esfera: ");
		double r = sc.nextDouble();
		
		double volumeEsfera = Calculo.Volume(r);
		System.out.println("O volume da esfera de raio " + r + " é aproximadamente: " + volumeEsfera);

	}

}
