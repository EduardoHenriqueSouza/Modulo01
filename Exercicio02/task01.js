function ehDataValida(dia, mes, ano) {
  // Verifica se os valores são números inteiros válidos
  if (
    typeof dia !== 'number' || typeof mes !== 'number' || typeof ano !== 'number' ||
    !Number.isInteger(dia) || !Number.isInteger(mes) || !Number.isInteger(ano)
  ) {
    return false;
  }

  if (mes < 1 || mes > 12) return false;

  if (ano < 1) return false;

  const diasPorMes = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31];

  if (mes === 2 && ((ano % 4 === 0 && ano % 100 !== 0) || (ano % 400 === 0))) {
    diasPorMes[1] = 29; // fevereiro com 29 dias
  }

  return dia >= 1 && dia <= diasPorMes[mes - 1];
}

console.log(ehDataValida(29, 2, 2024)); // true (ano bissexto)
console.log(ehDataValida(31, 4, 2023)); // false (abril tem 30 dias)
console.log(ehDataValida(15, 13, 2023)); // false (mês inválido)
console.log(ehDataValida(0, 12, 2023)); // false (dia inválido)
console.log(ehDataValida(39, 12, 2023)); // true