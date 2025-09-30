package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número de termos: ");
        int n = sc.nextInt();
        double x;
        do {
            System.out.print("Digite um valor positivo para X: ");
            x = sc.nextDouble();
        } while (x <= 0);
        double s = 0;
        int expo = 2;
        int dir = 1;
        int fatInd = 1;
        boolean negativo = true;
        for (int i = 1; i <= n; i++) {
            double nume = Math.pow(x, expo);
            double denom = 1;
            for (int j = 2; j <= fatInd; j++) {
                denom *= j;
            }
            double termo = nume/ denom;
            if (negativo) {
                termo *= -1;
            }
            s += termo;
            negativo = !negativo;
            expo++;
            if (dir == 1) {
                fatInd++;
                if (fatInd == 4) {
                    dir = -1;
                }
            } else {
                fatInd--;
                if (fatInd == 1) {
                    dir = 1;
                }
            }
        }
        System.out.printf("Valor da série S = %.4f\n", s);
    }
}
