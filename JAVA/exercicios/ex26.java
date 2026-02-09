/*
26-    Método imprimirCabecalhoNota(String nomeLoja) que imprima um cabeçalho centralizado.
*/

import java.util.Scanner;

public class ex26 {
    static void imprimirCabecalhoNota(String nomeLoja){
        System.out.println("=====================================");
        System.out.println("\t\t"+nomeLoja);
        System.out.println("=====================================");
    }

    public static void main(String[] args) {
        Scanner entradaUser = new Scanner(System.in);

        System.out.println("Digite o nome da loja: ");
        String nomeL = entradaUser.nextLine();

        imprimirCabecalhoNota(nomeL);
    }
}
