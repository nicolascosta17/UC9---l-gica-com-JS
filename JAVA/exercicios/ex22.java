/*
22-    Classificador de Idade: Pergunte a idade e imprima "Criança", "Adolescente" ou "Adulto".
*/

import java.util.Scanner;

public class ex22 {
    public static void main(String[] args){
        Scanner entradaUser = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        int idadeUser = entradaUser.nextInt();

        if(idadeUser <= 11 && idadeUser > 0){
            System.out.println("Criança");
        }else if(idadeUser >= 12 && idadeUser < 18){
            System.out.println("Adolecente");
        }else if(idadeUser >= 18){
            System.out.println("Adulto");
        }else{
            System.out.println("Idade inválida");
        }
    }
}
