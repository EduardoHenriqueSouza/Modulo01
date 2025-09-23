package exercicio5;

import java.math.BigDecimal;

public class Pix extends FormaPagamento {
    private String chave;

    public Pix(String chave) {
        this.chave = chave;
    }

    @Override
    public void validarPagamento() throws PagamentoInvalidoException {
        if (chave == null || chave.trim().isEmpty()) {
            throw new PagamentoInvalidoException("Chave Pix inválida!");
        }
    }

    @Override
    public void processarPagamento(BigDecimal valor) throws PagamentoInvalidoException {
        validarPagamento();
        System.out.println("Pagamento de R$ " + valor + " realizado via Pix.");
    }
}
