package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o preço de um produto: ");
		Double precoOriginal = sc.nextDouble();
		Double valorDesconto = 0.1*precoOriginal;
		Double valorDescontado = precoOriginal - valorDesconto;
		System.out.println("O valor deste produto com 10% de desconto é: " + valorDescontado);

	}

}
