/*
Exercício 9 - Login Simples
Verifique se um nome de usuário é "admin" e senha é "1234".
Informe "Acesso concedido" ou "Acesso negado".
*/

package exercicioIfElse;

import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        Scanner entradaUser = new Scanner(System.in);

        System.out.println("Login: ");
        String login = entradaUser.nextLine();
        System.out.println("Senha: ");
        String senha = entradaUser.nextLine();

        if((login.equals("admin")) && (senha.equals("1234"))){
            System.out.println("Acesso concedido");
        }else{
            System.out.println("Acesso negado");
        }
    }
}
