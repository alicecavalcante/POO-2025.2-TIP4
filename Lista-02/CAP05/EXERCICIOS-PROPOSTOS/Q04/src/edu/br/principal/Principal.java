package edu.br.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número para ver sua tabuada:");
		int num = sc.nextInt();

		for(int alg=1; alg<=10; alg++) {
		int valor = num * alg;
		System.out.println(num + " * " + alg + " = " + valor);
		}

	}
}	
		
		


