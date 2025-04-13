/*function somar() {
    let soma = 0;
    for(let i = 0; i < arguments.length; i++) {
        soma += arguments[i];
    }
    return soma;
}

console.log(somar(10,20));

function imprime_valores(num1, num2) {
    for(let i in arguments) {
        console.log(arguments[i]);
    }
}

imprime_valores(10,20);


//Arrow Functions
let soma = (num1,num2) => {
    return num1 + num2;
}

console.log(soma(5,2));

let dobrar = valor => valor * 2;

console.log(dobrar(5));

//lammbdas
let numeros = [2,3,4,6,5,8,9];

let rest = numeros.map(function(valor1){
    return valor1 * 2;
});

console.log(rest);

//callbacks
const cursos= [
    'Programação para Leigos',
    'Java',
    'JavaScript',
    'Sql',
    'Angular',
    'Kotlin'
]

function apresentar(curso, indice) {
    console.log(`${indice + 1} - ${curso}`);
}

cursos.forEach(apresentar);
*/

const curso = new Object();

curso.nome = 'Curso de Java';
curso.preco = '300';

console.log(curso);

curso['qtd_alunos'] = 10;

console.log(curso);

console.table(curso);





















































