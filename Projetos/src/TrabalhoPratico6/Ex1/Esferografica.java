package TrabalhoPratico6.Ex1;

public class Esferografica implements MaterialEscrita{

    public String cor = "Preto"; //cor default

    //implementa o método escrita
    @Override
    public void escrita(){
        System.out.println("A escrever com Esferográfica.");
    }

    //implementa o método getCor
    @Override
    public void getCor(){
        System.out.println("A cor da esferográfica é " + cor);
    }
    
}
