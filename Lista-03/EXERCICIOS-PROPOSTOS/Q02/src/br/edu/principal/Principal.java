package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor em horas: ");
        int horas = sc.nextInt();
        int result = 0;

        if (horas >= 0) {
            System.out.println("Digite um valor em minutos: ");
            int minutos = sc.nextInt();

            if (minutos >= 0) {
                System.out.println("Digite um valor em segundos: ");
                int segundos = sc.nextInt();

                if (segundos >= 0) {
                    result = Conversao.convertendo_em_segundos(horas, minutos, segundos);
                    System.out.println(horas + " horas, " + minutos + " minutos e " + segundos + 
                                       " segundos equivalem a " + result + " segundos.");
                } else {
                    System.out.println("Digite um valor de segundos válido.");
                }
            } else {
                System.out.println("Digite um valor de minutos válido.");
            }
        } else {
            System.out.println("Digite um valor de horas válido.");
        }
    }
}