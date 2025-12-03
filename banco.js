const { log } = require("node:console");
const input = require("../input"); // importa funcionalidade do input
// Atividade bancária
(async () => { // Função anônima
    let saldo = 300
    console.log("⭐ Bem-vindo ao sistema Nick's Bank 🏦💸");
    console.log("Digite 1-depositar 2-sacar: ");
    // let resposta = Number(await input()) Para pegar numero
    // let resposta = parseFloat(await input()) Para pegar um numero real
    // let resposta = parseInt(await input()) Para pegar um numero inteiro
    let resposta = await input();
    console.log("💵 Digite o valor a ser depositado: ");
    let valor = Number( await input() );
    if(resposta == "1"){
        if(valor >= 1){
            saldo += valor;
            console.log("✅ Operação realizada com sucesso ");
            console.log(`Seu saldo atual é de: R$ ${saldo}`);
        }else{
            console.log("Valor mínimo a ser depositado é de R$1.");
            console.log("Tente novamente!");
        };
    }else if(resposta == "2"){
        if(valor > saldo ){
            saldo -=  valor;
            console.log("✅ Operação realizada com sucesso ");
            console.log(`Seu saldo atual é de: R$ ${saldo}`);
        }else{
            console.log("Saldo insuficiênte para o saque.");
            console.log("Tente novamente");            
        };
    }else{
        console.log("Você não digitou incorreto!");
        console.log("Tente novamente!");
    };
})();