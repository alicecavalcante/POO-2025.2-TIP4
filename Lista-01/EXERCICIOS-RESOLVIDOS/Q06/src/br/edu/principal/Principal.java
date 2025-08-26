package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Digite o valor do salário base: ");
		Double salario =sc.nextDouble();

		double gratificacao = 0.05 * salario;
		double imposto = salario * 0.07;
		double salario_final = salario + gratificacao - imposto;

	
		System.out.println(" O valor do salário final equivale a " + salario_final);
	}

}
