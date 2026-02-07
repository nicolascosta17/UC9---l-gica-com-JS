/*
Objetivo:

Criar um programa em Java que simule um sistema simples para 
gerenciar uma maratona de filmes. 

Descrição do Exercício:

Os alunos devem desenvolver um programa que ajude um usuário a 
planejar uma maratona de filmes. O programa deve realizar as 
seguintes tarefas: 

Parte 1: Estrutura Básica e Saída 
Criar uma classe `MaratonaFilmes` com método `main` que: 
1. Exiba um cabeçalho formatado com o nome do sistema usando 
`printf` 
2. Use pelo menos 3 `println` e 2 sequências de escape 
diferentes (`\n`, `\t`) 

Parte 2: Variáveis e Operadores 
Declarar e utilizar variáveis para: 
1. Armazenar: nome do usuário (String), quantidade de filmes 
(int), horas totais (double) 
2. Calcular: tempo total baseado em quantidade de filmes × 
duração média (use operadores aritméticos) 
3. Converter tipos quando necessário (ex: int para double) 

Parte 3: Métodos 
Criar pelo menos 3 métodos além do `main`: 
1. `exibirCabecalho()` - sem parâmetros, sem retorno (`void`) 
2. `calcularTempoTotal(int filmes, double duracaoMedia)` - com 
parâmetros e retorno `double` 
3. `classificarMaratona(double horas)` - recebe horas e retorna 
uma String com a classificação 

Parte 4: Condicionais e Lógica 
Implementar lógica de decisão: 
1. No método `classificarMaratona`, usar `if-else if-else` para 
classificar: - Até 4 horas: "Maratona Leve" - 4 a 8 horas: "Maratona Moderada" - Mais de 8 horas: "Maratona Épica!" 
2. Usar operadores de comparação e lógicos 
3. Criar um método booleano `isValida(int filmes)` que retorna 
`true` se a quantidade for positiva 

Parte 5: Integração Completa 
No método `main`: 
1. Chamar os métodos na ordem correta 
2. Exibir um resumo formatado com todas as informações 
3. Relatório de testes de outros dois sistemas desenvolvidos por 
outros programadores. 

Exemplo de Saída Esperada 
======================================== 
GERENCIADOR DE MARATONA DE FILMES 
======================================== 
Informações da Maratona: 
Usuário: João 
Filmes planejados: 3 
Duração média por filme: 2.5 horas 
Cálculos: 
Tempo total: 7.5 horas 
Classificação: Maratona Moderada 
Validação: Planejamento válido? true 
======================================== 

*/

package atividadeVisivelNaSala;

import java.util.Scanner;

public class MaratonaFilmes {

    static void exibirCabecalho(){
        System.out.println("=====================================");
        System.out.printf("GERENCIADOR DE MARATONA DE FILMES \n");
        System.out.println("=====================================\n");
    }

    static double calcularTempoTotal(int quantidadeDeFilmes, double duracaoMedia){

        Double quantidadeDeFilmesDouble = new Double(quantidadeDeFilmes);// Transformando variável INT para variável DOUBLE
        double tempoTotalFilmes = quantidadeDeFilmesDouble * duracaoMedia; // Somando horas totais dos filmes           
        return tempoTotalFilmes;
        
    }

    static void classificarMaratona(double horas){
        if(horas <= 4){
            System.out.println("Classificação: Maratona Leve");
        }else if(horas >= 5 && horas <= 8){
            System.out.println("Classificação: Maratona Moderada");
        }else if(horas > 8){
            System.out.println("Classificação: Maratona Épica!");
        }else{
            System.out.println("Classificação: Sem horas totais da Maratona!");
        }
    }

    static boolean isValida(int filme){
        return filme > 0;
    }

    public static void main(String[] args){
        Scanner entradaUser = new Scanner(System.in);

        System.out.println("Digite o seu nome: "); // Pede ao usuário que digite o nome
        String nameUser = entradaUser.nextLine();

        System.out.println("Digite a quantidade de filmes: "); // Pede ao usuário que digite a quantidade de filmes de sua escolha
        int quantidadeDeFilmes = entradaUser.nextInt();
        
        System.out.println("Digite as horas totais: ");// Pede ao usuário que digite as horas totais de cada filme escolhidos
        double horasTotaisFilmes = entradaUser.nextDouble();

        exibirCabecalho();

        System.out.println("Informações da Maratona");

        System.out.println("Usuário: "+ nameUser);

        System.out.println("Filmes planejados: " + quantidadeDeFilmes);

        System.out.printf("Duração média por filmes: "+horasTotaisFilmes+" horas \n\n\n");

        System.out.println("Cálculos:");

        double tempTotal = calcularTempoTotal(quantidadeDeFilmes, horasTotaisFilmes);
        
        System.out.println("Tempo total: "+tempTotal+" horas");

        classificarMaratona(tempTotal);

        String validacaoPlanejamento = isValida(quantidadeDeFilmes) ? "true":"false";
        
        System.out.println("Validação: Planejamento válido? "+validacaoPlanejamento);

    }
}
