package exercicio1;

public class MainEx1 {
    public static void main(String[] args) {
        try {
            Produto p1 = new Produto("Notebook", 3500.00, 10);
            System.out.println(p1);

            p1.setPreco(3200.00);
            p1.setQuantidadeEmEstoque(8);
            System.out.println("Após atualização: " + p1);

            p1.setPreco(-100); // Testando erro
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
