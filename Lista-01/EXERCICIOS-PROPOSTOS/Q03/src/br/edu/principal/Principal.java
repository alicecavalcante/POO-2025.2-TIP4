package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do número 1: ");
		Double n1 =sc.nextDouble();

		System.out.println("Digite o valor do número 2: ");
		Double n2 =sc.nextDouble();

		double resultado = n1 / n2; 

		System.out.println("O resultado da divisão de " + n1  + "/" + n2 + " é: " + resultado);
	}

}
