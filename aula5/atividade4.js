/* 
faça um programa que sorteia até 10 números
ou até o usuario acertar
*/
const input = require("../input");
(async ()=>{
    for(let ale=-1, num, i=0;ale != num && i<10;i++){
        ale = Math.floor(Math.random()*11);
        console.log("Adivinhe que numero é: ");
        num = Number(await input());
    }
})();