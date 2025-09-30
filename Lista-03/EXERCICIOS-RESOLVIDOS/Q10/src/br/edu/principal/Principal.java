package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int n = sc.nextInt();

        double valor = CalculoS.descobrindoS(n);

        System.out.println("O valor de S é: " + valor);

        
    }

	}


