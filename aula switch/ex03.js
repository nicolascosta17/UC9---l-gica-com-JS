const input = require("../input");

(async () => {
    console.log("Escolha o tamanho do combo (P-Pequeno, M-Médio e G-Grande");
    let tamanho = await input();
    
    tamanho = tamanho.toUpperCase();

    switch(tamanho){
        case "P":
            console.log("Combo Pequeno escolhido (R$ 15.00).");
            break;
        case "M":
            console.log("Combo Médio escolhido (R$ 20.00).");
            break;
        case "G":
            console.log("Combo Grande escolhido (R$ 25.00).");
            break;
        default:
            console.log("Tamanho inválido.");
    };
    


})();