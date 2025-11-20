package TrabalhoPratico4;

//classe que representa um tablet, herda da tecnologia
public class Tablet extends Tecnologia{
    private String processador;
    private String memoria_interna;
    private String caneta;
    private String memoria_raam;
    private String sistema_operativo;
    private String bateria;

    //Construtor default
    public Tablet(){
        this("iPad Pro", 1200.99, "Apple", "TB001", 4001, "M1", "128GB"
        , "Apple Pencil", "8GB", "iPadOS", "7500mAh");
    }

    //Construtor principal
    public Tablet(String _nome, double _preco, String _marca, String _numero_de_serie, int _codigo_de_barras, String _processador, 
    String _memoria_interna,String _caneta, String _memoria_raam, String _sistema_operativo, String _bateria){
        super(_nome, _preco, _marca, _numero_de_serie, _codigo_de_barras);
        this.processador = _processador;
        this.memoria_interna = _memoria_interna;
        this.caneta = _caneta;
        this.memoria_raam = _memoria_raam;
        this.sistema_operativo = _sistema_operativo;
        this.bateria = _bateria;
    }

    //Getters e setters
    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String getMemoria_interna() {
        return memoria_interna;
    }

    public void setMemoria_interna(String memoria_interna) {
        this.memoria_interna = memoria_interna;
    }

    public String getCaneta() {
        return caneta;
    }

    public void setCaneta(String caneta) {
        this.caneta = caneta;
    }

    public String getMemoria_raam() {
        return memoria_raam;
    }

    public void setMemoria_raam(String memoria_raam) {
        this.memoria_raam = memoria_raam;
    }

    public String getSistema_operativo() {
        return sistema_operativo;
    }

    public void setSistema_operativo(String sistema_operativo) {
        this.sistema_operativo = sistema_operativo;
    }

    public String getBateria() {
        return bateria;
    }

    public void setBateria(String bateria) {
        this.bateria = bateria;
    }

    //imprime os detalhe do tablet
    public void print(){
        super.print();
        System.out.println("Processador: " + processador + " | Mémoria Interna: " + memoria_interna + " | Caneta: " + caneta + " | Mémoria RAAM: " + memoria_raam
        + " | Sistema operativo: " + sistema_operativo + " | Bateria: " + bateria);
    }
    
}