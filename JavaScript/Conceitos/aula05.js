/*var numeros = [1,2,3,4,5,6,7,8,9];

function filtrar_pares(n) {
    return n % 2 === 0;
}

//console.log(filtrar_pares(10));
//console.log(filtrar_pares(5));


function filtrar_impares(n) {
    return n % 2 !== 0;
}

function filtrar_multiplos_5(n) {
    return n % 5 === 0;
}

var ret = numeros.filter(filtrar_pares);
console.log(ret);

ret = numeros.filter(filtrar_impares);
console.log(ret);

ret = numeros.filter(filtrar_multiplos_5);
console.log(ret);


var precos = [4.66,3.78,9.78,1.34,5.32];

var soma = 0;

for(var i = 0; i < precos.length; i++) {
    soma = soma + precos[i];
}

console.log("For --> ",soma);

soma = 0;

precos.forEach(function(valor) {
    soma += valor;
});

console.log("ForEach --> ",soma);

function somar(anterior, atual) {
    return anterior + atual;
}

var ret = precos.reduce(somar);
console.log(ret);

function adicionar_taxa(valor) {
    return valor + 5
}

var ret = precos.map(adicionar_taxa).reduce(somar);

console.log(ret);
*/

function calcular_idade(ano_nascimento) {
    const data = new Date();

    const idade = data.getFullYear() - ano_nascimento;

    return idade;
}

let idade = calcular_idade(2000);
console.log(`idade é: ${idade}`);

console.log(calcular_idade(2000));





































