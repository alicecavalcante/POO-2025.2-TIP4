package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args){
		        Scanner sc = new Scanner(System.in);
		        double a, b;
		        int o;
		        System.out.println("Digite o valor para A: ");
		        a = sc.nextDouble();
		        System.out.println("Digite o valor para B: ");
		        b = sc.nextDouble();
		        System.out.println("Digite um valor O para escolher entre as opções a seguir: "
		                + "\n1 --> Média entre os números digitados;"
		                + "\n2 --> Diferença do maior pelo menor;"
		                + "\n3 --> Produto entre os números digitados;"
		                + "\n4 --> Divisão do primeiro pelo segundo.");
		        o = sc.nextInt();
		        if (o == 1) {
		            double med = (a + b) / 2;
		            System.out.println("A média entre " + a + " e " + b + " é: " + med);
		            // do if1
		        } else if (o == 2) {
		            double dif;
		            if (a > b) {
		                dif = a - b;
		                System.out.println("A subtração de " + a + " e " + b + " é: " + dif);
		            } else if (b > a) {
		                dif = b - a;
		                System.out.println("A subtração de " + b + " e " + a + " é: " + dif);
		            } else {
		                System.out.println("A subtração de " + a + " e " + b + " é: 0");
		            }
		            // do if2
		        } else if (o == 3) {
		            double pro = a * b;
		            System.out.println("O produto de " + a + " e " + b + " é: " + pro);
		            // do if3
		        } else if (o == 4) {
		            double div = a / b;
		            System.out.println("A divisão entre " + a + " e " + b + " é: " + div);
		            // do if4
		        } else {
		            System.out.println("Opção inválida!");
		            // do else
		        }
		    }

	}
