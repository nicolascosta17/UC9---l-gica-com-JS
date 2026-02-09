package aula6;

public class Loops {

    public static void abobrinha(int n){
        while(n >= 0 && n <= 10){

            System.out.println(n);
            n++;
        }
        System.out.println("ABOBRAO!");
    }

    public static void main(String[] args){
        int num = 0;
        abobrinha(num);
        System.out.println("Sistema Finalizado.");

    }
    
}
