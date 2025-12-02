package TrabalhoPratico6.Ex2;

//superclasse usado por todos os aparelhos
public class Tecnologia implements Cloneable{
    public String nome;
    private double preco;
    protected String marca;
    private String numero_de_serie;
    private int codigo_de_barras;

    public static int contadorProdutos = 0;

    //Construtor padrão
    public Tecnologia(){
        this("Portátil", 500.99, "Asus", "000000000", 00000000);
    }

    //Construtor principal
    public Tecnologia(String _nome, double _preco, String _marca, String _numero_de_serie, int _codigo_de_barras){
        this.nome = _nome;
        this.preco = _preco;
        this.marca = _marca;
        this.numero_de_serie = _numero_de_serie;
        this.codigo_de_barras = _codigo_de_barras;
        contadorProdutos++;
    }

    //Getters e Setters 
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNumero_de_serie() {
        return numero_de_serie;
    }

    public void setNumero_de_serie(String numero_de_serie) {
        this.numero_de_serie = numero_de_serie;
    }

    public int getCodigo_de_barras() {
        return codigo_de_barras;
    }

    public void setCodigo_de_barras(int codigo_de_barras) {
        this.codigo_de_barras = codigo_de_barras;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    //imprime os detalhes do aparelho
    public String toString(){
        return "Nome: " + nome
        + " Preço: " + preco
        + " Marca: " + marca
        + " Número de Série: " + numero_de_serie
        + " Código de barras: " + codigo_de_barras;
    }

    //imprime os detalhes do aparelho
    public void print(){
        System.out.println("Produto: " + nome + " | Marca: " + marca + " | Preço: " + preco + "€" +
        " | Nº Série: " + numero_de_serie + " | Código de Barras: " + codigo_de_barras);
    }

    //equals compara nome e código de barras para encontrar aparelhos iguais
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null || getClass() != obj.getClass()){
            return false;
        }

        Tecnologia t = (Tecnologia) obj;
        return this.nome.equalsIgnoreCase(t.getNome()) && this.codigo_de_barras == t.codigo_de_barras;

    }

    //clone serve para criar uma cópia
    public Tecnologia clone(){
        try{
            return (Tecnologia) super.clone();
        }catch(CloneNotSupportedException e){
            return null;
        }
    }
}