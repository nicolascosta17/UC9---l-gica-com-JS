/*
Exercício 1 - Par ou Ímpar
Crie um programa que receba um número 
inteiro e imprima se ele é "Par" ou "Ímpar".
*/

package exercicioIfElse;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner entradaUser = new Scanner(System.in);        

        System.out.println("Digite um número inteiro: ");
        int num = entradaUser.nextInt();
        
        if (num % 2 == 0){
            System.out.println("Este número é PAR");
        } else{
            System.out.println("Este número é IMPAR");
        }

    }
}
