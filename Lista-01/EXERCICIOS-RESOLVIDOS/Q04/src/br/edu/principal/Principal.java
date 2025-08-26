package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	System.out.println("Digite um salário: ");
	Double salarioOriginal = sc.nextDouble();
	Double valorAumento = 0.25*salarioOriginal;
	Double salarioAumentado = salarioOriginal + valorAumento;
	System.out.println("O valor do salário com 25% de aumento é de: R$ " + salarioAumentado);
	}

}
