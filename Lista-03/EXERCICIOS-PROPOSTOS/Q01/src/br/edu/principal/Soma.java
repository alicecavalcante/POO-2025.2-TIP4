package br.edu.principal;

public class Soma {
    public static int soma_de_numeros(int n) {
        int somaNumeros = 0;
        for (int numero = 1; numero <= n; numero++) {
            somaNumeros += numero;
        }
        return (somaNumeros);
    }
}