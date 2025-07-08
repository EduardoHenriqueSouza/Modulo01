function palavrasUnicas(frase) {
  const palavras = frase.split(" ");
  const unicas = [];

  for (let i = 0; i < palavras.length; i++) {
    let contador = 0;

    for (let j = 0; j < palavras.length; j++) {
      if (palavras[i] === palavras[j]) {
        contador++;
      }
    }

    // Se a palavra aparece apenas uma vez e ainda não está no array de únicas
    if (contador === 1) {
      unicas.push(palavras[i]);
    }
  }

  return unicas;
}

const resultado = palavrasUnicas("olá olá mundo mundo teste exemplo mundo");
console.log(resultado)