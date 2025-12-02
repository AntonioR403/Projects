package TrabalhoPratico6.Ex2;

public abstract class Usar extends Tecnologia{
    
    public Usar(String _nome, double _preco, String _marca, String _numero_de_serie, int _codigo_de_barras){
        super(_nome, _preco, _marca, _numero_de_serie, _codigo_de_barras);
    }
    
    public abstract boolean prontoParaUsar();

    public abstract void podeUsar();
}
