
//task14.js

const prompt = require('prompt-sync')();

let numero = parseInt(prompt("Digite um número inteiro não negativo para calcular o fatorial: "));

if (isNaN(numero) || numero < 0) {
  console.log("Entrada inválida. Digite um número inteiro não negativo.");
} else {
  let fatorial = 1;
  for (let i = 2; i <= numero; i++) {
    fatorial *= i;
  }
  console.log(`O fatorial de ${numero} é: ${fatorial}`);
}