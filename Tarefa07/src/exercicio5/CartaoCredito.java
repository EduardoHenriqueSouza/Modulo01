package exercicio5;

import java.math.BigDecimal;

public class CartaoCredito extends FormaPagamento {
    private String numero;

    public CartaoCredito(String numero) {
        this.numero = numero;
    }

    @Override
    public void validarPagamento() throws PagamentoInvalidoException {
        if (numero == null || !numero.matches("\\d{16}")) {
            throw new PagamentoInvalidoException("Número de cartão inválido!");
        }
    }

    @Override
    public void processarPagamento(BigDecimal valor) throws PagamentoInvalidoException {
        validarPagamento();
        System.out.println("Pagamento de R$ " + valor + " realizado com Cartão de Crédito.");
    }
}
