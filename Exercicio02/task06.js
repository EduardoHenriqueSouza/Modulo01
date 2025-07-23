function memoize(fn) {
  const cache = new Map();

  return function (...args) {
    const chave = JSON.stringify(args); 

    if (cache.has(chave)) {
      return cache.get(chave); 
    }

    const resultado = fn.apply(this, args);
    cache.set(chave, resultado);
    return resultado;
  };
}

const fatorial = memoize(function(n) {
  if (n < 0) throw new Error("Negativo não permitido");
  if (n === 0) return 1;
  return n * fatorial(n - 1);
});

console.log(fatorial(5)); // Calcula e guarda no cache
console.log(fatorial(5)); // Recupera do cache
console.log(fatorial(6)); // Usa o cache de fatorial(5)