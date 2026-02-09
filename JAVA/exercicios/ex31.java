/*
31-    Calculadora de IMC: Peça peso (kg) e altura (cm), calcule o IMC e categorize.
*/


import java.util.Scanner;

public class ex31 {
    static void calculadoraImc(double kg, double cm){
        double alturaMetros = cm / 100;
        double IMC = kg / (Math.pow(alturaMetros, 2));

        if(IMC >= 18 && IMC < 25){
            System.out.println("Normal");
        }else if(IMC >= 25 && IMC < 30){
            System.out.println("Sobrepedo");
        }else if(IMC >= 30 && IMC < 35){
            System.out.println("Obesos: Classe I");
        }else if(IMC >= 35 && IMC < 40){
            System.out.println("Obesos Classe II");
        }else if(IMC >= 40){
            System.out.println("Obesos Classe III");
        }else{
            System.out.println("Valor inválido, tente novamente!");
        }
    }
    public static void main(String[] args) {
        Scanner entradaUser = new Scanner(System.in);

        System.out.println("Digite seu peso em KG: ");
        double kg = entradaUser.nextDouble();
        System.out.println("Digite a altura em CM: ");
        double cm = entradaUser.nextDouble();

        calculadoraImc(kg, cm);

    }
}
