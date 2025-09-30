package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int n1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = sc.nextInt();

        System.out.print("Digite o terceiro número: ");
        int n3 = sc.nextInt();

        System.out.print("Digite o quarto número: ");
        int n4 = sc.nextInt();

        System.out.print("Digite o quinto número: ");
        int n5 = sc.nextInt();

        int numMaior = MaiorMenor.numMaior(n1, n2, n3, n4, n5);
        int numMenor = MaiorMenor.numMenor(n1, n2, n3, n4, n5);

        System.out.println("O maior número é: " + numMaior);
        System.out.println("O menor número é: " + numMenor);

        
    }
}


