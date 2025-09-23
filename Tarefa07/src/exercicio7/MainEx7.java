package exercicio7;

public class MainEx7 {
    public static void main(String[] args) {
        try {
            InMemoryRepository<Produto, Integer> repoProdutos = new InMemoryRepository<>();
            repoProdutos.salvar(new Produto(1, "Notebook"));
            repoProdutos.salvar(new Produto(2, "Smartphone"));

            System.out.println("Produtos: " + repoProdutos.listarTodos());
            System.out.println("Buscar Produto ID 1: " + repoProdutos.buscarPorId(1).orElse(null));

            repoProdutos.remover(2);
            System.out.println("Produtos após remoção: " + repoProdutos.listarTodos());

            // Forçando erro
            repoProdutos.remover(99);
        } catch (EntidadeNaoEncontradaException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        InMemoryRepository<Funcionario, String> repoFunc = new InMemoryRepository<>();
        repoFunc.salvar(new Funcionario("12345678900", "João"));
        repoFunc.salvar(new Funcionario("98765432100", "Maria"));

        System.out.println("Funcionários: " + repoFunc.listarTodos());
    }
}
