package exercicios;

import java.util.Scanner;

public class ex15{

    public static void imprimirSaudacaoPersonalizada(String name){
        System.out.printf("Olá %s!", name);
    }
    
    public static void main(String[] args) {
        Scanner entradaUser = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String name = entradaUser.nextLine();
        imprimirSaudacaoPersonalizada(name);

    }
}