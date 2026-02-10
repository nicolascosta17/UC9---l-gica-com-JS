package aula6;

public class Loops {

    public static void abobrinha(int n){
        while(n >= 0 && n <= 10){

            System.out.println(n);
            n++; // operador de incremento
            // n--; operador de decremento
        }
        System.out.println("ABOBRAO!");
    }

    public static void sequence(int n){
        while(n != 1){
            System.out.println(n);
            if(n%2 == 0){
                n = n / 2; 
            }
            else{ 
                n = n * 3 + 1; 
            }
        }
        System.out.println(n);
    }

    public static void appreciate(){
        int i = 2;
        while(i <= 8){
            System.out.print(i + ", "); // print: imprimi sem pular linha. println: imprimi e pula a linha
            i += 2;
        }
    }

    public static void appreciate2(){
        for(int i = 2; i <= 8; i+= 2){
            System.out.print(i + ", ");
        }
    }

    public static void loopvar(){
        int n;
        for(n = 3; n > 0; n--){
            System.out.println(n);
        }
        System.out.println("Valor de n: "+ n);
    }

    public static void nested(){
        for(int x = 1; x <= 10; x++){
            for(int y = 1; y <= 10; y++){
                System.out.printf("%4d", x * y); // %4d: faz um espaçamento   
            }
        }
        System.out.println();
    }

    public static void main(Strings[] args){
        // int num = 10;
        // abobrinha(num);
        // sequence(num);
        // appreciate();
        // appreciate2();
        // loopvar();
        nested();
        System.out.println("Sistema Finalizado.");

    }
    
}
