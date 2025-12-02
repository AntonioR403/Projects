package TrabalhoPratico6.Ex2;

//Classe que representa um Rato, herda de tecnologia
public class Rato extends Tecnologia{
    private String tecnologia_de_sensor;
    private String resolucao_optica;
    private String conectividade;

    //Classe default
    public Rato() {
        this("Rato Gamer", 49.90, "LogiTech", "M001", 2001, "Óptico", "16000 DPI", "USB");
    }

    //Classe Principal
    public Rato(String _nome, double _preco, String _marca, String _numero_de_serie, int _codigo_de_barras, String _tecnologia_de_sensor, 
    String _resolucao_optica, String _conectividade){
        super(_nome, _preco, _marca, _numero_de_serie, _codigo_de_barras);
        this.tecnologia_de_sensor = _tecnologia_de_sensor;
        this.resolucao_optica = _resolucao_optica;
        this.conectividade = _conectividade;
    }

    //Getters e Setters
    public String getTecnologia_de_sensor() {
        return tecnologia_de_sensor;
    }

    public void setTecnologia_de_sensor(String tecnologia_de_sensor) {
        this.tecnologia_de_sensor = tecnologia_de_sensor;
    }

    public String getResolucao_optica() {
        return resolucao_optica;
    }

    public void setResolucao_optica(String resolucao_optica) {
        this.resolucao_optica = resolucao_optica;
    }

    public String getConectividade() {
        return conectividade;
    }

    public void setConectividade(String conectividade) {
        this.conectividade = conectividade;
    }
    
    //Clone() é utilizada para realizar uma cópia
    public Rato clone(){
        return (Rato) super.clone();
    }

    //imprime os detalhe de um Rato
    public void print(){
        super.print();
        System.out.println("Tecnologia de Sensor: " + tecnologia_de_sensor +
        " | DPI: " + resolucao_optica +
        " | Conectividade: " + conectividade);
    }
}