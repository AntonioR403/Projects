package TrabalhoPratico8;

public class SensorAmbiental extends Dispositivos{
    private double temperatura;
    private double humidade;

    public SensorAmbiental(String _nome, int _id, boolean _estado, double _watts, double _consumoAcumulado, String _controlRemoto){
        super(_nome, _id, _estado, _watts, _consumoAcumulado, _controlRemoto);
        this.temperatura = 0.0;
        this.humidade = 0.0;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getHumidade() {
        return humidade;
    }

    public void setHumidade(double humidade) {
        this.humidade = humidade;
    }

    public void setDados(double novaTemp, double novaHum){
        this.temperatura = novaTemp;
        this.humidade = novaHum;
    }

    @Override
    public String toString() {
        return super.toString() + 
        " | Temperatura: " + temperatura + "ºC" +
        " | Humidade: " + humidade + "%";
    }
}
