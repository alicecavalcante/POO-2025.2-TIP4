package br.edu.principal;

public class Principal {
	public static void main(String[] args) {
			int n = 8; 
	        int primeiro = 0;
	        int segundo = 1;

	        System.out.println("Os 8 primeiros termos da Sequência de Fibonacci são:");

	        System.out.print(primeiro + " ");
	        System.out.print(segundo + " ");

	    
	        for (int i = 3; i <= n; i++) {
	            int proximo = primeiro + segundo;
	            System.out.print(proximo + " ");
	            primeiro = segundo;
	            segundo = proximo;
		}
	}
}


