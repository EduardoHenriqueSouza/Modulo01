function fatorial(n) {
  if (n < 0) {
    throw new Error("Fatorial não definido para números negativos.");
  } else if (n === 0) {
    return 1;
  } else {
    return n * fatorial(n - 1);
  }
}

console.log(fatorial(5)); // 120
console.log(fatorial(0)); // 1
console.log(fatorial(1)); // 1
console.log(fatorial(3)); // 6

try {
  console.log(fatorial(-2));
} catch (e) {
  console.error(e.message); // "Fatorial não definido para números negativos."
}