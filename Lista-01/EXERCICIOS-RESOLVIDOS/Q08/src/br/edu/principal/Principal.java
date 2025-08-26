package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 System.out.print("Digite o valor do depósito: ");
	        double deposito = sc.nextDouble();

	     System.out.print("Digite a taxa de juros (em %): ");
	        double taxaJuros = sc.nextDouble();

	        double rendimento = deposito * (taxaJuros / 100);
	        double valorFinal = deposito + rendimento;

	        System.out.println("Valor do rendimento: R$ " + rendimento);
	        System.out.println("Valor final após aplicação: R$ " + valorFinal);
	}

}
