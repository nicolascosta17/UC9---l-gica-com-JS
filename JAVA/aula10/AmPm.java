package aula10;

import java.util.Scanner;

public class AmPm {
    public static String timeString(int hora, int minuto){
        String ampm;

        if(hora < 12){
            ampm = "AM";
            if (hora == 0){
                hora = 12;
                
            }
        }else{
            ampm = "PM";
            hora = hora - 12;
        }

        return String.format("%02d: %02d %s", hora, minuto, ampm);
    }

    public static void main(String[] args) {
        Scanner entradaUser = new Scanner(System.in);

        System.out.println("Digite as horas: ");
        int horas = entradaUser.nextInt();
        System.out.println("Digite os minutos: ");
        int minutos = entradaUser.nextInt();
        entradaUser.nextLine();
        System.out.println("Digite o período: (manha, tarde ou noite)");
        String periodo = entradaUser.nextLine();

        if(periodo.equals("manha")){
            timeString(horas, minutos);
        }else{
            System.out.println("oi");
            horas+=12;
            timeString(horas, minutos);
        }
    }
}
