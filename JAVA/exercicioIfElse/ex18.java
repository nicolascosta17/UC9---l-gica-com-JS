/*
Exercício 18 - Operador Ternário Prático
Use o operador ternário para: receber um número e imprimir "Positivo" ou "Não positivo" em uma linha.
*/

package exercicioIfElse;

import java.util.Scanner;

public class ex18 {
    public static void main(String[] args){
        Scanner entradaUser = new Scanner(System.in);

        System.out.println("Digite o valor: ");
        double numero = entradaUser.nextDouble();

        String resultado = numero > 0 ? "Positivo" : "Negativo";

        System.out.println(resultado);
    }
}
