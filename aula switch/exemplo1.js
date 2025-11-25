let menu = 1; // Cria variável menu que recebe 1

switch(menu){ // switch recebe valor menu
    case 1: // caso for menu == 1 executa todas a linhas do switch a seguir
        console.log("Acessou menu 1"); 
        break; // Para o processo do caso
    case 2: // caso for menu == 2 executa todas as linhar do switch a seguir
        console.log("Acessou menu 2");
    
    default: // caso não for nenhum dos case ele executa o default
        console.log("Acesssou nenhum menu");
};