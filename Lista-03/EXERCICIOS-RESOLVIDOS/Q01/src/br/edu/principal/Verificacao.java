package br.edu.principal;
import java.util.Scanner;

public class Verificacao {
    public static int verificando() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = sc.nextInt();
        if (num > 0) {
            int result = 1;
            return result;
        }
        else if (num < 0) {
            int result = 0;
            return result;
        }
        else {
            System.out.println("O número digitado é 0, neutro.");
            int result = 2;
            return result;
        }
    }
}