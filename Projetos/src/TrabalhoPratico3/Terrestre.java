package TrabalhoPratico3;

//Subclasse que representa um veículo terrestre
public class Terrestre extends Veiculos{

    //Atributos específicos de veículos terrestres
    private String pneus;
    private String sistema_de_tracao;
    private Motor motor;

    //Construtor que inicializa os atributos de superclasse e os próprios
    public Terrestre(int _anoFabrico, String _marca, String _modelo, float _preco, String _combustivel, 
        String _pneus, String _sistema_de_tracao, Motor _motor){
        
        //Chamada ao construtor da classe-mãe 
        super(_anoFabrico, _marca, _modelo, _preco, _combustivel);

        this.pneus = _pneus;
        this.sistema_de_tracao = _sistema_de_tracao;
        this.motor = _motor;
    }

    //Getters específicos desta classe
    public String getPneu(){
        return pneus;
    }

    public String getSistema_de_tracao(){
        return sistema_de_tracao;
    }

    public Motor getMotor(){
        return motor;
    }

    //sobrescrita do método toString()
    @Override
    public String toString(){
        return "Ano de Fabrico: " + anoFabrico + " Marca: " + marca + " Modelo: " + modelo + " Preço: " + preco + " Combustivel:_" + combustivel + " Pneus: " + pneus +
            " Sistema de Tração: " + sistema_de_tracao + motor.toString();
    }
}