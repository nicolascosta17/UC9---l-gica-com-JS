/*
25-    Conversor de Unidades: Converta polegadas para centímetros.
*/

import java.util.Scanner;

public class ex25 {
    public static void main(String[] args) {
        Scanner entradaUser = new Scanner(System.in);

        System.out.println("Digite a quantidade de polegadas: ");
        double polegadas = entradaUser.nextDouble();

        double cent = polegadas * 2.54;

        System.out.println("A quantidade em centímetros é de: "+cent);
    }
}
