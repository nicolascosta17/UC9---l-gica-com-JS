function tigrinho(){ // Criada função name que recebe parametros
    return Math.floor(Math.random()*10)
};

let sorteado = tigrinho(); // Cria variável sorteado que recebe a função tigrinho()

switch(true){ // switch recebe valor menu
    case sorteado > 3: // caso for função tigrinho == 1 executa todas a linhas do switch a seguir
        console.log("Parabéns você ganhou o prémio máximo"); 
         // Para o processo do caso
    case sorteado == 2: // caso for função tigrinho == 2 executa todas as linhar do switch a seguir
        console.log("Você ganhou uma caixa de leite");
    
    default: // caso não for nenhum dos case ele executa o default
        console.log("Ganhou nada");
};