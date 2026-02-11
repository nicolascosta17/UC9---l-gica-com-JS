/*
Exercício 15 - Nota por Conceito
Converta uma nota numérica para conceito: 
A (9-10), B (7-8.9), C (5-6.9), D (3-4.9), F (0-2.9).
*/

package exercicioIfElse;

import java.util.Scanner;

public class ex15 {
 
    public static void main(String[] args){
        Scanner entradaUser = new Scanner(System.in);

        System.out.println("Digite a nota do aluno: ");
        double nota = entradaUser.nextDouble();

        if((nota <= 10) && (nota >= 9)){
            System.out.println("A");
        }else if((nota >= 7) && (nota <= 8.9)){
            System.out.println("B");
        }else if((nota >= 5) && (nota <= 6.9)){
            System.out.println("C");
        }else if((nota >= 3) && (nota <= 4.9)){
            System.out.println("D");
        }else if((nota >= 0) && (nota <= 2.9)){
            System.out.println("F");
        }else{
            System.out.println("Nota inválida, tente novamente!");
        }
    }

}
