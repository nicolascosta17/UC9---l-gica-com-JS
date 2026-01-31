// 18-    Calculadora de Média: Peça três números e imprima a média.

package exercicios;

import java.util.Scanner;

public class ex18 {
    public static void main(String[] args){
        Scanner entradaUser = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        double num1 = entradaUser.nextDouble();
        System.out.println("Digite o segundo número: ");
        double num2 = entradaUser.nextDouble();
        System.out.println("Digite o terceiro número: ");
        double num3 = entradaUser.nextDouble();

        double media = (num1 + num2 + num3) / 3;

        System.out.println(media);

    }
}
