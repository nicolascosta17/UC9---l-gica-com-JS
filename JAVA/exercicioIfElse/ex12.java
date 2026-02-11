/*
Exercício 12 - Triângulo Válido
Verifique se três lados podem formar um triângulo. 
Regra: cada lado deve ser menor que a soma dos outros dois.
*/

package exercicioIfElse;

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args){
        Scanner entradaUser = new Scanner(System.in);

        System.out.println("Digite o comprimento do primeiro lado: ");
        double ladoA = entradaUser.nextDouble();
        System.out.println("Digite o comprimento do segundo lado: ");
        double ladoB = entradaUser.nextDouble();
        System.out.println("Digite o comprimento do terceiro lado: ");
        double ladoC = entradaUser.nextDouble();

        if((ladoA < ladoB + ladoC) && (ladoB < ladoA + ladoC) && (ladoC < ladoA + ladoB)){
            System.out.println("Sim, pode ser feito um trinângulo");
        }else{
            System.out.println("Não, isso não pode ser um triângulo");
        }
    }
}
