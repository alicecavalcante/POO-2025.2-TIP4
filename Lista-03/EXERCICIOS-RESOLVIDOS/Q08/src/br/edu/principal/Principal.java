package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("Digite a hora do início ( 0 a 23): ");
        int horaInicial = sc.nextInt();

        System.out.println("Digite os minutos de início (0 a 59): ");
        int minInicial = sc.nextInt();

        System.out.println("Digite a hora do fim (0 a 23): ");
        int horaFim = sc.nextInt();

        System.out.println("Digite os minutos do fim (0 a 59): ");
        int minFim = sc.nextInt();

        int duracao = Calculos.duracao(horaInicial, minInicial, horaFim, minFim);
        System.out.println("A duração do jogo foi de " + duracao + " minuto(s).");
    }
}


