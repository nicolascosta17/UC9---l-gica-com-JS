/*
Exercício 13 - Cálculo de IMC e Categoria
Calcule o IMC (peso/altura²) e classifique: Abaixo do peso (<18.5),
Normal (18.5-24.9), Sobrepeso (25-29.9), Obesidade (>=30).
*/

package exercicioIfElse;

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args){
        Scanner entradaUser = new Scanner(System.in);

        System.out.println("Digite seu peso: ");
        double peso = entradaUser.nextDouble();
        System.out.println("Digite sua altura: ");
        double altura = entradaUser.nextDouble();

        double alturaMetros = altura / 100;

        double IMC = peso / Math.pow(alturaMetros, 2);

        if(IMC < 18.5){
            System.out.println("Abaixo do peso");
        }else if((IMC < 25)){
            System.out.println("Normal");
        }else if((IMC < 30)){
            System.out.println("Sobrepeso");
        }else if(IMC >= 30){
            System.out.println("Obesidade");
        }else{
            System.out.println("Valor inválido, tente novamente!");
        }
    }
}
