
//task08.js

const prompt = require('prompt-sync')();

let valor1 = parseFloat(prompt("Digite o primeiro valor: "));
let valor2 = parseFloat(prompt("Digite o segundo valor (diferente do primeiro): "));

if (isNaN(valor1) || isNaN(valor2)) {
  console.log("Entrada inválida. Digite números válidos.");
} else if (valor1 === valor2) {
  console.log("Os valores não podem ser iguais.");
} else {
  if (valor1 < valor2) {
    console.log(`Ordem crescente: ${valor1}, ${valor2}`);
  } else {
    console.log(`Ordem crescente: ${valor2}, ${valor1}`);
  }
}