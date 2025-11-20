package TrabalhoPratico4;  

//Classe que representa um telemovel, herda da tecnologia
public class Telemovel extends Tecnologia{
    private String processador;
    private String sistema_operativo;
    private String classe_energetica;
    private String dimensoes_ecra;
    private String memoria_raam;
    private String resolucao_camera;
    private String bateria;
    
    //construtor default
    public Telemovel(){
        this("iPhone 14",999.99, "Apple", "TM001",3001, "A15", "IOS"
        , "A++", "6.1", "6GB", "12MP", "3000mAh");
    }

    //Contrutor principal
    public Telemovel(String _nome, double _preco, String _marca, String _numero_de_serie, int codigo_de_barras, String _processador, 
    String _sistema_operativo, String _classe_energetica, String _dimensoes_ecra, String _memoria_raam, String _resolucao_camera, String _bateria){
        super(_nome, _preco, _marca, _numero_de_serie, codigo_de_barras);
        this.processador = _processador;
        this.sistema_operativo = _sistema_operativo;
        this.classe_energetica = _classe_energetica;
        this.dimensoes_ecra = _dimensoes_ecra;
        this.memoria_raam = _memoria_raam;
        this.resolucao_camera = _resolucao_camera;
        this.bateria = _bateria;
    }

    //Getters e Setters
    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String getClasse_energetica() {
        return classe_energetica;
    }

    public void setClasse_energetica(String classe_energetica) {
        this.classe_energetica = classe_energetica;
    }

    public String getDimensoes_ecra() {
        return dimensoes_ecra;
    }

    public void setDimensoes_ecra(String dimensoes_ecra) {
        this.dimensoes_ecra = dimensoes_ecra;
    }

    public String getMemoria_raam() {
        return memoria_raam;
    }

    public void setMemoria_raam(String memoria_raam) {
        this.memoria_raam = memoria_raam;
    }

    public String getResolucao_camera() {
        return resolucao_camera;
    }

    public void setResolucao_camera(String resolucao_camera) {
        this.resolucao_camera = resolucao_camera;
    }

    public String getBateria() {
        return bateria;
    }

    public void setBateria(String bateria) {
        this.bateria = bateria;
    }

    public String getSistema_operativo() {
        return sistema_operativo;
    }

    public void setSistema_operativo(String sistema_operativo) {
        this.sistema_operativo = sistema_operativo;
    }

    //serve para criar um clone usando o clone da superclasse
    public Telemovel clone(){
        return (Telemovel) super.clone();
    }

    //imrpime os detalhes do telemóvel
    public String toString(){
        return super.toString() + "Processador: " + processador + " | Sistema Operativo: " + sistema_operativo + " | Classe Energética: " + classe_energetica
        + " | Dimensão do Ecrã: " + dimensoes_ecra + " | RAM: " + memoria_raam + " | Resolução de Câmera: " + resolucao_camera + " | Bateria: " + bateria;

    }

    //imprime os detalhes do telemóvel
    public void print(){
        super.print();
        System.out.println("Processador: " + processador + " | Sistema Operativo: " + sistema_operativo + " | Classe Energética: " + classe_energetica
        + " | Dimensão do Ecrã: " + dimensoes_ecra + " | RAM: " + memoria_raam + " | Resolução de Câmera: " + resolucao_camera + " | Bateria: " + bateria);
    }
    
}