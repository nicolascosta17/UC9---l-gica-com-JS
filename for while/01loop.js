// Aula de laço repetição

let contador = 0;
let continuarLoop = true; // booleana


while(continuarLoop == true){
    contador++; // Aumenta o valor da variável em exatamente 1
    // console.log(`Bom diaa! ${contador}`);
    if(contador == 1000000){
        console.log("Parabéns você chegou a 1🌽");
        continuarLoop = false;
        
        // break;
    };
};