package aula6;

public class Strings{

    public static void main(String[] args){
        String fruta = "banAna";
        // char letra; // variárvel tipo char. método charAt: char(caracter) At(posição)
      
        char letra = 'a';
        
        for(int i = 0; i < 32; i++){
            System.out.print((char)(letra + i));
        }

        // String s1 = "Alan Turing";
        // String s2 = "Ada Lovelace";
        // char letra;

        // int diff = s1.compareTo(s2);

        // if(diff < 0){
        //     System.out.println("s1 vem antes do s2");
        //     System.out.println(diff);
        // }else if(diff > 0){
        //     System.out.println("s2 vem antes do s1");
        //     System.out.println(diff);
        // }else{
        //     System.out.println("s1 e s2 são iguais");
        //     System.out.println(diff);
        // }


        // System.out.println(fruta.substring(0,4)); // Imprima da "0" caracter da posicão até o "4" caracter da posição: resultado = banA
        // System.out.println(fruta.toLowerCase());
        // System.out.println(fruta.toUpperCase());


        // for(char c = 65; c <= 122; c++){
        //     System.out.printf("%d ", (char)c); // Cast: só funciona com tipos primitivos exeto tipo boolean
        // }
    
    
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