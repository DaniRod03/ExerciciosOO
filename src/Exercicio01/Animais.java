package Exercicio01;

public class Animais {

    private String nome;
    private String idade;
    private String tipo;

    public Animais(String nome, String idade, String tipo) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setTipo(tipo);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void Cachorros(){
        System.out.println("Cachorros que eu tenho: "+this.nome + ", " +this.idade + " anos, " + this.tipo);
    }
    public void Gatos(){
        System.out.println("Gatos que eu tenho: " +this.nome + ", " +this.idade + " anos, " +this.tipo);
    }
}
