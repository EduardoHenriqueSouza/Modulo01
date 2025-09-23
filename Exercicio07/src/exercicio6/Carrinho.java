package exercicio6;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Carrinho {
    private final List<ItemCarrinho> itens;

    public Carrinho(List<ItemCarrinho> itens) {
        this.itens = Collections.unmodifiableList(new ArrayList<>(itens));
    }

    public List<ItemCarrinho> getItens() {
        return itens;
    }

    public Carrinho adicionar(ItemCarrinho item) {
        List<ItemCarrinho> novaLista = new ArrayList<>(itens);
        novaLista.add(item);
        return new Carrinho(novaLista);
    }

    public Carrinho remover(ItemCarrinho item) {
        List<ItemCarrinho> novaLista = new ArrayList<>(itens);
        novaLista.remove(item);
        return new Carrinho(novaLista);
    }

    public Dinheiro calcularTotal() {
        BigDecimal soma = BigDecimal.ZERO;
        Moeda moeda = null;

        for (ItemCarrinho item : itens) {
            if (moeda == null) {
                moeda = item.getTotal().getMoeda();
            }
            soma = soma.add(item.getTotal().getValor());
        }

        return new Dinheiro(soma, moeda);
    }

    public Carrinho aplicarCupom(double porcentagem) {
        if (porcentagem < 0 || porcentagem > 30) {
            throw new IllegalArgumentException("Cupom máximo permitido é 30%");
        }

        Dinheiro total = calcularTotal();
        BigDecimal desconto = total.getValor()
                .multiply(BigDecimal.valueOf(porcentagem))
                .divide(BigDecimal.valueOf(100), RoundingMode.HALF_EVEN);

        Dinheiro novoTotal = new Dinheiro(total.getValor().subtract(desconto), total.getMoeda());

        System.out.println("Total com cupom de " + porcentagem + "%: " + novoTotal);
        return this; // Mantém carrinho imutável, apenas mostra novo valor
    }
}
