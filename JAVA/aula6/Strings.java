package aula6;

public class Strings{
    public static void main(String[] args){
        String fruta = "bAnana";
        char letra; // variárvel tipo char. método charAt: char(caracter) At(posição)
        
        for(char c = 65; c <= 122; c++){
            System.out.printf("%d ", (char)c);
        }
    
    
        // for(int i = 0; i <= fruta.length(); i++){
        //     letra = fruta.charAt(i);
        //     System.out.println(letra);
        //     if(letra == 'A'){
        //         System.out.println("Achamos um Azão!");
        //     }
        // }
        // System.out.println(letra);
        // letra = fruta.charAt(1);
        // System.out.println();
    }
}