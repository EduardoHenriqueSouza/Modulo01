
//task05.js

const prompt = require('prompt-sync')();

let peso = parseFloat(prompt("Digite seu peso em kg: "));
let altura = parseFloat(prompt("Digite sua altura em metros: "));

if (isNaN(peso) || peso <= 0 || isNaN(altura) || altura <= 0) {
  console.log("Entrada inválida. Por favor, insira valores numéricos positivos.");
} else {
  let imc = peso / (altura * altura);
  console.log(`Seu IMC é: ${imc.toFixed(2)}`);

  if (imc < 18.5) {
    console.log("Categoria: Baixo peso");
  } else if (imc < 25) {
    console.log("Categoria: Peso normal");
  } else if (imc < 30) {
    console.log("Categoria: Sobrepeso");
  } else {
    console.log("Categoria: Obesidade");
  }
}