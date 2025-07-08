function debounce(fn, delay) {
  let timerId;

  return function (...args) {
    clearTimeout(timerId); // Cancela a execução anterior agendada
    timerId = setTimeout(() => {
      fn.apply(this, args); // Executa a função com o contexto e argumentos corretos
    }, delay);
  };
}

function aoDigitar() {
  console.log("Função executada após pausa na digitação!");
}

const aoDigitarDebounce = debounce(aoDigitar, 1000);

// Simulando digitação rápida
aoDigitarDebounce(); // chamada 1
aoDigitarDebounce(); // chamada 2
aoDigitarDebounce(); // chamada 3
// Somente a última será executada, 1 segundo após a última chamada