/*
Atividade1: Crie uma lista chamada funcionarios que guarde 3 registros com nome, cargo e salário
*/

var funcionarios = [];

funcionarios.push({
    nome: "Nicolas",
    cargo: "Gerente",
    salario: "R$2800"
});

funcionarios.push({
    nome: "Ana",
    cargo: "Faxineira",
    salario: "R$1518"
});

funcionarios.push({
    nome: "Gustavo",
    cargo: "Pizzaiolo",
    salario: "R$2000"
});

console.log(`O funcionário ${funcionarios[0].nome} trabalha com o cargo ${funcionarios[0].cargo} e ganha ${funcionarios[0].salario}`);

/*
Atividade2: Crie uma lista chamada caixa com 3 produtos com nome, valorUnitário e quantidade
Mostre: O valor total de cada produto (valorUnitario * quantidade) e O valor total geral da compra.
*/

var caixa = [];

caixa.push({
    nome: "Maça",
    valorUnitario: 5,
    quantidade: 5
});

caixa.push({
    nome: "Banana",
    valorUnitario: 3,
    quantidade: 10
});

caixa.push({
    nome: "Leite",
    valorUnitario: 12,
    quantidade: 3
});

for (var produto of caixa) {
    var calculoProdutos = produto.valorUnitario * produto.quantidade;
    console.log(`Produto: ${produto.nome} - Total: R$${calculoProdutos}`);
};

/*
Atividade3: Crie uma lista alunos com 3 alunos. 
Cada aluno deve ter: nome, nota1 e nota2
*/

var alunosLista = [];

alunosLista.push({
    nome: "Nicolas",
    nota1: 10,
    nota2: 7
});

alunosLista.push({
    nome: "Ana",
    nota1: 8,
    nota2: 5
});

alunosLista.push({
    nome: "Gabriel",
    nota1: 6,
    nota2: 7
});

for(var nota of alunosLista){
    var calculoMedias = (nota.nota1 + nota.nota2)/2;
    console.log(`Aluno: ${nota.nome} - Média:${calculoMedias}`);
    if(calculoMedias > 7.0){
        console.log("Aluno aprovado!");
    }else{
        console.log("Aluno reprovado!");
    };
};

/*
Atividade4: Monte uma lista agenda com 3 contatos, contendo: nome, telefone e cidade
*/

var listaAgenda = [];

listaAgenda.push({
    nome: "Nicolas",
    telefone: "(16) 91199-1596",
    cidade: "São Paulo"
});

listaAgenda.push({
    nome: "Ana Castela",
    telefone: "(11)15615-1919",
    cidade: "Ribeirão Preto"
});

listaAgenda.push({
    nome: "Gabriel",
    telefone: "(16)15611-1961",
    cidade: "Brotas"
});

// Percorre todos os clientes da lista
listaAgenda.forEach(cliente => { //O método .forEach() percorre todos os elementos de um array
  if (cliente.cidade === "Ribeirão Preto") {
    console.log(`Cliente: ${cliente.nome} - Cidade: ${cliente.cidade}`);
  }
});

/*
Atividade5: Crie uma lista veiculos com 2 registros, contendo: modelo, ano e valor
Mostre o veículo mais caro e o mais barato com mensagens como:
*/

var listaVeiculos = [];

listaVeiculos.push({
    modelo: "Civic",
    ano: "2017",
    valor: 100000
});

listaVeiculos.push({
    modelo: "Corolla",
    ano: "2020",
    valor: 150000
});

if(listaVeiculos[0].valor > listaVeiculos[1].valor){
    console.log(`O veículo mais caro é o: ${listaVeiculos[0].modelo}. O mais barato é o: ${listaVeiculos[1].modelo}`)
}else{
    console.log(`O veículo mais caro é o: ${listaVeiculos[1].modelo}. O mais barato é o: ${listaVeiculos[0].modelo}`)
}