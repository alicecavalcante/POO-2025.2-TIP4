package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args){
		        Scanner sc = new Scanner(System.in);

		        double a, b, c;
		        int i;

		        System.out.println("Digite o valor para A: ");
		        a = sc.nextDouble();

		        System.out.println("Digite o valor para B: ");
		        b = sc.nextDouble();

		        System.out.println("Digite o valor para C: ");
		        c = sc.nextDouble();

		        System.out.println("Digite um valor I para escolher entre as opções a seguir: "
		                + "\n1 --> ordem crescente;"
		                + "\n2 --> ordem decrescente;"
		                + "\n3 --> o maior número no meio.");

		        i = sc.nextInt();
		        
		        if (i == 2) {
		            if (a > b & a > c) {
		                if (b > c) {
		                    System.out.println("A ordem decrescente de " + a + ", " + b + " e " + c + " é: " + a + ", " + b + ", " + c);
		                } else {
		                    System.out.println("A ordem decrescente de " + a + ", " + b + " e " + c + " é: " + a + ", " + c + ", " + b);
		                }
		            } else if (b > a & b > c) {
		                if (a > c) {
		                    System.out.println("A ordem decrescente de " + a + ", " + b + " e " + c + " é: " + b + ", " + a + ", " + c);
		                } else {
		                    System.out.println("A ordem decrescente de " + a + ", " + b + " e " + c + " é: " + b + ", " + c + ", " + a);
		                }
		            } else {
		                if (a > b) {
		                    System.out.println("A ordem decrescente de " + a + ", " + b + " e " + c + " é: " + c + ", " + a + ", " + b);
		                } else {
		                    System.out.println("A ordem decrescente de " + a + ", " + b + " e " + c + " é: " + c + ", " + b + ", " + a);
		                }
		            }
		        }

		        
		        else if (i == 1) {
		            if (a < b & a < c) {
		                if (b < c) {
		                    System.out.println("A ordem crescente de " + a + ", " + b + " e " + c + " é: " + a + ", " + b + ", " + c);
		                } else {
		                    System.out.println("A ordem crescente de " + a + ", " + b + " e " + c + " é: " + a + ", " + c + ", " + b);
		                }
		            } else if (b < a && b < c) {
		                if (a < c) {
		                    System.out.println("A ordem crescente de " + a + ", " + b + " e " + c + " é: " + b + ", " + a + ", " + c);
		                } else {
		                    System.out.println("A ordem crescente de " + a + ", " + b + " e " + c + " é: " + b + ", " + c + ", " + a);
		                }
		            } else {
		                if (a < b) {
		                    System.out.println("A ordem crescente de " + a + ", " + b + " e " + c + " é: " + c + ", " + a + ", " + b);
		                } else {
		                    System.out.println("A ordem crescente de " + a + ", " + b + " e " + c + " é: " + c + ", " + b + ", " + a);
		                }
		            }
		        }

		        else if (i == 3) {
		            if (a > b & a > c) {
		                System.out.println("A ordem com o maior número ficando no meio entre " + a + ", " + b + " e " + c + " é: " + b + ", " + a + ", " + c);
		            } else if (b > a & b > c) {
		                System.out.println("A ordem com o maior número ficando no meio entre " + a + ", " + b + " e " + c + " é: " + a + ", " + b + ", " + c);
		            } else {
		                System.out.println("A ordem com o maior número ficando no meio entre " + a + ", " + b + " e " + c + " é: " + a + ", " + c + ", " + b);
		            }
		        }  
		        else {
		            System.out.println("Valor inválido para I!");
		        }
	}
}
