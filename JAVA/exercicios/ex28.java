/*
28-    Método descreverDivisao(int a, int b) que imprima "a / b = q, resto r".
*/

import java.util.Scanner;

public class ex28 {
    static void descreverDivisao(int a, int b){
        int resultado = a / b;
        int resto = a % b;

        System.out.println("O resultado de "+a+" / "+b+" = "+resultado);
        System.out.println("O resto de "+a+" / "+b+" = "+resto);
    }
    public static void main(String[] args) {
        Scanner entradaUser = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = entradaUser.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = entradaUser.nextInt();

        descreverDivisao(num1, num2);
        
    }    
}
