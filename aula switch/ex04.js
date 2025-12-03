const { describe } = require("node:test");
const input = require("../input");

(async () => {
    console.log("Digite o valor total da compra");
    let totalCompra = Number(await input());

    switch(true){
        case totalCompra >= 100:
            let desconto = 20;
            console.log(`Desconto de ${desconto}% `); 
            break;
        case totalCompra >= 50 && totalCompra < 100:
            desconto = 10;            
            console.log(`Desconto de ${desconto}% `); 
            break;
        case totalCompra >= 20 && totalCompra < 50:
            desconto = 5;            
            console.log(`Desconto de ${desconto}% `); 
            break;
        default: 
            console.log("Sem desconto, valor muito baixo.");            

    }
    
})();