package aula4;

import java.util.Scanner;

public class PositivoNegativo {
    
    public static void main(String[] args){
        Scanner entradaUser = new Scanner(System.in);

        System.out.println("Entre com um número: ");
        double num = entradaUser.nextDouble();

        if (num < 0){
            System.out.println("Este número é negativo.");
        } else if(num > 0){
            System.out.println("Este número é positivo");
        }
        else{
            System.out.println("Este número é igual à 0");
        }

    }

}
