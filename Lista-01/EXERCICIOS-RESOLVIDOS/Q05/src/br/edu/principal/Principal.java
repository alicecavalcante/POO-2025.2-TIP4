package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor do salário: ");
		Double salarioOriginal = sc.nextDouble();
		System.out.println("Digite o valor percentual de aumento: ");
		Double percentualAumento = sc.nextDouble();
		Double valorAumento = (percentualAumento/100)*salarioOriginal;
		System.out.println("O valor do aumento é: " + valorAumento);
		Double salarioAumentado = salarioOriginal + valorAumento;
		System.out.println("O valor do salário com o aumento é de: R$ " + salarioAumentado);

	}

}
