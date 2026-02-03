package aula4;

public class Revisao { //public ==> Revisao.java

    void metodoCriar(){

        System.out.println("um texto");
    
    }

    public static void main(String[] args){
        //declarações
        int x; // Variável do tipo primitivo int
        String palavra; // Objeto da classe String
        double y; // Variável do tipo primitivo double
        Double w; // Objeto da classe Double
        
        metodoCriar();

        palavra.trim(); // Se tiver espaço antes ou depois da palavra ele corta.
        palavra.length(); // Conta a quantidade de caracteres;
        
    }


    /*
    Controle de Fluxo Lógica:

    Operadores Relacionais:

    Igualdade: x = y (x é igual a y)
    Diferente: x != (x é diferente de y)
    Maior que: x > y (x é maior que y)
    Menor que: x < y (x é menor que y)
    Maior ou Igual que: x >= y (x pode ser maior ou igual a y)
    Menor ou Igual que: x <= y (x pode ser menor ou igual a y)

    */

    void metodoIfElse(){
        // ==========IF's Else's Switch===========
        int x;
        int y;
        if (x == y){
            System.out.println("x é maior que y");
        }
    }

    /*
    Operadores Aritmeticos:

    and ==> &&
    or ==> ||
    not ==> !

    */

}
