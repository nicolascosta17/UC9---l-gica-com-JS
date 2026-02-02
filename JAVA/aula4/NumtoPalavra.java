package aula4;

public class NumtoPalavra {
    // Dado um número de 1 a 3
    // Converter o algorismo para palavra
    public static void main(String[] args){
        int num = 2; // 1 ou 2 ou 3

        if (num == 1){
            System.out.println("UM");
        } else if(num == 2){
            System.out.println("DOIS");
        } else if(num == 3){
            System.out.println("TRÊS");
        } else{
            System.out.println("Este número não é aceito.");
        }
    }
    
}
