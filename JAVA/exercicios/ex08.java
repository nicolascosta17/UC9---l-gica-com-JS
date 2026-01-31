package exercicios;

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        
        Scanner entradaUser = new Scanner(System.in);

        System.out.println("Digite a temperatura em Fahrenheit: ");
        double fh = entradaUser.nextDouble();
        double conversao = ((fh - 32) * 5/9);

        System.out.println("A temperatura em Celsius é de: " + conversao + " °C" );

    }
}
