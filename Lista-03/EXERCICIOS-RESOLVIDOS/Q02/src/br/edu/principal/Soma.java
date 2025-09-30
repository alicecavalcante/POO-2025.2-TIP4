package br.edu.principal;
import java.util.Scanner;

public class Soma {
    public static int soma_de_numeros() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número em que começa a soma: ");
        int num1 = sc.nextInt();
        System.out.println("Digite o número em que termina a soma: ");
        int num2 = sc.nextInt();
        int soma = 0;
        if ((num1 > 0) && (num2 > 0) && (num2 > num1)) {
            for (int numeros = num1 + 1; numeros < num2; numeros++) {
                soma += numeros;
            }
            return soma;
        }
        else {
            System.out.println("Digite apenas números positivos maiores que 0, sendo o primeiro número menor que o segundo!");
            return soma;
        }
    }
}