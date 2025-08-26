package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a primeira nota: ");
		Double n1 = sc.nextDouble();
		System.out.println("Digite a segunda nota: ");
		Double n2 = sc.nextDouble();
		System.out.println("Digite a terceira nota: ");
		Double n3 = sc.nextDouble();
		
		Double media = (n1 + n2 + n3)/3;
		
		System.out.println("A média das três notas é: " + media);
	}

}
