
// task03.js

const prompt = require('prompt-sync')();

let nota = parseFloat(prompt("Digite a nota (0 a 10): "));

if (nota < 0 || nota > 10 || isNaN(nota)) {
  console.log("Nota inválida. Digite um valor entre 0 e 10.");
} else if (nota >= 7) {
  console.log("Aprovado");
} else if (nota >= 4) {
  console.log("Recuperação");
} else {
  console.log("Reprovado");
}