
//task11.js

const prompt = require('prompt-sync')();

let soma = 0;

for (let i = 1; i <= 5; i++) {
  let num = parseFloat(prompt(`Digite o número ${i}: `));
  
  if (isNaN(num)) {
    console.log("Entrada inválida, considere 0 para essa entrada.");
    num = 0;
  }
  
  soma += num;
}

console.log(`A soma total dos números é: ${soma}`);