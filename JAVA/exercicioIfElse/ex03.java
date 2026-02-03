/*
Exercício 3 - Comparador Simples
Receba dois números e informe qual é o maior, ou se são iguais.
*/

package exercicioIfElse;

import java.util.Scanner;

public class ex03 {
    
    public static void main(String[] args) {
        Scanner entradaUser = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double num1 = entradaUser.nextDouble();
        System.out.println("Digite o segundo número: ");
        double num2 = entradaUser.nextDouble();

        if(num1 > num2){
            System.out.printf("%s é maior que %s", num1, num2);
        } else if(num1 < num2){
            System.out.printf("%s é maior que %s", num2, num1);
        }else{
            System.out.printf("%s e %s são iguais", num1, num2);
        }

    }

}
