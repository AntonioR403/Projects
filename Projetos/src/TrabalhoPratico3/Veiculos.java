package TrabalhoPratico3;

//classe base (superclasse) que representa um veiculo genético  
public class Veiculos {
    //Atributo comuns a todos os veículos
    int anoFabrico;
    String marca;
    String modelo;
    float preco;
    String combustivel;

    //construtor que incializa todos os atributos
    public Veiculos(int _anoFabrico, String _marca, String _modelo, float _preco, String _combustivel){
        this.anoFabrico = _anoFabrico;
        this.marca = _marca;
        this.modelo = _modelo;
        this.preco = _preco;
        this.combustivel = _combustivel;
    }

    //métodos de acesso
    public int getAnofabrico(){
        return anoFabrico;
    }

    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public float getPreco(){
        return preco;
    }

    public String getCombustivel(){
        return combustivel;
    }
    
}
