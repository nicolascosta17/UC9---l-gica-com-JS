/*
Exercício 7 - Calculadora Simples
Receba dois números e uma operação (+, -, *, /). 
Use switch para calcular e mostrar o resultado.
*/

package exercicioIfElse;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner entradaUser = new Scanner(System.in);

        double resultado;
         
        System.out.println("Digite o primeiro número: ");
        double num1 = entradaUser.nextDouble();
        System.out.println("Escolha a operação. 1-Soma(+) 2-Subtração(-) 3-Multiplicação(*) 4-Divisão(/)");
        int operacao = entradaUser.nextInt();
        System.out.println("Digite o segundo número: ");
        double num2 = entradaUser.nextDouble();

        if((operacao >= 1) && (operacao <= 4)){
            switch (operacao) {
                case 1:
                    resultado = num1 + num2;
                    System.out.printf("A soma de %s + %s é igual á: %s", num1,num2,resultado);
                    break;
                case 2:
                    resultado = num1 - num2;
                    System.out.printf("A soma de %s - %s é igual á: %s", num1,num2,resultado);
                    break;
                case 3:
                    resultado = num1 * num2;
                    System.out.printf("A soma de %s * %s é igual á: %s", num1,num2,resultado);
                    break;            
                default:
                    resultado = num1 / num2;
                    System.out.printf("A soma de %s / %s é igual á: %s", num1,num2,resultado);
                    break;
            }
        }else{
            System.out.println("Número da operção inválido.");
        }

    }
}
