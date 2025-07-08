
//task04.js

const prompt = require('prompt-sync')();

console.log("Menu:");
console.log("1 - Dizer Olá");
console.log("2 - Mostrar data atual");
console.log("3 - Sair");

let opcao = prompt("Escolha uma opção (1, 2 ou 3): ");

switch (opcao) {
  case '1':
    console.log("Olá! Como você está?");
    break;
  case '2':
    let data = new Date();
    console.log("Data atual: " + data.toLocaleString());
    break;
  case '3':
    console.log("Saindo do programa...");
    break;
  default:
    console.log("Opção inválida. Tente novamente.");
    break;
}