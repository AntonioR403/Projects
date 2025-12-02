package TrabalhoPratico6.Ex2;

//Classe que representa um Teclado, herda da Tecnologia
public class Teclado extends Tecnologia {
    private String conectividade;
    private String RGB;
    private String layout;

    //Construtor default
    public Teclado(){
        this("Teclado TUF Gaming", 59.99, "Asus", "DD77P98", 5001, "USB", "Sim", "Layout PT- pt");
    }

    //Construtor principal
    public Teclado(String _nome, double _preco, String _marca, String _numero_de_serie, int _codigo_de_barras, String _conectividade, String _RGB,
    String _layout){
        super(_nome, _preco, _marca, _numero_de_serie, _codigo_de_barras);
        this.conectividade = _conectividade;
        this.RGB = _RGB;
        this.layout = _layout;
    }

    //Getters e Setters
    public String getConectividade() {
        return conectividade;
    }

    public void setConectividade(String conectividade) {
        this.conectividade = conectividade;
    }

    public String getRGB() {
        return RGB;
    }

    public void setRGB(String RGB) {
        this.RGB = RGB;
    }

    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    //Clone() é utilizada para realizar uma cópia
    public Teclado clone(){
        return (Teclado) super.clone();
    }
    
    //imprime os detalhes do teclado
    public void print(){
        super.print();
        System.out.println("Conectividade: " + conectividade + " | RGB: " + RGB + " | Layout: " + layout);
    }
}