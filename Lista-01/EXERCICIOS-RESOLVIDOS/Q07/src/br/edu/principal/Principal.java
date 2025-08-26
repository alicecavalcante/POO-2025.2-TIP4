package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do salário base: ");
		Double salario =sc.nextDouble();

		double imposto = salario * 0.10;
		double salario_final = salario + 50 - imposto;

		System.out.println("O valor do salário final equivale a " + salario_final);

		}
	}


