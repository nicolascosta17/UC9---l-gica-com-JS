/*
Exercício 5 - Positivo, Negativo ou Zero
Receba um número e classifique-o como "Positivo", "Negativo" ou "Zero".
*/

package exercicioIfElse;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner entradaUser = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double num = entradaUser.nextDouble();

        if(num > 0){
            System.out.println("POSITIVO");
        }else if(num < 0){
            System.out.println("NEGATIVO");
        }else{
            System.out.println("ZERO");
        }

    }
}
