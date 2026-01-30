// Proigrama recebe o diametro ai eu imprimo a areá do cirulo
package aula3;

import java.util.Scanner;

public class matematica {
    public static void main(String[] args){
        //Área circulo: PI r^21
        // Declaração de variável
        Scanner entradaUsuario = new Scanner(System.in);
        // double x;
        double diam;
        // double raio;
        double resultado;
        // x = Math.PI;
        System.out.println("Digite o diametro do circulo:");
        diam = entradaUsuario.nextDouble();
        // raio = diam/2;
        resultado = (Math.pow((diam/2), 2.0) * Math.PI);
        System.out.println(resultado);
        
        
    };
};
