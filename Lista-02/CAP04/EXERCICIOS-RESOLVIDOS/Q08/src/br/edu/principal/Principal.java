package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int opcao;
		double num1, num2, soma, num, raiz;
		System.out.println("Escolha uma das opções a seguir:"
				+ "\n1 --> Somar dois números."
				+ "\n2 --> Raiz quadrada de um número.");
		opcao = sc.nextInt();
		if (opcao == 1) {
			System.out.println("Digite o primeiro número: ");
			num1 = sc.nextDouble();
			System.out.println("Digite o segundo número: ");
			num2 = sc.nextDouble();
			soma = num1 + num2;
			System.out.println("A soma de " + num1 + " + " + num2 + " é: " + soma);
		}
		if (opcao == 2) {
			System.out.println("Digite o número: ");
			num = sc.nextDouble();
			raiz = Math.sqrt(num);
			System.out.println("A raiz quadrada de " + num + " é: " + raiz);
		}
		if (opcao != 1 & opcao != 2) {
			System.out.println("Opção inválida!");
		}
		
	}

}
