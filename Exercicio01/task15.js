
//task15.js

let fib = [0, 1];

for (let i = 2; i < 10; i++) {
  fib[i] = fib[i - 1] + fib[i - 2];
}

console.log("Primeiros 10 números da sequência de Fibonacci:");
for (let i = 0; i < 10; i++) {
  console.log(fib[i]);
}