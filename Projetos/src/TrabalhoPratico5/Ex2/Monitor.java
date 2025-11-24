package TrabalhoPratico5.Ex2;

//Classe que represeta um Monitor, herda da tecnologia
public class Monitor extends Tecnologia{
    private int refresh_rate;
    private String resolucao;
    private String classe_energetica;
    private String interfaces;
    private String formato;
    private String dimensao_do_ecra;

    //Construtor default
    public Monitor(){
        this("Monitor Gaming 27G2ZNE", 172.99, "AOC", "MO78NI77TOR", 6001, 240, "1900x1200"
        , "E", "DisplayPort e HDMI", "formato", "22 Polegadas");
    }

    //Construtor principal
    public Monitor(String _nome, double _preco, String _marca, String _numero_de_serie, int _codigo_de_barras, int _refresh_rate, String _resolucao,
    String _classe_energetica, String _interfaces, String _formato, String _dimensao_de_ecra){
        super(_nome, _preco, _marca, _numero_de_serie, _codigo_de_barras);
        this.refresh_rate = _refresh_rate;
        this.resolucao = _resolucao;
        this.classe_energetica = _classe_energetica;
        this.interfaces = _interfaces;
        this.formato = _formato;
        this.dimensao_do_ecra = _dimensao_de_ecra;
    }

    //Getters e Setters
    public int getRefresh_rate() {
        return refresh_rate;
    }

    public void setRefresh_rate(int refresh_rate) {
        this.refresh_rate = refresh_rate;
    }

    public String getResolucao() {
        return resolucao;
    }

    public void setResolucao(String resolucao) {
        this.resolucao = resolucao;
    }

    public String getClasse_energetica() {
        return classe_energetica;
    }

    public void setClasse_energetica(String classe_energetica) {
        this.classe_energetica = classe_energetica;
    }

    public String getInterfaces() {
        return interfaces;
    }

    public void setInterfaces(String interfaces) {
        this.interfaces = interfaces;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getDimensao_do_ecra() {
        return dimensao_do_ecra;
    }

    public void setDimensao_do_ecra(String dimensao_do_ecra) {
        this.dimensao_do_ecra = dimensao_do_ecra;
    }

    //Clone() é utilizada para realizar uma cópia
    public Monitor clone(){
        return (Monitor) super.clone();
    }
    
    //imprime os detalhes de um monitor
    public void print(){
        super.print();
        System.out.println("Refresh Rate: " + refresh_rate + " | Resolução: " + resolucao + " | Classe Energética: " + classe_energetica +
        " | Interface: " + interfaces + " | Formato: " + formato + " | Dimensão do Ecrã: " + dimensao_do_ecra);
    }
}