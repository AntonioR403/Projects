package GestorDeBiblioteca;

public class Livros {
    String titulo;
    String autor;
    String editora;
    int anoDePublicacao = 0;
    int codigoUnico = 0;
    String estado;

    public Livros(String titulo, String autor, String editora, int anoDePublicacao,
     int codigoUnico, String estado){
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.anoDePublicacao = anoDePublicacao;
        this.codigoUnico = codigoUnico;
        this.estado = estado;
    }

    public String gettitulo(){
        return titulo;
    }

    public String getautor(){
        return autor;
    }

    public String geteditora(){
        return editora;
    }

    public int getanoDepublicacao(){
        return anoDePublicacao;
    }

    public int getcodigoUnico(){
        return codigoUnico;
    }

    public String getestado(){
        return estado;
    }

    public void settitulo(String titulo){
        this.titulo = titulo;
    }

    public void setautor(String autor){
        this.autor = autor;
    }

    public void seteditora(String editora){
        this.editora = editora;
    }

    public void setanoDePublicacao(int anoDePublicacao){
        this.anoDePublicacao = anoDePublicacao;
    }

    public void setcodigoUnico(int codigoUnico){
        this.codigoUnico = codigoUnico;
    }

    public void setestado(String estado){
        this.estado = estado;
    }

    public String toString(){
        return String.format("Título: %s Autor: %s Editora: %s Ano de Publicação: %s Codigo Único: %s" +
        " Estado: %s ", titulo, autor, editora, anoDePublicacao, codigoUnico, estado);
    }
}
