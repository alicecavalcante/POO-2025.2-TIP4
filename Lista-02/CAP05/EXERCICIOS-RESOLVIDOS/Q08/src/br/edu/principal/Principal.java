package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o número de termos da série: ");
		int n = sc.nextInt();

		int a = 2;  
		int b = 7;  
		int c = 3;  

		       
		int cont = 0;
		while (cont < n) {
			if (cont < n) {
		    System.out.print(a + ", ");
		    a= a* 2;
		    cont++;
			}

			if (cont < n) {
		    System.out.print(b + ", ");
		    b = b* 3;
		    cont++;
		    }

		    if (cont < n) {
		    System.out.print(c + ", ");
		    c = c * 4;
		    cont++;
		    }
		}
		if (cont ==n) {
			System.out.println("...");
		}
	}
}

