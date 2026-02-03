/*
Exercício 6 - Dia da Semana (Switch)
Usando switch, receba um número de 1 a 7 e imprima o dia da semana 
correspondente (1=Domingo, 2=Segunda, etc.).
*/

package exercicioIfElse;

import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner entradaUser = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 7:");
        int diaSemana = entradaUser.nextInt();

        switch (diaSemana) {
            case 1:
                System.out.println("DOMINGO");
                break;
            case 2:
                System.out.println("SEGUNDA");
                break;
            case 3:
                System.out.println("TERÇA");
                break;
            case 4:
                System.out.println("QUARTA");
                break;
            case 5:
                System.out.println("QUINTA");
                break;
            case 6:
                System.out.println("SEXTA");
                break;
            case 7:
                System.out.println("SÁBADO");
                break;
            default:
                System.out.println("Número não válido! Tente novamente!");
                break;
        }

    }
    
}
