// 19-    Conversor de Segundos: Peça segundos totais e converta para horas, minutos e segundos.

package exercicios;

import java.util.Scanner;

public class ex19 {
    public static void main(String[] args){
        Scanner entradaUser = new Scanner(System.in);

        System.out.println("Digite os segundos: ");
        int segundos = entradaUser.nextInt();

        int horas = segundos / 3600;
        int minutos = segundos / 60;

        System.out.printf("Horas: "+horas+"%nMinutos: "+minutos+"%nSegundos: "+segundos);

    }
}
