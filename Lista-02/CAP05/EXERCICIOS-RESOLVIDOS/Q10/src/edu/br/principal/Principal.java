package edu.br.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int menor_idade = 0;
		double soma_altura =0;
		int jogpesado =0;
		double idade_media_time= 0;
		int time =1;

		for(time =1; time<=5; time++) {
			System.out.println("------- Coleta dos Dados do Time " + time + "-------");
			double idade_soma =0;
			
			for (int jog =1 ; jog<=11 ; jog++) {	
				System.out.println("Digite a idade do jogador " + jog + " :");
				int idade = sc.nextInt();
				idade_soma= idade_soma + idade ;
			
			if (idade<18) {
				menor_idade = menor_idade+1;
			}
			
			System.out.println("Digite o peso (kg) do jogador" + jog + " em kgs :");
			double peso = sc.nextDouble();
			if (peso>80) {
				jogpesado +=1;
			}
			
			System.out.println("Digite a altura(m) do jogador" + jog + " :");
			double altura = sc.nextDouble();
			soma_altura = altura + soma_altura;}
			
			idade_media_time = idade_soma / 11;
			System.out.println("Média de idade do Time " + time + ": " + idade_media_time);
			};
			
			double mtotal_altura = soma_altura/55;
			int jogador_mais_80kg = (jogpesado*100) / 55;
			
			
			System.out.println("Jogadores com menos de 18 anos:"  + menor_idade);
			System.out.println("Altura Média dos Jogadores:" +  mtotal_altura );
			System.out.println("Porcentagem de Jogadores com mais de 80kg:" +  jogador_mais_80kg );

	}

}
