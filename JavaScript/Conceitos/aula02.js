var alunos = new Array("Anderson","Aliny","Juliana","Ilda");
console.log(alunos);
console.log("tamanho: ", alunos.length);

var numeros = [4,9,7,3,2,6,1,8];
console.log(numeros.sort());

var numerofloat = [12.2, 10.3, 5.60, 2.30, 7.80, 9.50];
console.log(numerofloat.sort());

numerofloat.sort(function(a,b) {return a - b;});
console.log(numerofloat);

for (var i = 0; i<=10;i++){
    console.log(i);
}