package TrabalhoPratico6.Ex1;

public class Principal {
    public static void main(String[] args) {
        //Criar instãncias de cada class
        Esferografica fero = new Esferografica();
        Lapiseira lapi = new Lapiseira();
        Marcador cador = new Marcador();

        //Chama os métodos da Esferografica
        fero.escrita();
        fero.getCor();

        //Chama os métodos da Lapiseira
        lapi.escrita();
        lapi.getCor();

        //Chama os métodos do Marcador
        cador.escrita();
        cador.getCor();

    }

}
