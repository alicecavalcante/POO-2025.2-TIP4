package br.edu.principal;

public class ConversaoSegundos {
    public static String convertendo_segundos(int seg) {
        int conversao_pra_horas = seg / 3600;
        int conversao_pra_minutos = (seg % 3600) / 60;
        int conversao_pra_segundos = ((seg % 3600)) % 60;
        String total_segundos = Integer.toString(seg);
        String horas = Integer.toString(conversao_pra_horas);
        String minutos = Integer.toString(conversao_pra_minutos);
        String segundos = Integer.toString(conversao_pra_segundos);
        return total_segundos + " segundos equivalem a: " + horas + " horas, " + minutos + " minutos e " + segundos + " segundos.";
    }
}