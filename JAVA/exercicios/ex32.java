/*
32-    Folha de Pagamento Simples: Calcule salário com horas extras (1.5x após 40h).
*/

import java.util.Scanner;

public class ex32 {

    static void calculoHorasExtras(double salarioHora, double horasMensais){

        double salarioHoras = salarioHora * horasMensais;

        if(horasMensais > 180){
            double horaExtra = horasMensais - 180;
            double valorHoraExtra = horaExtra * 1.5;
            double salarioFinal = valorHoraExtra + salarioHoras;

            System.out.println("Salário Base:"+salarioHoras);
            System.out.println("Horas Normais:"+horasMensais);
            System.out.println("Horas Extra:"+horaExtra);
            System.out.println("Hora Extra valor: R$"+valorHoraExtra);
            System.out.println("Salário final: R$"+ salarioFinal);
            
        }else if(horasMensais > 0){
            System.out.println("Salário Final do funcionário: R$"+ salarioHoras);
        }else if(horasMensais == 0){
            System.out.println("Salário Final: R$0");
        }else{
            System.out.println("Valor negativo, tente novamente!");
        }
    }
    public static void main(String[] args) {
        Scanner entradaUser = new Scanner(System.in);

        System.out.println("Digite o valor da hora do funcionário: R$");
        double salarioFuncionario = entradaUser.nextDouble();
        System.out.println("Digite o total de horas mensais: ");
        double horasExtras = entradaUser.nextDouble();

        calculoHorasExtras(salarioFuncionario, horasExtras);
        

    }    
}
