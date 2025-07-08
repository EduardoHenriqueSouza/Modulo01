const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

const numeroSecreto = Math.floor(Math.random() * 100) + 1;
let tentativas = 0;

function perguntar() {
  rl.question('Adivinhe o número (1 a 100): ', (resposta) => {
    const palpite = parseInt(resposta, 10);
    tentativas++;

    if (isNaN(palpite) || palpite < 1 || palpite > 100) {
      console.log('Digite um número válido entre 1 e 100.');
      perguntar();
      return;
    }

    if (palpite === numeroSecreto) {
      console.log(`Parabéns! Você acertou em ${tentativas} tentativas.`);
      rl.close();
    } else if (palpite < numeroSecreto) {
      console.log('Mais alto!');
      perguntar();
    } else {
      console.log('Mais baixo!');
      perguntar();
    }
  });
}

perguntar();