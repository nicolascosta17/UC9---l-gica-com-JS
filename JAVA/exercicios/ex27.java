/*
27-    Método imprimirMaximo(int a, int b) que imprima o maior.
*/

import java.util.Scanner;

public class ex27 {

    static void  imprimirMaximo(int a, int b){
        if (a > b){
            System.out.println("Maior: "+a);
            System.out.println("Menor: "+b);
        }else if(a < b){
            System.out.println("Maior: "+b);
            System.out.println("Menor: "+a);
        }else{
            System.out.println(a+" e "+b+" são iguais");
        }
    }

    public static void main(String[] args) {
        
        Scanner entradaUser = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int num1 = entradaUser.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = entradaUser.nextInt();

        imprimirMaximo(num1, num2);

    }
}
