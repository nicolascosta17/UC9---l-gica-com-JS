/*
Exercício 8 - Categoria por Idade
Classifique a idade: 0-12 "Criança",
13-17 "Adolescente", 18-59 "Adulto", 60+ "Idoso".
*/

package exercicioIfElse;

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner entradaUser = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        int idade = entradaUser.nextInt();

        if((idade >= 0) && (idade <= 12)){
            System.out.println("Criança");
        }else if((idade >= 13) && (idade <= 17)){
            System.out.println("Adolecente");
        }else if((idade >= 18) && (idade <= 59)){
            System.out.println("Adulto");
        }else if(idade > 60){
            System.out.println("Idoso");
        }else{
            System.out.println("Idade inválida, tente novamente!");
        }
    }
    
}
