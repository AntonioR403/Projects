package TrabalhoPratico3;

//Subclasses que representam um veículo aquático
public class Aquatico extends Veiculos{

    //Atributos específicos dos veículos aquáticos
    private String sistema_de_navegacao;
    private String bomba_de_porao;
    private String ancora;
    private String metodo_de_deslocamento;
    
    //Construtor da classe que inicializa atributos herdados e específicos
    public Aquatico(int _anoFabrico, String _marca, String _modelo, float _preco, String _combustivel, String _sistema_de_navegacao, String _bomba_de_porao, String _ancora, String _metodo_de_deslocamento){
        super(_anoFabrico, _marca, _modelo, _preco, _combustivel);

        this.sistema_de_navegacao = _sistema_de_navegacao;
        this.bomba_de_porao = _bomba_de_porao;
        this.ancora = _ancora;
        this.metodo_de_deslocamento = _metodo_de_deslocamento;
    }

    //Getters específicos desta classe
    public String getSistem_de_navegacao(){
        return sistema_de_navegacao;
    }

    public String getBomba_de_porao(){
        return bomba_de_porao;
    }

    public String getAncora(){
        return ancora;
    }

    public String getMetodo_de_deslocamento(){
        return metodo_de_deslocamento;
    }

    //Sobrescrita do Método toString()
    @Override
    public String toString(){
        return "Ano de Fabrico: " + anoFabrico + " Marca: " + marca + " Modelo: " + modelo + " Preço: " + preco + " Combustivel: " + combustivel +
            " Sistema de Navegação: " + sistema_de_navegacao + " Bomba de Porão: " + bomba_de_porao + " Ancora: " + ancora + " Método de Deslocamento: " +
            metodo_de_deslocamento;
    }

}
