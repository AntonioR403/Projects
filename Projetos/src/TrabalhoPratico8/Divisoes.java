package TrabalhoPratico8;

import java.util.ArrayList;

public class Divisoes{
    public String nome;
    private ArrayList<Dispositivos> listaDispositivos;
    
    public Divisoes(String _nome){
        this.nome = _nome;
        this.listaDispositivos = new ArrayList<>();
    }

    public double calcularConsumoAcumulado(int horas, int dias){
        //(Watts * horas de uso por dia * Numero de dias) % 1000 = kwh acumulado.
        double soma = 0;
        for(Dispositivos d : listaDispositivos){
            soma += d.consumoAcumuladoDispositivo(horas, dias);
        }
        return soma;
    }

    public void removerDispositivo(Dispositivos d){
        listaDispositivos.remove(d);
    }

    public void adicionarDispositivos(Dispositivos d){
        listaDispositivos.add(d);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Dispositivos> getDispositivos() {
        return listaDispositivos;
    }

    public void setDispositivos(ArrayList<Dispositivos> dispositivos) {
        this.listaDispositivos = dispositivos;
    }

    @Override
    public String toString(){
        String resultado = "Divisão: " + nome + "\n";
        if(listaDispositivos.isEmpty()){
            resultado += "Nenhum dispositivo nesta divisão\n";
        }else{
            for(Dispositivos d : listaDispositivos){
                resultado += " - " + d.toString() + "\n";
            }
        }
        return resultado;
    }
}
