package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a nota 1 do aluno:");
		Double num1 =sc.nextDouble();
		
		System.out.println("Digite a nota 2 do aluno: ");
		Double num2 =sc.nextDouble();
		
		System.out.println("Digite a nota 3 do aluno:");
		Double num3 =sc.nextDouble(); 
		
		System.out.println("Digite a nota 4 do aluno:"); 
		Double num4 =sc.nextDouble();
		
		Double media = (num1+num2+num3+num4)/4 ; 
		
		if ( media>=7 ) { 
			System.out.println("Média: " + media);
			System.out.println("Situação: Aprovado.");
		}
		else { 
			System.out.println("Média: " + media);
			System.out.println("Situação: Reprovado."); 
			} 
		}
		
		
	}


