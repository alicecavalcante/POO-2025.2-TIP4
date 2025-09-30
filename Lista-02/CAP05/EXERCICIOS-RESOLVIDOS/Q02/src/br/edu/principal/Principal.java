package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Digite um número inteiro e positivo: ");
		        int n = sc.nextInt();
		        double e = 1.0;
		        for (int i = 1; i <= n; i++) {
		            double fatorial = 1.0;
		            for (int j = 1; j <= i; j++) {
		                fatorial *= j;
		            }
		            e += 1.0 / fatorial;
		        }
		        System.out.printf("O valor de E é: %.6f\n", e);
		    }
}