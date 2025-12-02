package TrabalhoPratico6.Ex1;

public class Marcador implements MaterialEscrita {

    public String cor = "Amarelo Neon";  // cor default

    //implementa o método escrita 
    @Override
    public void escrita(){
        System.out.println("Use o marcador para sublinhar.");
    }

    //implementa o método getCor
    @Override
    public void getCor(){
        System.out.println("A cor do marcador é " + cor);
    }
    
}
