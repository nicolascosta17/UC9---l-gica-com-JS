/*
Exercício 17 - Plano de Saúde
Baseado na idade: 0-18 anos = R$ 50, 19-40 = R$ 70, 41-60 = R$ 90, 61+ = R$ 100. Calcule o valor do plano.
*/

package exercicioIfElse;

import java.util.Scanner;

public class ex17 {
    public static void main(String[] args){
        Scanner entradaUser = new Scanner(System.in);

        System.out.println("Digiet a sua idade: ");
        int idade = entradaUser.nextInt();

        if(idade <= 18){
            double dinheito = 50;
            System.out.println("Valor do plano é de R$"+dinheito);
        }else if(idade <= 40){
            double dinheito = 70;
            System.out.println("Valor do plano é de R$"+dinheito);
        }else if(idade <= 60){
            double dinheito = 90;
            System.out.println("Valor do plano é de R$"+dinheito);
        }else if(idade >= 61){
            double dinheito = 100;
            System.out.println("Valor do plano é de R$"+dinheito);
        }else{
            System.out.println("Idade inválida, tente novamente!");
        }

    }
}
