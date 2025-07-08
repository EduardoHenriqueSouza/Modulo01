
//task12.js

const prompt = require('prompt-sync')();

let numero = parseInt(prompt("Digite um número para ver a tabuada: "));

if (isNaN(numero)) {
  console.log("Entrada inválida. Digite um número válido.");
} else {
  console.log(`Tabuada do ${numero}:`);
  for (let i = 1; i <= 10; i++) {
    console.log(`${numero} x ${i} = ${numero * i}`);
  }
}