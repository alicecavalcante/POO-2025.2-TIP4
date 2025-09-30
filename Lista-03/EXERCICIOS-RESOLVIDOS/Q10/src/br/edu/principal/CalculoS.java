package br.edu.principal;

public class CalculoS {
	public static double descobrindoS(int n) {
        double s = 1.0;

        for (int i = 1; i <= n; i++) {
            s += 1.0 / fatorial(i);
        }

        return s;
    }

    public static int fatorial(int num) {
       int fat = 1;
        for (int i = 1; i <= num; i++) {
            fat =fat *i;
        }
        return fat;
    }
}


