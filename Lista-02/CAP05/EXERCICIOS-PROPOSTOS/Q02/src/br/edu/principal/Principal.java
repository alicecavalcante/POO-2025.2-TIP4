package br.edu.principal;

public class Principal {
    public static void main(String[] args) {
        double preco = 5.0;
        int ingressosBase = 120;
        double desp = 200.0;

        double lucroMax = -1;
        double precoMax = 0;
        int ingressosMax = 0;

        for (int red = 0; preco >= 1.0; red++, preco -= 0.5) {
            int qtd = ingressosBase + 26 * red;
            double rec = preco * qtd;
            double lucro = rec - desp;
            System.out.println("O preço do ingresso é de " + "R$ " + preco);
            System.out.println("Quantidade vendida: " + qtd);
            System.out.println("O lucro é de " + "R$ " + lucro);
            if (lucro > lucroMax) {
                lucroMax = lucro;
                precoMax = preco;
                ingressosMax = qtd;
            }
        }
        System.out.println("O lucro máximo é " + "R$ " + lucroMax);
        System.out.println("O preço correspondente é " + "R$ " + precoMax);
        System.out.println("Os ingressos vendidos são " + ingressosMax);
    }
}