
//task07.js

const prompt = require('prompt-sync')();

let quantidade = parseInt(prompt("Digite a quantidade de maçãs compradas: "));

if (isNaN(quantidade) || quantidade < 0) {
  console.log("Quantidade inválida.");
} else {
  let preco;
  if (quantidade < 12) {
    preco = 0.30;
  } else {
    preco = 0.25;
  }

  let total = quantidade * preco;
  console.log(`O valor total da compra é R$ ${total.toFixed(2)}`);
}