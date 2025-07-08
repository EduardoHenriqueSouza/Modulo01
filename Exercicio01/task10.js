
//task10.js

const prompt = require('prompt-sync')();

let numero = parseInt(prompt("Digite um número inteiro: "));

if (isNaN(numero)) {
  console.log("Entrada inválida. Por favor, digite um número inteiro.");
} else {
  for (let i = 0; i < 10; i++) {
    console.log(numero);
  }
}