package exercicio2;

public class MainEx2 {
    public static void main(String[] args) {
        try {
            ProdutoComDesconto p2 = new ProdutoComDesconto("Smartphone", 2000.00, 5);
            System.out.println("Preço antes do desconto: " + p2.getPreco());

            p2.aplicarDesconto(20);
            System.out.println("Preço após desconto de 20%: " + p2.getPreco());

            p2.aplicarDesconto(70); // Testando erro
        } catch (DescontoInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
