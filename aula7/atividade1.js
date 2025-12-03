const input = require("../input");
const { validaCpf } = require("./funcaocpf");

(async () => {
    
    console.log("Digite seu CPF: ");
    let entradaCPF = await input();
    
    return validaCpf(entradaCPF);

})();    

