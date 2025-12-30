package TrabalhoPratico8;

public class IluminacaoAdaptativa extends Dispositivos{
    public int intensidade;
    public int temperaturaCor;
    public boolean modoAuto;

    public IluminacaoAdaptativa(String _nome, int _id, boolean _estado, double _watts, double _consumoAcumulado, String _controloRemoto){
        super(_nome, _id, _estado, _watts, _consumoAcumulado, _controloRemoto);
        this.intensidade = 50;
        this.temperaturaCor = 4000; 
        this.modoAuto = true;
    }

    public int getIntensidade() {
        return intensidade;
    }

    public void setIntensidade(int intensidade) {
        this.intensidade = intensidade;
    }

    public int getTemperaturaCor() {
        return temperaturaCor;
    }

    public void setTemperaturaCor(int temperaturaCor) {
        this.temperaturaCor = temperaturaCor;
    }

    public boolean isModoAuto() {
        return modoAuto;
    }

    public void setModoAuto(boolean modoAuto) {
        this.modoAuto = modoAuto;
    }

    public String toString(){
        return super.toString() + 
        " | Intensidade: " + intensidade +
        " | Temperatura: " + temperaturaCor +
        " | Modo Automático: " + modoAuto;
    }
}
