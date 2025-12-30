package TrabalhoPratico8;

import java.util.ArrayList;

public class Casa {
    private String nome;
    private ArrayList<Divisoes> divisoes;

    public Casa(String nome){
        this.nome = nome;
        this.divisoes = new ArrayList<>();
    }

    public void adicionarDivisao(Divisoes div){
        divisoes.add(div);
    }

    public void removerDivisao(Divisoes div){
        divisoes.remove(div);
    }

    //calcular consumo total da casa
    public double calcularConsumoAcumulado(int horas, int dias){
        double total = 0;
        for(Divisoes d: divisoes){
            total += d.calcularConsumoAcumulado(horas, dias);
        }
        return total;
    }

    //modos
    public void ativarModoEco(){
        for(Divisoes d : divisoes){
            for(Dispositivos disp : d.getDispositivos()){
                if(disp instanceof IluminacaoAdaptativa){
                    ((IluminacaoAdaptativa) disp).setIntensidade(24);
                }
                if(disp instanceof Climatizacao){
                    ((Climatizacao)disp).ajustarTemperatura(24);
                    ((Climatizacao)disp).mudarModo("Eco");  
                }
            }
        }
    }

    public void activarModoFerias(){
        for(Divisoes d : divisoes){
            for(Dispositivos disp : d.getDispositivos()){
                disp.desligar();
                if(disp instanceof CamaraVigilancia){
                    ((CamaraVigilancia)disp).iniciarGravacao();
                }
            }
        }
    }

    public void activarModoNoturno(){
        for(Divisoes d : divisoes){
            for(Dispositivos disp: d.getDispositivos()){
                if(disp instanceof IluminacaoAdaptativa){
                    ((IluminacaoAdaptativa)disp).setIntensidade(20);
                }
                if(disp instanceof Climatizacao){
                    ((Climatizacao)disp).mudarModo("Quente");
                }
            }
        }
    }

    //listar todos os dispositivos
    public void listarDispositivos(){
        for(Divisoes d: divisoes){
            System.out.println("Divisão: " + d.getNome());
            for(Dispositivos disp : d.getDispositivos()){
                System.out.println(disp);
            }
        }
    }

    //buscar dispositivos por tipo
    public ArrayList<Dispositivos> buscarPorTipo(String tipoClasse){
        ArrayList<Dispositivos> resultado = new ArrayList<>();
        for(Divisoes div: divisoes){
            for(Dispositivos disp : div.getDispositivos()){
                if(disp.getClass().getSimpleName().equalsIgnoreCase(tipoClasse)){
                    resultado.add(disp);
                }
            }
        }
        return resultado;
    }

    //buscar dispositivos por estado
    public ArrayList<Dispositivos> buscarPorEstado(boolean ligado){
        ArrayList<Dispositivos> resultado = new ArrayList<>();
        for(Divisoes div : divisoes){
            for(Dispositivos disp : div.getDispositivos()){
                if(disp.isEstado() == ligado){
                    resultado.add(disp);
                }
            }
        }
        return resultado;
    }

    //buscar dispositivos por consumo
    public ArrayList<Dispositivos> buscarPorConsumo(double limitekwh, int horas, int dias){
        ArrayList<Dispositivos> resultado = new ArrayList<>();
        for(Divisoes div : divisoes){
            for(Dispositivos disp : div.getDispositivos()){
                if(disp.consumoAcumuladoDispositivo(horas, dias) >= limitekwh){
                    resultado.add(disp);
                }
            }
        }
        return resultado;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Divisoes> getDivisoes() {
        return divisoes;
    }

    public void setDivisoes(ArrayList<Divisoes> divisoes) {
        this.divisoes = divisoes;
    }

    
}
