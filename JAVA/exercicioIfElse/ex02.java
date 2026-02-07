/*
Exercício 2 - Maior de Idade
Peça a idade do usuário e informe se ele é "Maior de idade" 
(18 anos ou mais) ou "Menor de idade".
*/

package exercicioIfElse;

import java.util.Scanner;

public class ex02 {

    public static void main(String[] args) {
        Scanner entradaUser = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        int idade = entradaUser.nextInt();

        if (idade >= 18){
            System.out.println("Maior de idade");
        } else{
            System.out.println("Menor de idade");
        }
    }
    
}
