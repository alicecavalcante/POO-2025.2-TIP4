package br.edu.principal;

public class PercentualAcrescimo {
    public static double descobrindo_percentual_acrescimo (double val_antigo, double val_novo) {
        double percentual = (val_novo - val_antigo) / val_antigo * 100;
        return percentual;
    }
}