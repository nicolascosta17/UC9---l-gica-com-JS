const input = require("../input");

(async () => {
    console.log("Digite a quantidades de pontos do cliente");
    let pontos = Number(await input());

    switch(true){
        case pontos < 100:
            console.log("Cliente Iniciante");
            console.log("Direito a ser considerado humano sksk.");
            break;

        case pontos >=100 && pontos < 300:
            console.log("Cliente Bronze");
            console.log("Direito a um parabéns.");
            break;

        case pontos >=300 && pontos < 300:
            console.log("Cliente Prata");
            console.log("Direito a 2 ingressos para o circo.");
            break;
        
        case pontos >= 700:
            console.log("Cliente Ouro");
            console.log("Direito a um combo spotify familia por mês.");
            break;
            
        default:
            console.log("Pontos inferiores para ser um Cliente Iniciante");  
            
            
    };
})();