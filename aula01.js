console.log("Olá mundo!"); // Imprime na tela o olá mundo

var nome = "Nicolas"; // Criando uma variável global

console.log("Olá " + nome); // "Olá " + nome está concatenando a string com a variável

var idade = 17; // Declara a variável que obtém um número

// INTERPOLAÇÃO //
/* 
"" - aspas
'' - apostrofe
`` - crase
*/

console.log(`Olá ${nome}, sua idade é de ${idade}`); // Feita a interpolação com string e variáveis

// VETOR (Estante, pode ter varios lugares para guardar varias coisas) //

/* 
() - parenteses: para funções ou predeceção
[] - colchete: para vetores
{} - chaves: para estruturas ou contexto
*/

// camalcase (Como se fosse as corcovas do camelo a segunda palavra em letra maiúscula)
var cestaCafe = []; // Declara um vetor vazio
cestaCafe[0] = "Café"; // Fazendo uma atribuição a posição "0"
cestaCafe[1] = "Ovo"; // Número de dentro "[1]" é o indice

// undercase (Divide as palavras com "_" )
var cesta_cafe = ["Café", "Ovo"]; // Declara o vetor com os seus atributos

cestaCafe.push("Bacon"); // Push permite que coloque um valor na próxima posição disponível
cesta_cafe.push("Pão");

console.log(cestaCafe);
console.log(cesta_cafe);

/* 
Atividade: crie um vetor que guarde o nome, idade e telefone.
*/

var dados_do_aluno = ["Nicolas", 17, "(16)99148-6026"]; // Cria um vetor para guardar os dados do aluno
console.log(`Meu nome é: ${dados_do_aluno[0]}. Minha idade: ${dados_do_aluno[1]}. Meu telefone é: ${dados_do_aluno[2]}`);

// Atividade corrigida

var usuario = ["Nicolas", 17, "(16)99148-6026"];
console.log("Idade:" + usuario[1]);

// estrutura, dicionário, classe anonima
var usuario = { 
    nome: "Nicolas",
    idade: 17,
    telefone: "(16)99148-6026"
};

console.log(usuario);
console.log(usuario.nome);
console.log(usuario.idade);
console.log(usuario.telefone);

/* 
Atividade 1: Criar uma lista telefonica com dois registros(nome, telefone, endereço)
*/


var dados_do_registro1 = ["Nicolas", "(16)99148-6026", "Rua Raphael di Tomazo, 341"];
var dados_do_registro2 = ["Aline", "(16)15615-15666", "Rua Sebastião Ferraz Caldas, 120"];

var lista_telefonica = {
    registro1: dados_do_registro1,
    registro2: dados_do_registro2
};

console.log(`Registro1: Nome: ${lista_telefonica.registro1[0]}, Telefone: ${lista_telefonica.registro1[1]} e Endereço: ${lista_telefonica.registro1[2]}`);
console.log(`Registro2: Nome: ${lista_telefonica.registro2[0]}, Telefone: ${lista_telefonica.registro2[1]} e Endereço: ${lista_telefonica.registro2[2]}`);

// Atividade corrigida

var listaTelefonica = [];

listaTelefonica.push({
    nome: "Nicolas",
    telefone: "(16)99148-6026",
    endereco: "Rua Sebastião"
});

listaTelefonica[1] = {
    nome: "Helena",
    telefone: "(16)91651-6026",
    endereco: "Rua Outra"
};

console.log(listaTelefonica);

/*
Atividade 2: Fazer uma lista com cada produto, com código, nome e valor(dois registros e exibir soma dos produtos da lista)
*/

var listaCompras = [];

listaCompras.push({
    codigo: "001",
    nome: "Maça",
    valor: 5
});

listaCompras.push({
    codigo: "002",
    nome: "Banana Nanica",
    valor: 6
});

console.log(`Você comprou os produtos ${listaCompras[0].nome} e ${listaCompras[1].nome}. Valor total da compra é: R$${listaCompras[0].valor + listaCompras[1].valor}`);

// Atividade corrigida

var estoque = [];

estoque.push({
    codigo: "001",
    nome: "Batatinha",
    valor: 1.89
});

estoque.push({
    codigo: "002", 
    nome: "Coca-cola",
    valor: 3.99
});

var soma = estoque[0].valor + estoque[1].valor;
console.log("A soma do meu estoque é: "+ soma);


/*
Atividade: Criar lista de alunos e suas respectivas notas(3 alunos e média)
*/

var alunos = []

alunos.push({
    nome: "Nicolas",
    nota: 7
});

alunos.push({
    nome: "Jerry",
    nota: 9
});

alunos.push({
    nome: "Leonardo",
    nota: 5
});

var mediaAlunos = (alunos[0].nota + alunos[1].nota + alunos[2].nota)/alunos.length // lenght calcula quantos registros tem no VETOR

console.log(`A média da sala é: ${mediaAlunos}`);
