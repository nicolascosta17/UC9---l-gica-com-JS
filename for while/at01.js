const input = require("../input");

(async () => {
    do{ // Faz isso primeiro
        console.log("Deseja continuar? 1-SIM 2-NÃO")
        var continuar = Number(await input());
    }while(continuar == 1) // Depois se for verdade ele prosegue 
})();