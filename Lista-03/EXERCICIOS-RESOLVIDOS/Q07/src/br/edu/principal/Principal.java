package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  
		  System.out.println("Digite a primeira nota: ");
		  double n1 = sc.nextDouble();
		  
		  System.out.println("Digite a segunda nota: ");
		  double n2 = sc.nextDouble();
		  
		  System.out.println("Digite a terceira nota: ");
		  double n3 = sc.nextDouble();
		  
		  System.out.println("Digite qual tipo de média quer realizar: (A para média aritmética e P para a ponderada)");
		  String tipo = sc.next();
		  
		  
		  double mediatotal = ConferindoTipo.TipoCalculo(n1, n2, n3, tipo);
		System.out.println("A média do aluno foi: " + mediatotal);
		  }

	}


