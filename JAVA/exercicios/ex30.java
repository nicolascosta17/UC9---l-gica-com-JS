/*
30-    Método imprimirLinhaTracejada(int comprimento).
*/

import java.util.Scanner;

public class ex30 {
    static void imprimirLinhaTracejada(int comprimento){

        for(int i = 0; i < comprimento; i++){
            System.out.print("-");
        }

    }

    public static void main(String[] args) {
        Scanner entradaUser = new Scanner(System.in);

        System.out.println("Digite o número de linhas: "); 
        int numberLinhas = entradaUser.nextInt();
        
        imprimirLinhaTracejada(numberLinhas);

    }
}
