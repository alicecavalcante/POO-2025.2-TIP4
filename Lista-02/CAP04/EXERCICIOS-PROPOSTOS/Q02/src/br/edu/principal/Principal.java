package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite sua primeira nota: ");
		Double num1 =sc.nextDouble();

		System.out.println("Digite sua segunda nota:");
		Double num2 =sc.nextDouble();


		Double media = (num1+num2) /2;


		if ( media>=7 ) {
			System.out.println("Média: " + media);
		    System.out.println("Situação: Aprovado.");
		}

		else if (media >=3 && media<7) {
			System.out.println("Média: " + media);
			System.out.println("Situação: Exame.");
		}

		else {
			System.out.println("Média: " + media);
			System.out.println("Situação: Reprovado.");
		}
	}

}
