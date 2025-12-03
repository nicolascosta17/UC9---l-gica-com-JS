let input = require("../input");

let listaProdutos = []

listaProdutos.push({
    codigo: "100",
    produto: "X-Salada",
    valor: 12.00
});
listaProdutos.push({
    codigo: "101",
    produto: "X-Burger",
    valor: 10.00
});
listaProdutos.push({
    codigo: "102",
    produto: "Cachorro-Quente",
    valor: 8.50
});
listaProdutos.push({
    codigo: "103",
    produto: "Suco",
    valor: 6.00
});
listaProdutos.push({
    codigo: "104",
    produto: "Refrigerante",
    valor: 5.00
});


(async () => {
    console.log("Insira o código do produto desejado (1-X Salada, 2-X Burger, 3-Cachorro Quente, 4-Suco e 5-Refrigerante): ");
    let codProduto = Number(await input());

    console.log("Insira a quantidade em números do produto desejado: ");
    let quantProduto = Number(await input());

    switch(true){
        case codProduto == 1:
            let valor_total = listaProdutos[0].valor * quantProduto
            console.log(`Você pediu ${quantProduto} unidades de ${listaProdutos[0].produto}, Valor total: R$${valor_total}`);
        
        case codProduto == 2:
            valor_total = listaProdutos[1].valor * quantProduto
            console.log(`Você pediu ${quantProduto} unidades de ${listaProdutos[1].produto}, Valor total: R$${valor_total}`);

        case codProduto == 3:
            valor_total = listaProdutos[2].valor * quantProduto
            console.log(`Você pediu ${quantProduto} unidades de ${listaProdutos[2].produto}, Valor total: R$${valor_total}`);

        case codProduto == 4:
            valor_total = listaProdutos[3].valor * quantProduto
            console.log(`Você pediu ${quantProduto} unidades de ${listaProdutos[3].produto}, Valor total: R$${valor_total}`);

        case codProduto == 5:
            valor_total = listaProdutos[4].valor * quantProduto
            console.log(`Você pediu ${quantProduto} unidades de ${listaProdutos[4].produto}, Valor total: R$${valor_total}`);

        default:
            console.log("Código inválido")

    };
    
})();