package TrabalhoPratico3;

public class Motor {
    private String tipo;
    private double cilindrada;

    public Motor(String _tipo, double _cilindrada){
        this.tipo = _tipo;
        this.cilindrada = _cilindrada;
    }

    public String getTipo(){
        return tipo;
    }

    public double getCilindrada(){
        return cilindrada;
    }

    public String toString(){
        return "Motor: " + tipo + " (" + cilindrada + "L)"; 
    }
}
