/* 
faça um programa que sorteia até 10 números
ou até o usuario acertar
*/
const input = require("../input");
(async ()=>{
    let ale
    let num
    let i=0
    do{
        ale = Math.floor(Math.random()*11);
        console.log("Adivinhe que numero é: ");
        num = Number(await input());
        //i = i + 1;
        //i += 1;
        i++
    }while(ale != num && i<10)
})();