package TrabalhoPratico8;

public class Dispositivos{
    //Atributos
    protected String nome;
    private int id;
    private boolean estado;
    private double watts;
    private double consumoAcumulado;
    private String controloRemoto;

    //Construtor da classe
    public Dispositivos(String _nome, int _id, boolean _estado, double _watts, double _consumoAcumulado, String _controloRemoto){
        this.nome = _nome;
        this.id = _id;
        this.estado = _estado;
        this.watts = _watts;
        this.consumoAcumulado = _consumoAcumulado;
        this.controloRemoto = _controloRemoto;
    }

    //método para ligar dispositivo
    public void ligar(){
        this.estado = true;
    }

    //método para desligar dispositivo 
    public void desligar(){
        this.estado = false;
    }

    //calcular consumo acumulado e atualizar
    public double consumoAcumuladoDispositivo(int horas, int dias){
        double consumo = (watts * horas * dias) / 1000;
        this.consumoAcumulado += consumo;
        return consumo;
    } 

    //Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public double getConsumoAcumulado() {
        return consumoAcumulado;
    }

    public void setConsumoAcumulado(double consumoAcumulado) {
        this.consumoAcumulado = consumoAcumulado;
    }

    public String getControloRemoto() {
        return controloRemoto;
    }

    public void setControloRemoto(String controloRemoto) {
        this.controloRemoto = controloRemoto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getWatts() {
        return watts;
    }

    public void setWatts(double watts) {
        this.watts = watts;
    }

    @Override
    public String toString(){
        return  nome + " | Estado: " + (estado ? "Ligado" : "Desligado");
    }
}
