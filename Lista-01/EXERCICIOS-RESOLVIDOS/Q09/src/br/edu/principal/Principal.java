package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da base: ");
		double base = sc.nextDouble();
		
		
		System.out.println("Digite o valor da altura: ");
		double altura = sc.nextDouble();
		
		double area_triangulo = (base * altura) /2 ;
		
		System.out.println("A área do triângulo corresponde a: " + area_triangulo);


	}

}
