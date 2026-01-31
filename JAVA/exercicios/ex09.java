package exercicios;

import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        Scanner entradaUser = new Scanner(System.in);

        System.out.println("Digite o preço do produto: ");
        double preco = entradaUser.nextDouble();
        System.out.println("Digite a quantidade do produto: ");
        int quantidade = entradaUser.nextInt();

        System.out.println("O valor total da compra é de R$" + (preco * quantidade));
    }   
}
