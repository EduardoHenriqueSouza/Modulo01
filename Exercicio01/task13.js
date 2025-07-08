
//task13.js

const prompt = require('prompt-sync')();

let soma = 0;
let contador = 0;

while (true) {
  let entrada = parseFloat(prompt("Digite um número decimal (0 para sair): "));
  
  if (isNaN(entrada)) {
    console.log("Entrada inválida, tente novamente.");
    continue;
  }
  
  if (entrada === 0) {
    break;
  }
  
  soma += entrada;
  contador++;
}

if (contador === 0) {
  console.log("Nenhum número válido foi digitado para calcular a média.");
} else {
  let media = soma / contador;
  console.log(`A média dos números digitados é: ${media.toFixed(2)}`);
}