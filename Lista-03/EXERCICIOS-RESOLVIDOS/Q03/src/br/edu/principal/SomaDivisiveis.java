package br.edu.principal;
import java.util.Scanner;

public class SomaDivisiveis {
    public static int soma_divisiveis_por_a() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número A como referência: ");
        int a = sc.nextInt();
        if (a > 1){
            System.out.println("Digite um número B para iniciar a soma de divisíveis por A: ");
            int b = sc.nextInt();
            System.out.println("Digite um número C para finalizar a soma de divisíveis por A: ");
            int c = sc.nextInt();
            int soma = 0;
            if (b <= c) {
                for (int numeros = b; numeros <= c; numeros++) {
                    if (numeros % a == 0) {
                        soma += numeros;
                    }
                }
                return soma;
            }
            else {
                System.out.println("B deve começar a contagem, B <= C.");
                return soma;
            }
        }
        else {
            System.out.println("A deve ser maior que 1.");
            return 0;
        }
        
    }
}