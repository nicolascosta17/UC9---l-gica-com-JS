// ESCREVA UM PROGRAMA PARA DETERMINAR
// SE UM NÚMERO É PAR OU IMPAR

package aula4;

import java.util.Scanner;

public class ParImpar {
    
    public static void main(String[] args){

        Scanner entradaUser = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = entradaUser.nextInt();

        if (num % 2 == 0){
            System.out.println("Este número é PAR.");
        } else{
            System.out.println("Este número é IMPAR.");
        }
    }

}
