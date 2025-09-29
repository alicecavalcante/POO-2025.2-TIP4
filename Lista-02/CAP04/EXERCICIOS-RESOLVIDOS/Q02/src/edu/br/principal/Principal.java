package edu.br.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		double media;
		double nota_exame;

		Scanner sc = new Scanner(System.in);
	
		System.out.println("Digite sua primeira nota: ");
		double n1 = sc.nextDouble();

		System.out.println("Digite sua segunda nota: ");
		double n2 = sc.nextDouble();

		System.out.println("Digite sua terceira nota: ");
		double n3 = sc.nextDouble();

		
		media = (n1 + n2 + n3)/3;


		if (media>=7 && media<=10) {

			System.out.println("Aprovado.");}

		
		else if(media>=3 && media<7){
			System.out.println("Exame.");
			System.out.println("Sua média atual é: " + media);
			nota_exame = 12 - media;

			System.out.println("A nota necessária para a aprovação é: " + nota_exame);}

		
		else {
			System.out.println("Reprovado.");
			}

	}

	}


