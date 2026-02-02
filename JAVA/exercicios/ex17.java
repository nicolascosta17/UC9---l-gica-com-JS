// 17-    Extrator de Dígitos: Peça um número de 3 dígitos. Extraia e imprima cada dígito.

package exercicios;

import java.util.Scanner;

public class ex17 {

    public static void main(String[] args){
        Scanner entradaUser = new Scanner(System.in);
        System.out.println("Digite um número de 3 digitos: ");
        int numero = entradaUser.nextInt();

        int centena = numero / 100;
        int dezena = (numero / 10) % 10;
        int unidade = numero % 10;

        System.out.println("Centena: " + centena);
        System.out.println("Dezena: " + dezena);
        System.out.println("Unidade: " + unidade);

    }
    
}
