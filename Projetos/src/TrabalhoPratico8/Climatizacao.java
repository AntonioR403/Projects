package TrabalhoPratico8;

public class Climatizacao extends EletrodomesticoInteligente{
    
    private double temperaturaAtual;
    private double temperaturaDesejada;
    private String modo;
    private int velocidadeVentilador;

    public Climatizacao(String _nome, int _id, boolean _estado, double _watts, double _consumoAcumulado, String controloRemoto, String _tipoConexao, 
        String _enderecoIP){
            super(_nome, _id, _estado, _watts, _consumoAcumulado, controloRemoto, _tipoConexao, _enderecoIP, _estado);
            this.temperaturaAtual = 25.0;
            this.temperaturaDesejada = 22.0;
            this.modo = "Auto";
            this.velocidadeVentilador = 3;
        }
    
    //métodos específicos
    public void mudarModo(String novoModo){
        this.modo = novoModo;
        System.out.println(getNome() + " no modo " + novoModo);
    }

    //ajusta temperatura
    public void ajustarTemperatura(double novaTemperatura){
        this.temperaturaDesejada = novaTemperatura;
        System.out.println(getNome() + " ajustada para " + novaTemperatura + "ºC");
    }

    //ajusta a velocidade do ventilador
    public void ajustarVelocidadeVentilador(int novaVelocidade){
        if(novaVelocidade < 1) novaVelocidade = 1;
        if(novaVelocidade > 5) novaVelocidade = 5;
        this.velocidadeVentilador = novaVelocidade;
        System.out.println(getNome() + " ventilador ajustado para velocidade " + novaVelocidade);
    }

    //getters e setters
    public double getTemperaturaAtual() {
        return temperaturaAtual;
    }

    public void setTemperaturaAtual(double temperaturaAtual) {
        this.temperaturaAtual = temperaturaAtual;
    }

    public double getTemperaturaDesejada() {
        return temperaturaDesejada;
    }

    public void setTemperaturaDesejada(double temperaturaDesejada) {
        this.temperaturaDesejada = temperaturaDesejada;
    }

    public String getModo() {
        return modo;
    }

    public void setModo(String modo) {
        this.modo = modo;
    }

    public int getVelocidadeVentilador() {
        return velocidadeVentilador;
    }

    public void setVelocidadeVentilador(int velocidadeVentilador) {
        this.velocidadeVentilador = velocidadeVentilador;
    }

    @Override
    public String toString(){
        return super.toString() + 
        " | Temperatura Atual: " + temperaturaAtual +
        " | Temperatura Desejada: " + temperaturaDesejada +
        " | Modo: " + modo +
        " | Velocidade do Ventilador: " + velocidadeVentilador;
    }
}
