package TrabalhoPratico8;

import java.util.HashMap;

public class Utilizador {
    private String nome;
    private HashMap<String, String> preferencias;
    private IRegisto registo;

    public Utilizador(String _nome){
        this.nome = _nome;
        this.preferencias = new HashMap<>();
        this.registo = new Registo();
    }

    //Executar acao em dispositivo
    public void executarAcao(Dispositivos dispositivos, String acao){
        switch (acao.toLowerCase()) {
            case "ligar":
                dispositivos.ligar();
                break;

            case "desligar":
                dispositivos.desligar();
                break;

            case "conectar":
                if(dispositivos instanceof EletrodomesticoInteligente){
                    ((EletrodomesticoInteligente)dispositivos).conectar();
                }
                break;

            case "desconectar":
                if(dispositivos instanceof EletrodomesticoInteligente){
                    ((EletrodomesticoInteligente)dispositivos).desconectar();
                }
                break;

            case "iniciargravacao":
                if(dispositivos instanceof CamaraVigilancia){
                    ((CamaraVigilancia)dispositivos).iniciarGravacao();
                }
                break;

            case "parargravacao":
                if(dispositivos instanceof CamaraVigilancia){
                    ((CamaraVigilancia)dispositivos).pararGravacao();
                }
                break;

            default:
                System.out.println("Ação Desconhecida");
                break;
        }
        registo.registarAcao(nome + " executou " + acao + " no dispositivo " + dispositivos.getNome());
    }

    //Consultar o consumo de uma divisão
    public double consultarConsumo(Divisoes divisoes, int horas, int dias){
        double consumo = divisoes.calcularConsumoAcumulado(horas, dias);    
        registo.registarAcao(nome + " consultou consumo da divisao " + divisoes.getNome() + ": " + consumo + " kwh.");
        return consumo;
    }

    //preferencias
    public void adicionarPreferencia(String chave, String valor){
        preferencias.put(chave, valor);
        registo.registarAcao(nome + " definiu preferência " + chave + " = " + valor);
    }

    //Historico
    public void consultarHistorico(){
        registo.consultarHistorico();;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public HashMap<String, String> getPreferencias() {
        return preferencias;
    }

    public void setPreferencias(HashMap<String, String> preferencias) {
        this.preferencias = preferencias;
    }
    
}
