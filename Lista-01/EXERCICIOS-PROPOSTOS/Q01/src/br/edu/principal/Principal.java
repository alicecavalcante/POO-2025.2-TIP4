package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		double num1 = sc.nextDouble();
		System.out.println("Digite o segundo número: ");
		double num2 = sc.nextDouble();
		double subtracao = num1 - num2;
		System.out.println("A subtração do primeiro número digitado pleo segundo número é: " + subtracao);
		
	}

}
