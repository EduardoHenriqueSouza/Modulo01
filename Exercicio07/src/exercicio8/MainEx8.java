package exercicio8;

import java.math.BigDecimal;

public class MainEx8 {
    public static void main(String[] args) {
        try {
            CalculadoraFrete sedex = pedido -> pedido.getValor().multiply(new BigDecimal("0.10"));
            CalculadoraFrete pac = pedido -> pedido.getValor().multiply(new BigDecimal("0.05"));
            CalculadoraFrete retiradaNaLoja = pedido -> BigDecimal.ZERO;

            Pedido pedido = new Pedido("12345678", new BigDecimal("200"), sedex);
            System.out.println("Frete SEDEX: " + pedido.calcularFrete());

            pedido.setEstrategiaFrete(pac);
            System.out.println("Frete PAC: " + pedido.calcularFrete());

            pedido.setEstrategiaFrete(retiradaNaLoja);
            System.out.println("Frete Retirada: " + pedido.calcularFrete());

            CalculadoraFrete promocional = p -> p.getValor().compareTo(new BigDecimal("150")) > 0
                    ? BigDecimal.ZERO
                    : new BigDecimal("20");

            pedido.setEstrategiaFrete(promocional);
            System.out.println("Frete Promocional: " + pedido.calcularFrete());

            Pedido pedidoInvalido = new Pedido("123", new BigDecimal("100"), pac);
            pedidoInvalido.calcularFrete();

        } catch (CepInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
