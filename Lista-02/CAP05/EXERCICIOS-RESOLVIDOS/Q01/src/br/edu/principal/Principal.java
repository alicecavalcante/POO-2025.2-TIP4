package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		double sal, ano_atual, sal_novo, percentual;
		sal = 1000.00;
		percentual = 1.5/100;
		ano_atual = 2025;
		
	sal_novo = sal + (sal * percentual);
	
	for(int i = 2006; i < 2026; i++ ) {
		System.out.printf("Ano %d - Aumento de %.6f%n -" + "Salário: R$ %.2fn", i, percentual, sal_novo);
		percentual *= 2;
		System.out.printf("Novo percentual: %.6f%n", percentual);
		sal_novo = sal_novo + (sal_novo * percentual);
		System.out.printf("Salãrio novo: R$ %.2fn", sal_novo);


	}
	}

}
