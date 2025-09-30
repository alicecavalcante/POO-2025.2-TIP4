package br.edu.principal;

public class Calculos {
	public static int duracao(int horaInicial, int minInicial, int horaFim, int minFim) {
        int inicio = (horaInicial * 60) + minInicial;
        int fim = (horaFim * 60) + minFim;

        if (fim>= inicio) {
            return fim - inicio;
        } else {
            return (24 * 60 - inicio) + fim;
        }
    }

}
