package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maiorInd = 0;
        int menorInd = 0;
        int codMaior = 0;
        int codMenor = 0;
        int somaVeiculos = 0;
        int somaAcidCidadePeq = 0;
        int contCidadePeq = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Código da cidade: ");
            int codCidade = sc.nextInt();
            System.out.print("Número de veículos de passeio: ");
            int numVeiculos = sc.nextInt();
            System.out.print("Número de acidentes com vítimas: ");
            int numAcidentes = sc.nextInt();
            somaVeiculos += numVeiculos;

            if (i == 1) {
                maiorInd = numAcidentes;
                menorInd = numAcidentes;
                codMaior = codCidade;
                codMenor = codCidade;
            }
            
            else {
                if (numAcidentes > maiorInd) {
                    maiorInd = numAcidentes;
                    codMaior = codCidade;
                }
                if (numAcidentes < menorInd) {
                    menorInd = numAcidentes;
                    codMenor = codCidade;
                }
            }
            if (numVeiculos < 2000) {
                somaAcidCidadePeq += numAcidentes;
                contCidadePeq++;
            }
        }
        double mediaVeiculos = somaVeiculos / 5.0;
        double mediaAcidPeq = 0;

        if (contCidadePeq > 0) {
            mediaAcidPeq = somaAcidCidadePeq / (double) contCidadePeq;
        }
        System.out.println("Maior índice de acidentes: " + maiorInd + " (Cidade " + codMaior + ")");
        System.out.println("Menor índice de acidentes: " + menorInd + " (Cidade " + codMenor + ")");
        System.out.printf("Média de veículos nas 5 cidades: %.2f\n", mediaVeiculos);
        System.out.printf("Média de acidentes nas cidades com menos de 2000 veículos: %.2f\n", mediaAcidPeq);
    }
}