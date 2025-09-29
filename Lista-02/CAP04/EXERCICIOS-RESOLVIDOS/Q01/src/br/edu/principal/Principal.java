package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double trab_lab, av_semestral, exame_f, m;
		
		System.out.println("Digite a nota do trabalho de laboratorio: ");
		trab_lab = sc.nextDouble();

		System.out.println("Digite a nota da avaliação semestral: ");
		av_semestral = sc.nextDouble();
		
		System.out.println("Digite a nota do exame final: ");
		exame_f = sc.nextDouble();
		
		m = (trab_lab*2 + av_semestral*3 + exame_f*5)/10;
		
		if (m >=8) {
			System.out.println("Conceito A : " + m);
		}
		
		else if (m <8 && m>=7) {
			System.out.println("Conceito B :" + m);
		}
		
		else if (m <7 && m>=6) {
			System.out.println("Conceito C :" + m);
		}
		
		else if (m <6 && m>=5) {
			System.out.println("Conceito D :" + m);
		}
		
		else {
			System.out.println("Conceito E:" +  m);
		}
		
		
	}

}
