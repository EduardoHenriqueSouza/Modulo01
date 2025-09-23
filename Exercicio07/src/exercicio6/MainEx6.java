package exercicio6;

import java.math.BigDecimal;
import java.util.Collections;

public class MainEx6 {
    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook", new Dinheiro(new BigDecimal("3500.00"), Moeda.BRL));
        Produto p2 = new Produto("Mouse", new Dinheiro(new BigDecimal("150.00"), Moeda.BRL));

        Carrinho carrinho = new Carrinho(Collections.emptyList());

        carrinho = carrinho.adicionar(new ItemCarrinho(p1, 1));
        carrinho = carrinho.adicionar(new ItemCarrinho(p2, 2));

        System.out.println("Itens no carrinho:");
        for (ItemCarrinho item : carrinho.getItens()) {
            System.out.println(item.getProduto().getNome() + " x" + item.getQuantidade() +
                    " = " + item.getTotal());
        }

        System.out.println("Total: " + carrinho.calcularTotal());

        carrinho.aplicarCupom(20); // Teste cupom válido
        // carrinho.aplicarCupom(50); // Teste cupom inválido
    }
}
