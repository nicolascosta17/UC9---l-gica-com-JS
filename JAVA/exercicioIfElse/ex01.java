package exercicioIfElse;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner entradaUser = new Scanner(System.in);        

        System.out.println("Digite um número inteiro: ");
        int num = entradaUser.nextInt();
        
        if (num % 2 == 0){
            System.out.println("Este número é PAR");
        } else{
            System.out.println("Este número é IMPAR");
        }

    }
}
