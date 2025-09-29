package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cont = 1;
		int reprovados = 0;
		int recuperacao =0;
		int aprovados = 0;
		double mediatotal =0;
		double mediaturma;
		
		for(double num = 0; num<6; num++) {
			System.out.println("Digite a nota 1 do aluno " + cont  + ":");
			double nota1 =  sc.nextDouble();
			System.out.println("Digite a nota 2 do aluno " + cont  + ":");
            double nota2 = sc.nextDouble();
        
            double media = (nota1 + nota2) / 2;
            mediatotal = media + mediatotal;
            System.out.println("A média do aluno " + cont + " foi: " + media); 
            cont = cont +1;
            
            
            if (media <= 3) {
                System.out.println("Reprovado!");
                reprovados = reprovados +1;
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
               
            } else if (media < 7) {
                System.out.println("Exame!");
                recuperacao = recuperacao +1;
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
             
            } else {
                System.out.println("Aprovado!");  
                aprovados = aprovados +1;
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
            }   
        }
		 mediaturma = mediatotal /6;
         
		 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
         System.out.println("Total de aprovados:" + aprovados);
         System.out.println("Total de alunos no exame:" + recuperacao);
         System.out.println("Total de reprovados:" + reprovados);
         System.out.println("Média da turma:" + mediaturma);
         System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
		
		


	}


