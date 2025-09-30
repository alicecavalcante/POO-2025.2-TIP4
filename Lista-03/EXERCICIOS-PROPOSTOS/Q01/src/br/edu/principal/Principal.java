package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n = sc.nextInt();
        if (n > 0) {
            int somaTotal = Soma.soma_de_numeros(n);
            System.out.println("A soma dos números de 1 até " + n + " (incluídos) é = " + somaTotal);
        }
        else if (n == 0) {
            System.out.println("O número é neutro, use apenas números inteiros positivos.");
        }
        else {
            System.out.println("Digite apenas números inteiros positivos.");
        }
    }
}