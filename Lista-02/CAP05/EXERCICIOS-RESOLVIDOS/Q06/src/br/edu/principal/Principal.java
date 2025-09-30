package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int funcio = 1; funcio <= 10; funcio++) {
            System.out.println("Digite o código do " + funcio + "° funcionário: ");
            int codFuncio = sc.nextInt();
            System.out.println("Digite o número de horas trabalhadas: ");
            double numHorasTrab = sc.nextDouble();
            String turno;
            while (true) {
                System.out.println("Digite o turno entre:"
                        + "\nM --> Matutino;"
                        + "\nV --> Vespertino;"
                        + "\nN --> Noturno: ");
                turno = sc.next().toUpperCase();
                if (turno.equals("M") || turno.equals("V") || turno.equals("N")) {
                    break;
                } else {
                    System.out.println("Turno inválido. Digite novamente:");
                }
            }
            String cat;
            while (true) {
                System.out.println("Digite a categoria entre:"
                        + "\nO --> Operário;"
                        + "\nG --> Gerente: ");
                cat = sc.next().toUpperCase();
                if (cat.equals("O") || cat.equals("G")) {
                    break;
                } else {
                    System.out.println("Categoria inválida. Digite novamente:");
                }
            }
            double salMin = 450.00;
            double valHora = 0;
            double salInicial, auxAlim;
            if (turno.equals("N")) {
                if (cat.equals("G")) {
                    valHora = 0.18 * salMin;
                } else if (cat.equals("O")) {
                    valHora = 0.13 * salMin;
                }
            } else if (turno.equals("M") || turno.equals("V")) {
                if (cat.equals("G")) {
                    valHora = 0.15 * salMin;
                } else if (cat.equals("O")) {
                    valHora = 0.10 * salMin;
                }
            }
            salInicial = valHora * numHorasTrab;

            if (salInicial <= 300) {
                auxAlim = 0.20 * salInicial;
            } 
            else if (salInicial <= 600) {
                auxAlim = 0.15 * salInicial;
            }
            else {
                auxAlim = 0.05 * salInicial;
            }
            System.out.println("Funcionário " + funcio + " cadastrado:");
            System.out.println("Código = " + codFuncio);
            System.out.println("Horas = " + numHorasTrab + " horas");
            System.out.println("Valor da hora trabalhada = R$ " + valHora);
            System.out.println("Salário inicial = R$ " + salInicial);
            System.out.println("Auxílio alimentação = R$ " + auxAlim);
            System.out.println("Salário final = R$ " + (salInicial + auxAlim));
        }
    }
}