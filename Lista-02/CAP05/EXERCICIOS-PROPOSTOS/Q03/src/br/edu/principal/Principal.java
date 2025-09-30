package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int p=8;
		int adolescente =0;
		int jovemadulto =0;
		int adulto =0;
		int meiaidade =0;
		int idoso = 0;
		
		for (int i=1; i<=p; i++ ) {
		System.out.print("Digite a idade da " + i +  "º pessoa: ");
        int idade = sc.nextInt();
        
        if (idade<=15) {
        	adolescente = adolescente +1;
        	
        }
        else if (idade>=16 && idade<=30) {
        	jovemadulto = jovemadulto +1;
        	
        }
        else if (idade>=31 && idade<=45) {
        	adulto = adulto +1;
        	
        }
        else if (idade>=46 && idade<=60) {
        	meiaidade = meiaidade +1;
        	
        }
        else {
        	idoso = idoso +1;
        	}
		}
		
		double percadolescente = (adolescente * 100.0) / p;
        double percidoso = (idoso * 100.0) / p;
        
        System.out.println("~~~~~~ Quantidade de pessoas em cada faixa etária ~~~~~~~");
        System.out.println("Adolescentes (até 15 anos): " + adolescente);
        System.out.println("Jovem adulto (16 a 30 anos): " + jovemadulto);
        System.out.println("Adulto (31 a 45 anos): " + adulto);
        System.out.println("Meia idade (46 a 60 anos): " + meiaidade);
        System.out.println("Idoso (acima de 60 anos): " + idoso);
        
        System.out.println("~~~~~~Porcentagens~~~~~~");
        System.out.println("Porcentagem na 1ª faixa: " +  percadolescente);
        System.out.println("Porcentagem na 5ª faixa: "+ percidoso);
      }

}
