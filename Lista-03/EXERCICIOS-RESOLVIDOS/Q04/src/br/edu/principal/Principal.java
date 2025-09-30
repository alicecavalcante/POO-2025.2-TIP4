package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os segundos: ");
        int seg = sc.nextInt();
        String result = ConversaoSegundos.convertendo_segundos(seg);
        System.out.println(result);
    }
}