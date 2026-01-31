package exercicios;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        
        Scanner entradaUser = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String name = entradaUser.nextLine();

        System.out.printf("Olá, %s!", name);
        // O %s é um marcador para strings. 
        // O %n pula uma linha ao final

    }    
}
