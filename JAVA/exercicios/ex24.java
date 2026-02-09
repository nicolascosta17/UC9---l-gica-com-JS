/*
24-    Repetidor de String: Peça uma palavra e um número. Imprima a palavra repetida.
*/

import java.util.Scanner;

public class ex24 {
    public static void main(String[] args) {
        Scanner entradaUser = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String palavra = entradaUser.nextLine();

        System.out.println("Digite um número de repetição: ");
        int number = entradaUser.nextInt();

        for(int i = 0; i < number; i++){
            System.out.println(palavra);
        }
    }
}
