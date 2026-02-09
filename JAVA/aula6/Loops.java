package aula6;

public class Loops {

    public static void countdown(int n){
        while(n > 0){

            System.out.println(n);
            n = n - 1;
        }
        System.out.println("BOOM!");
    }

    public static void main(String[] args){
        int num = 5;
        countdown(num);
        System.out.println("Sistema Finalizado.");

    }
    
}
