/*
29-    Método imprimirTempoFormatado(int h, int m, int s) que imprima HH:MM:SS.
*/

import java.util.Scanner;

public class ex29 {

    static void imprimirTempoFormatado(int h, int m, int s){
        System.out.println(h+":"+m+":"+s);
    }

    public static void main(String[] args) {
        Scanner entradaUser = new Scanner(System.in);

        System.out.println("Digite as horas: ");
        int hours = entradaUser.nextInt();
        System.out.println("Digite os minutos: ");
        int minutes = entradaUser.nextInt();
        System.out.println("Digite os segundos: ");
        int segunds = entradaUser.nextInt();

        imprimirTempoFormatado(hours, minutes, segunds);

    }
}
