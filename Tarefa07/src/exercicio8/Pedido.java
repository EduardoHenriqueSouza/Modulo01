package exercicio8;

import java.math.BigDecimal;

public class Pedido {
    private final String cepDestino;
    private final BigDecimal valor;
    private CalculadoraFrete estrategiaFrete;

    public Pedido(String cepDestino, BigDecimal valor, CalculadoraFrete estrategiaFrete) {
        this.cepDestino = cepDestino;
        this.valor = valor;
        this.estrategiaFrete = estrategiaFrete;
    }

    public String getCepDestino() {
        return cepDestino;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setEstrategiaFrete(CalculadoraFrete estrategiaFrete) {
        this.estrategiaFrete = estrategiaFrete;
    }

    public BigDecimal calcularFrete() throws CepInvalidoException {
        if (cepDestino == null || cepDestino.length() != 8) {
            throw new CepInvalidoException("CEP inválido: " + cepDestino);
        }
        return estrategiaFrete.calcular(this);
    }
}
