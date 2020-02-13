package Exercicio04;

public class Funcionario extends Pessoa {

    private Pessoa pessoa;
    private String numMatricula;

    public Funcionario(String nome, int idade, String cidadeNascimento, Pessoa pessoa, String numMatricula) {
        super(nome, idade, cidadeNascimento);
        this.setPessoa(pessoa);
        this.setNumMatricula(numMatricula);
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public String getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(String numMatricula) {
        this.numMatricula = numMatricula;
    }
}
