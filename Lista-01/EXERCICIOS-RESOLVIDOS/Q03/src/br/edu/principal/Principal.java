package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Digite sua primeira nota: ");
		double n1 = sc.nextDouble();
		System.out.println("Digite o peso da sua primeira nota: ");
		double p1 = sc.nextDouble();
		
		System.out.println("Digite sua segunda nota: ");
		double n2 = sc.nextDouble();
		System.out.println("Digite o peso da sua segunda nota: ");
		double p2 = sc.nextDouble();
		
		System.out.println("Digite sua terceira nota: ");
		double n3 = sc.nextDouble();
		System.out.println("Digite o peso da sua terceira nota: ");
		double p3 = sc.nextDouble();
		
		double media = (n1*p1 + n2*p2 + n3*p3) / (p1 + p2 + p3);
		System.out.print("A sua média ponderada é: " + media );

	}

}
