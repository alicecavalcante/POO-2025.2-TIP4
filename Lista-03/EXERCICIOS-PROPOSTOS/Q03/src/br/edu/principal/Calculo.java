package br.edu.principal;

public class Calculo {
	public static int Divisor(int n1, int n2) {
		if (n1 % n2 == 0) {
            return 0;
        } else {
            for (int i = n2 + 1; i <= n1; i++) {
                if (n1 % i == 0) {
                    return i;
                }
            }
            return -1; 
	}
	}
}
		
	


