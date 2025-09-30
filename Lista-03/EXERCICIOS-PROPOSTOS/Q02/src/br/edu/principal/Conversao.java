package br.edu.principal;

public class Conversao {
    public static int convertendo_em_segundos(int horas, int minutos, int segundos) {
        int horas_convertidas = horas * 3600;
        int minutos_convertidos = minutos * 60;
        int segundos_totais = horas_convertidas + minutos_convertidos + segundos;
        return segundos_totais;
    }
}