package exercicio8;

import java.math.BigDecimal;

public class MainEx8 {
    public static void main(String[] args) {
        try {
            // Estratégias fixas
            CalculadoraFrete sedex = pedido -> pedido.getValor().multiply(new BigDecimal("0.10"));
            CalculadoraFrete pac = pedido -> pedido.getValor().multiply(new BigDecimal("0.05"));
            CalculadoraFrete retiradaNaLoja = pedido -> BigDecimal.ZERO;

            // Pedido inicial com SEDEX
            Pedido pedido = new Pedido("12345678", new BigDecimal("200"), sedex);
            System.out.println("Frete SEDEX: " + pedido.calcularFrete());

            // Troca para PAC
            pedido.setEstrategiaFrete(pac);
            System.out.println("Frete PAC: " + pedido.calcularFrete());

            // Troca para retirada
            pedido.setEstrategiaFrete(retiradaNaLoja);
            System.out.println("Frete Retirada: " + pedido.calcularFrete());

            // Estratégia promocional via lambda (frete grátis acima de 150)
            CalculadoraFrete promocional = p -> p.getValor().compareTo(new BigDecimal("150")) > 0
                    ? BigDecimal.ZERO
                    : new BigDecimal("20");

            pedido.setEstrategiaFrete(promocional);
            System.out.println("Frete Promocional: " + pedido.calcularFrete());

            // Forçando erro de CEP inválido
            Pedido pedidoInvalido = new Pedido("123", new BigDecimal("100"), pac);
            pedidoInvalido.calcularFrete();

        } catch (CepInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
