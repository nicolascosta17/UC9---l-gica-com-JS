let input = require("../input");

(async () => {
    console.log("Digite o número do item desejado: 1-X Salada, 2-X Burger, 3-Misto Quente, 4-Suco Natural, 5-Refrigerante: ");
    let menu = Number(await input());

    switch(menu){
        case 1:
            console.log("Você escolheu X-Salada");
            break;
        case 2:
            console.log("Você escolheu X-Burger");
            break;
        case 3:
            console.log("Você escolheu Misto Quente");
            break;
        case 4:
            console.log("Você escolheu Suco Natural");
            break;
        case 5:
            console.log("Você escolheu Refrigerante");
            break;
        default:
            console.log("Opção inválida, tente novamente!");
            
    };

})();

