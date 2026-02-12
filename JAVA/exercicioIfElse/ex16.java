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
        boolean temNumero = password.matches(".*\\d.*"); // matches: Semelhante

        for(password.length() == 2){
            
        }

        // if((password.length() < 8) && (temNumero)){
        //     System.out.println("Senha válida");
        // }else {
        //     System.out.println("Senha inválida!");
        // }
    }
}
