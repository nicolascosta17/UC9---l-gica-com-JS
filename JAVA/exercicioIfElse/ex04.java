/*
Exercício 4 - Aprovado ou Reprovado
Receba uma nota (0 a 10) e imprima "Aprovado" se for maior ou igual a 6, 
caso contrário "Reprovado".
*/

package exercicioIfElse;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner entradaUser = new Scanner(System.in);

        System.out.println("Digite a nota do aluno: ");
        double nota = entradaUser.nextDouble();

        if((nota >= 6) && (nota <= 10)){
            System.out.println("Aluno APROVADO!");
        }else if((nota >= 0) && (nota <= 5)){
            System.out.println("Aluno REPROVADO!");
        }else{
            System.out.println("Digite novamente, nota não está de acordo com o esperado.");
        }

    }
}
