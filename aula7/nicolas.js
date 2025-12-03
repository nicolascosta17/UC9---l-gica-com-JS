function random(inferior=0, superior=1, tipo='float'){
    if(superior<inferior){
        console.error("Número superior deve ser maior que o numero");
        return;
    };

    switch(tipo){
        case 'float':
            return Math.random()*(superior+1-inferior)+(inferior);
        case 'int':
            return Math.floor(Math.random()*(superior+1-inferior))+(inferior);
    };
};

function validaCpf(cpf) {
    // Remove pontos e traço caso existam
    cpf = cpf.replace(/\D/g, "");

    // CPF precisa ter 11 dígitos
    if (cpf.length !== 11) {
        console.error("CPF inválido: quantidade de dígitos incorreta!");
        return false;
    }

    // Rejeita CPFs com todos os dígitos iguais (00000000000, 11111111111, etc.)
    if (/^(\d)\1+$/.test(cpf)) {
        console.error("CPF inválido: sequência repetida!");
        return false;
    }

    // ----------- Cálculo do primeiro dígito verificador -----------
    let soma = 0;
    for (let i = 0; i < 9; i++) {
        soma += parseInt(cpf[i]) * (10 - i);
    }
    let digito1 = (soma * 10) % 11;
    if (digito1 === 10) digito1 = 0;

    if (digito1 !== parseInt(cpf[9])) {
        console.error("CPF inválido: primeiro dígito verificador incorreto!");
        return false;
    }

    // ----------- Cálculo do segundo dígito verificador -----------
    soma = 0;
    for (let i = 0; i < 10; i++) {
        soma += parseInt(cpf[i]) * (11 - i);
    }
    let digito2 = (soma * 10) % 11;
    if (digito2 === 10) digito2 = 0;

    if (digito2 !== parseInt(cpf[10])) {
        console.error("CPF inválido: segundo dígito verificador incorreto!");
        return false;
    }

    console.log("CPF validado com sucesso!");
    return true;
}


module.exports = {
    random,
    validaCpf
}
