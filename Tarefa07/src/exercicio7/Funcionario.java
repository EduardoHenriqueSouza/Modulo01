package exercicio7;

public class Funcionario implements Identificavel<String> {
    private final String cpf;
    private final String nome;

    public Funcionario(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    @Override
    public String getId() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Funcionario{cpf=" + cpf + ", nome='" + nome + "'}";
    }
}
