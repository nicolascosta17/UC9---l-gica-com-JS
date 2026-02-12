/*
Exercício 16 - Validador de Senha
A senha deve ter: pelo menos 8 caracteres 
E conter pelo menos um número. Informe se é válida ou não.
*/

package exercicioIfElse;

import java.util.Scanner;

public class ex16 {
    public static void main(String[] args){
        Scanner entradaUser = new Scanner(System.in);

        System.out.println("Digite a senha: ");
        String password = entradaUser.nextLine();
        boolean temNumero = false;

        for(int i = 0; i < password.length(); i++){ // verifica posição por posição

            char caracteres = password.charAt(i); // Pega o caracter da variável "password" e guarda na variável "caracter"
            // password.charAt(i): “Me dá a letra que está na posição i da senha”

            if(Character.isDigit(caracteres)){ // Verifica se tem número na variável
                temNumero = true;
                break;
            }

        }

        if((password.length() >= 8) && (temNumero)){
            System.out.println("Senha válida");
        }else {
            System.out.println("Senha inválida!");
        }
    }
}
