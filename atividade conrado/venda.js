const { log } = require("node:console");
const input = require("../input");
const { backup } = require("node:sqlite");

(async () => {
    
    console.log("DIGITE 1-COLOCAR VALORES MANUALMENTE 2-VALORES PRÉ PROGRAMADOS")
    let escolha_operacao = await input()

    if(escolha_operacao == "1"){
        
        console.log("Bem-vindo a distribuidora Nick Doggs");
        console.log("Digite o valor dos respectivos produtos: ");
        console.log("Pão: R$");
        let pao = parseFloat( await input() );
        console.log("Salsicha: R$");
        let salsicha = parseFloat( await input() );
        console.log("Bacon: R$");
        let bacon = parseFloat( await input() );
        console.log("Purê de Batata: R$");
        let pure = parseFloat( await input() );
        console.log("Salada: R$");
        let salada = parseFloat( await input() );
        console.log("Batata palha: R$");
        let batata = parseFloat( await input() );

        let hotdog_simples = pao + batata + salsicha + pure;
        let dog_salada = pao + batata + salsicha + salada;
        let dog_duplo = pao + batata + ( salsicha * 2 ) + pure + bacon;
        let dog_tudo = pao + batata + ( salsicha * 2 ) + ( pure * 2 ) + bacon + salada;

        console.log(`O preço de custo do Hotdog Simple é de: R$${hotdog_simples}`);
        console.log(`O preço de custo do Dog Salada é de: R$${dog_salada}`);
        console.log(`O preço de custo do Dog Duplo Especial é de: R$${dog_duplo}`);
        console.log(`O preço de custo do Dog-Tudo é de: R$${dog_tudo}`);

        console.log("Digite o valor de lucro em porcentagem:");
        let porcentagem = Number( await input() );
        porcentagem = porcentagem / 100;
        console.log("Digite o Lanche em que deseja aplicar a operação: (1-Hotdog, 2-Dog Salada, 3-Dog Duplo, 4-Dog Tudo");
        let escolha_lanche = await input();

        function aplicaLucro(valor) {
            return valor + (valor * porcentagem);
        }

        if(escolha_lanche == "1"){
            hotdog_simples = aplicaLucro(hotdog_simples);
            console.log(`O lucro total do Hotdog Simples é de: R$${hotdog_simples}`);
        }else if(escolha_lanche == "2"){
            dog_salada = aplicaLucro(dog_salada);
            console.log(`O lucro total do Dog Salada é de: R$${dog_salada}`);
        }else if(escolha_lanche == "3"){
            dog_duplo = aplicaLucro(dog_duplo);
            console.log(`O lucro total do Dog Duplo é de: R$${dog_duplo}`);
        }else if(escolha_lanche == "4"){
            dog_tudo = aplicaLucro(dog_tudo);
            console.log(`O lucro total do Dog Tudo é de: R$${dog_tudo}`);
        }else{
            console.log("Digite um valor novamente");
        };

    }else if(escolha_operacao == "2"){
        
        let pao = 1.5;
        let salsicha = 0.5;
        let bacon = 2;
        let pure = 3;
        let salada = 1.5;
        let batata = 2;

        let hotdog_simples = pao + batata + salsicha + pure;
        let dog_salada = pao + batata + salsicha + salada;
        let dog_duplo = pao + batata + ( salsicha * 2 ) + pure + bacon;
        let dog_tudo = pao + batata + ( salsicha * 2 ) + ( pure * 2 ) + bacon + salada;

        console.log(`O preço de custo do Hotdog Simple é de: R$${hotdog_simples}`);
        console.log(`O preço de custo do Dog Salada é de: R$${dog_salada}`);
        console.log(`O preço de custo do Dog Duplo Especial é de: R$${dog_duplo}`);
        console.log(`O preço de custo do Dog-Tudo é de: R$${dog_tudo}`);

        console.log("Digite o valor de lucro em porcentagem:");
        let porcentagem = Number( await input() );
        porcentagem = porcentagem / 100;
        console.log("Digite o Lanche em que deseja aplicar a operação: (1-Hotdog, 2-Dog Salada, 3-Dog Duplo, 4-Dog Tudo");
        let escolha_lanche = await input();

        function aplicaLucro(valor) {
            return valor + (valor * porcentagem);
        }

        if(escolha_lanche == "1"){
            hotdog_simples = aplicaLucro(hotdog_simples);
            console.log(`O lucro total do Hotdog Simples é de: R$${hotdog_simples}`);
        }else if(escolha_lanche == "2"){
            dog_salada = aplicaLucro(dog_salada);
            console.log(`O lucro total do Dog Salada é de: R$${dog_salada}`);
        }else if(escolha_lanche == "3"){
            dog_duplo = aplicaLucro(dog_duplo);
            console.log(`O lucro total do Dog Duplo é de: R$${dog_duplo}`);
        }else if(escolha_lanche == "4"){
            dog_tudo = aplicaLucro(dog_tudo);
            console.log(`O lucro total do Dog Tudo é de: R$${dog_tudo}`);
        }else{
            console.log("Digite um valor novamente");
        };

    }else{
        console.log("Erro! Digite o valor novamente.")
    }

})();
