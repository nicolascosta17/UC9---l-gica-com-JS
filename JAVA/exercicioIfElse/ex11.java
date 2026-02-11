/*
Exercício 11 - Ano Bissexto
Verifique se um ano é bissexto. Regra: Divisível por 4, 
mas não por 100, exceto se for divisível por 400.
*/

package exercicioIfElse;

import java.util.Scanner;

public class ex11{

    public static void main(String[] args){
        Scanner entradaUser = new Scanner(System.in);

        System.out.println("Digite o ano: ");
        int anoBisexto = entradaUser.nextInt();
        if((anoBisexto % 4 == 0) && (anoBisexto % 100 != 0) || (anoBisexto % 400 == 0)){
            System.out.println("Ano Bissexto");
        }else{
            System.out.println("Ano NÃO Bissexto");
        }
    }

}