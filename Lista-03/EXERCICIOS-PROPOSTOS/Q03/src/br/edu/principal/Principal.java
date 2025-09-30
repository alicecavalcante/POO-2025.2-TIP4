package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		int n1 = sc.nextInt();	
		
		System.out.println("Digite o segundo número: ");
		int n2 = sc.nextInt();
		
		int resultado = Calculo.Divisor(n1, n2);
		if (resultado==0) {
		System.out.println("O número " + n1 + " é divisível por " + n2 );
		}
		
		else if (resultado == -1) {
            System.out.println("O número " + n1 + " não é divisível por " + n2 + " e não possui divisor maior que " + n2 + ".");
        } 
		
		else {
			System.out.println("O número " + n1 + " não é divisível por " + n2 + " , mas é divisivel por " + resultado);
			
		}

	}

}
