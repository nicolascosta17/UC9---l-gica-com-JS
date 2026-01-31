package exercicios;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        
        Scanner entradaUser = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro: ");
        int num1 = entradaUser.nextInt();
        System.out.println("Digite o segundo número inteiro: ");
        int num2 = entradaUser.nextInt();

        System.out.println(num1);
        System.out.println(num2);
    }
}
