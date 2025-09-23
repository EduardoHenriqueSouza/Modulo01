package exercicio5;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class MainEx5 {
    public static void main(String[] args) {
        List<FormaPagamento> formas = Arrays.asList(
                new CartaoCredito("1234567890123456"),
                new Boleto("12345678901234567890123456789012345678901234567"),
                new Pix("email@teste.com")
        );

        for (FormaPagamento f : formas) {
            try {
                f.processarPagamento(new BigDecimal("250.00"));
            } catch (PagamentoInvalidoException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }
}
