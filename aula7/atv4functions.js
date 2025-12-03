/*
Faça uma função na biblioteca de vocês que valida
email e telefone, e reescreva o programa de agenda
cadastrando nome, email e telefone validados
*/

function validarEmail(email) {
    // Regex simples e funcional
    const regexEmail = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    let emailvalidar = regexEmail.test(email);
    if(emailvalidar){
        return true
    }else{
        return false
    }
}

function validarTelefone(telefone) {
    // Remove tudo que não for número
    const numeros = telefone.replace(/\D/g, "");

    // Deve ter 10 (fixo) ou 11 dígitos (celular)
    if (numeros.length !== 10 && numeros.length !== 11) {
        return false;
    }

    const ddd = numeros.slice(0, 2);
    const numero = numeros.slice(2);

    // DDD brasileiro varia de 11 a 99 (00 não existe)
    const dddValido = /^[1-9][0-9]$/.test(ddd);
    if (!dddValido) return false;

    // Regra para celular: 11 dígitos e começa com 9
    if (numeros.length === 11) {
        if (!numero.startsWith("9")) return false;
        if (!/^[0-9]{9}$/.test(numero)) return false;
        return true;
    }

    // Regra para fixo: 10 dígitos e começa com 2 a 5
    if (numeros.length === 10) {
        if (!/^[2-5][0-9]{7}$/.test(numero)) return false;
        return true;
    }
    return false;
}

module.exports = {
    validarEmail,
    validarTelefone
}