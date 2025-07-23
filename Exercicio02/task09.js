function paresParaObjeto(pares) {
  const obj = {};
  for (let i = 0; i < pares.length; i++) {
    const [chave, valor] = pares[i];
    obj[chave] = valor;
  }
  return obj;
}

function objetoParaPares(obj) {
  const pares = [];
  for (let chave in obj) {
    if (obj.hasOwnProperty(chave)) {
      pares.push([chave, obj[chave]]);
    }
  }
  return pares;
}

const pares = [['nome', 'Maria'], ['idade', 30], ['cidade', 'São Paulo']];
const obj = paresParaObjeto(pares);
console.log(obj);
// { nome: 'Maria', idade: 30, cidade: 'São Paulo' }

const arrayPares = objetoParaPares(obj);
console.log(arrayPares);
// [['nome', 'Maria'], ['idade', 30], ['cidade', 'São Paulo']]