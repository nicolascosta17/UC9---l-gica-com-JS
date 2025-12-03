/*
Faça uma função na biblioteca de vocês que valida
email e telefone, e reescreva o programa de agenda
cadastrando nome, email e telefone validados
*/

const {validarEmail} = require("./atv4functions");
const {validarTelefone} = require("./atv4functions");
const input = require("../input");

(async () => {

    let agenda = [];
    let continuar;
    do{
        
        console.log("Digite seu nome: ");
        let nameInput = await input();

        console.log("Digite seu email:");
        let emailInput = await input();

        validacaoEmail = validarEmail(emailInput);

        console.log("Digite seu telefone:");
        let telefoneInput = await input();

        validacaoTelefone = validarTelefone(telefoneInput);

        if(validacaoEmail && validacaoTelefone){
            agenda.push({
                nome: nameInput,
                email: emailInput,
                telefone: telefoneInput
            })
            
            console.log("Deseja continuar? (sim) ou (não)")
            continuar = (await input()).toLowerCase()

        }else{
            console.log("Erro ao cadastrar email!")
            console.log("Erro ao cadastrar telefone!")
            break;
        }

    
    }while(continuar == "sim")
    console.log(agenda)

})();