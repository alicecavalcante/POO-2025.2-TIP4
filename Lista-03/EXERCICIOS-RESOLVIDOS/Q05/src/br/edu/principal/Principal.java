package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o antigo valor do produto: ");
        double val_antigo = sc.nextDouble();
        System.out.println("Digite o novo valor do produto: ");
        double val_novo = sc.nextDouble();
        double result = PercentualAcrescimo.descobrindo_percentual_acrescimo(val_antigo, val_novo);
        System.out.println("O percentual de acréscimo entre o valor antigo (R$ " + val_antigo + ") e o valor novo (R$ " + val_novo + ") do produto é de: " + result + "%.");
    }
}