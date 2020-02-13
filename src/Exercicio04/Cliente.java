package Exercicio04;

public class Cliente extends Pessoa {
    private Pessoa pessoa;
    private String cpf;

    public Cliente(String nome, int idade, String cidadeNascimento, Pessoa pessoa, String cpf) {
        super(nome, idade, cidadeNascimento);
        this.pessoa = pessoa;
        this.cpf = cpf;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
