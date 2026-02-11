/*
Exercício 10 - Desconto por Compra
Se o valor da compra for maior que R$ 100, 
aplique 10% de desconto. Mostre o valor final.
*/

package exercicioIfElse;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner entradaUser = new Scanner(System.in);

        
        System.out.println("Digite o valor da compra: ");
        double compraValor = entradaUser.nextDouble();

        if(compraValor > 100){
            double desconto = compraValor * (10.0 / 100);
            double valorTotal = compraValor - desconto;
            System.out.println("Valor total da compra: R$" + valorTotal);
        }else{
            System.out.println("Oi");
            System.out.println("Valor total da compra: R$" + compraValor);
        }
    }
    
}
