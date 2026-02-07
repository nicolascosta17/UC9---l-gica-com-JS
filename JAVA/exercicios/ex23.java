/*
23-    Verificador de Paridade: Peça um inteiro e imprima "Par" ou "Ímpar".
*/

import java.util.Scanner;

public class ex23 {
    public static void main(String[] args){
        Scanner entradaUser = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int valorImpPar = entradaUser.nextInt();

        if(valorImpPar % 2 == 0){
            System.out.println("PAR");
        }else{
            System.out.println("IMPAR");
        }
    }
}
