package Exercicio03;

public class Livros {

    private String titulo;
    private String autor;
    private int nmrPag;

    public void alterarAtributos(){

    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNmrPag() {
        return nmrPag;
    }

    public void setNmrPag(int nmrPag) {
        this.nmrPag = nmrPag;
    }
    public void livro(){
        this.autor = "Daniel";
        this.nmrPag = 357;
        this.titulo = "Daniel de botas";
        System.out.println("Livro: " +this.titulo + " " +this.autor + " " +this.nmrPag);
    }
}
