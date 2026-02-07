/*
21-    Auxiliar de Geometria: Calcule a circunferência e a área de um círculo dado o raio.
*/

import java.util.Scanner;

public class ex21 {
    public static void main(String[] args){
        Scanner entradaUser = new Scanner(System.in);

        System.out.println("Digite o valor do raio: ");
        double raio = entradaUser.nextDouble();

        double circunferência = 2 * Math.PI * raio;

        double areaCirculo = raio * Math.pow(raio, 2);

        System.out.printf("Circunferência: %.2f",circunferência);
        System.out.printf("\nÁrea do Círculo: %.2f",areaCirculo);

    }
}
