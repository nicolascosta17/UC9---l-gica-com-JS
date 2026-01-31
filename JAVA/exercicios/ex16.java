// Calculadora de Gorjeta: Peça o total da conta e a porcentagem da gorjeta, calcule e imprima a gorjeta e o total final.~L

package exercicios;

import java.util.Scanner;

public class ex16 {
    
    public static void main(String[] args) {
        Scanner entradaUser = new Scanner(System.in);
        System.out.println("Digite o total da conta: ");
        double conta = entradaUser.nextDouble();
        System.out.println("Digite a porcentagem da gorjeta: ");
        int porc = entradaUser.nextInt();

        double gorjeta = conta * porc/100;
        double total = gorjeta + conta;

        System.out.printf("Valor da conta: R$"+ conta +"%nValor da gorjeta é de R$"+ gorjeta +"%nValor total da conta é de R$"+ total);
    }
}
