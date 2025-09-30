package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d1, m1, a1, d2, m2, a2;
		
		System.out.println("Digite o dia da primeira data: ");
		d1 = sc.nextInt();
		System.out.println("Digite o mês da primeira data: ");
		m1 = sc.nextInt();
		System.out.println("Digite o ano da primeira data: ");
		a1 = sc.nextInt();
		System.out.println("A primeira data é: " + d1 + '/' + m1 + '/' + a1);
		System.out.println("Digite o dia da segunda data: ");
		d2 = sc.nextInt();
		System.out.println("Digite o mês da segunda data: ");
		m2 = sc.nextInt();
		System.out.println("Digite o ano da segunda data: ");
		a2 = sc.nextInt();
		System.out.println("A segunda data é: " + d2 + '/' + m2 + '/' + a2);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		if (a1 > a2) {
			System.out.println("A maior data é: " + d1 + '/' + m1 + '/' + a1);
		}
			else if (a2 > a1) {
				System.out.println("A maior data é: " + d2 + '/' + m2 + '/' + a2);
		}
				else if (m1 > m2) {
					System.out.println("A maior data é: " + d1 + '/' + m1 + '/' + a1);
		}
						else if (m2 > m1) {
							System.out.println("A maior data é: " + d2 + '/' + m2 + '/' + a2);
		}
							else if (d1 > d2) {
								System.out.println("A maior data é: " + d1 + '/' + m1 + '/' + a1);
		}
							else if (d2 > d1) {
								System.out.println("A maior data é: " + d2 + '/' + m2 + '/' + a2);
		}

	}

}
