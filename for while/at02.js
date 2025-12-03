const input = require("../input");

(async () => {
    let continuar = "sim";
    while(continuar == "sim"){ // Faz isso primeiro
        console.log("Deseja continuar? sim ou nao")
        continuar = await input();
    } // Depois se for verdade ele prosegue 
})();