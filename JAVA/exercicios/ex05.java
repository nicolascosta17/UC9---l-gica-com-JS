// 05- Dado um número de segundos, calcule e imprima o equivalente em minutos e segundos restantes.


package exercicios;

public class ex05 {
    public static void main(String[] args) {
        double seg = 160;
        double min = (seg/60);
        double rest = seg % 60; 
        min = Math.floor(min);
        System.out.println(seg);
        System.out.println(min);
        System.out.println(rest);
        

    }
}
