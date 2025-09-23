package exercicio5;

import java.math.BigDecimal;

public class Boleto extends FormaPagamento {
    private String codigo;

    public Boleto(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public void validarPagamento() throws PagamentoInvalidoException {
        if (codigo == null || !codigo.matches("\\d{47}")) {
            throw new PagamentoInvalidoException("Código de boleto inválido!");
        }
    }

    @Override
    public void processarPagamento(BigDecimal valor) throws PagamentoInvalidoException {
        validarPagamento();
        System.out.println("Pagamento de R$ " + valor + " realizado via Boleto.");
    }
}
