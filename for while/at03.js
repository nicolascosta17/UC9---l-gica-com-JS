/* 
Faça uma programa que sorteira até 10 números 
ou até o usuário acertar
*/

const input = require("../input");

(async () => {
    
    let escolha;
    let i = 0;
    let num;

    do{
        console.log(`Escolha um número de 1 a 10`);
        num = Math.floor(Math.random()*11);
        escolha = Number(await input());
        i++;
        console.log(`Número sorteado ${num}`)
    }while(num != escolha && i < 10 && escolha >=1 && escolha <=10);

})();