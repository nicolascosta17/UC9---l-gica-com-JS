/*
20-    Conversor de Moeda: Peça valor em USD e taxa de câmbio, converta e imprima.
*/

import java.util.Scanner;

public class ex20 {
    public static void main(String[] args) {
        Scanner entradaUser = new Scanner(System.in);

        System.out.print("Digite o valor em USD: $ ");
        double dolarValor = entradaUser.nextDouble();

        double valorConvertido = dolarValor * 5.22;

        System.out.printf("Valor convertido é R$ %.2f%n", valorConvertido);

        entradaUser.close();
    }
}
