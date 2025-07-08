
//task06.js

const prompt = require('prompt-sync')();

let A = parseFloat(prompt("Digite o lado A: "));
let B = parseFloat(prompt("Digite o lado B: "));
let C = parseFloat(prompt("Digite o lado C: "));

if (isNaN(A) || isNaN(B) || isNaN(C) || A <= 0 || B <= 0 || C <= 0) {
  console.log("Entrada inválida. Os lados devem ser números positivos.");
} else if (A < B + C && B < A + C && C < A + B) {

  if (A === B && B === C) {
    console.log("Triângulo Equilátero");
  } else if (A === B || A === C || B === C) {
    console.log("Triângulo Isósceles");
  } else {
    console.log("Triângulo Escaleno");
  }
} else {
  console.log("Os lados não formam um triângulo.");
}