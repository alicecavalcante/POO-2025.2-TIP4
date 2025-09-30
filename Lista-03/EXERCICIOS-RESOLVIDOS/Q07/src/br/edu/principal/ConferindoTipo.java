package br.edu.principal;

public class ConferindoTipo {
	public static double TipoCalculo(double n1, double n2, double n3, String tipo) {
		  double media =0 ;
		  
		  if (tipo.equals("A") || tipo.equals("a")) {
		    media = (n1+n2+n3)/3; 
		    return media;
		  }
		  
		  else if (tipo.equals("P") || tipo.equals("p")) {
		    media = (n1*5 + n2*3 + n3*2) /10;
		    return media;
		   }
		  
		  else{
			  System.out.print("Opção inválida. Não foi possível realizar a operação. ");
			  return 0;
		  }
		  
	}
}



