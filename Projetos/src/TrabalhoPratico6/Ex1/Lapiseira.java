package TrabalhoPratico6.Ex1;

public class Lapiseira implements MaterialEscrita{
    
    public String cor = "Gráfite"; //cor default

    //implementa o método escrita
    @Override
    public void escrita(){
        System.out.println("A escrever com a lapiseira.");
    }

    //implementa o método getCor
    @Override
    public void getCor(){
        System.out.println("A cor da esferográfica é " + cor);
    }
}
