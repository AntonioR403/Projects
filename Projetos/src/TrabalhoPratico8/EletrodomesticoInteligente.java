package TrabalhoPratico8;

public class EletrodomesticoInteligente extends Dispositivos{
    private String tipoConexao;
    private String enderecoIP;
    private boolean online;

    public EletrodomesticoInteligente(String _nome, int _id, boolean _estado, double _watts, double _consumoAcumulado, String _controloRemoto ,
        String _tipoConexao, String _enderecoIP, boolean _online){
        
        super(_nome, _id, _estado, _watts, _consumoAcumulado, _controloRemoto);
        this.tipoConexao = _tipoConexao;
        this.enderecoIP = _enderecoIP;
        this.online = _online;
    }

    //Métodos de conectividade
    public void conectar(){
        online = true;
        System.out.println(getNome() + " conectado via " + tipoConexao);
    }

    public void desconectar(){
        online = false;
        System.out.println(getNome() + " desconectado.");
    }

    //Getters e Setters
    public String getTipoConexao() {
        return tipoConexao;
    }

    public void setTipoConexao(String tipoConexao) {
        this.tipoConexao = tipoConexao;
    }

    public String getEnderecoIP() {
        return enderecoIP;
    }

    public void setEnderecoIP(String enderecoIP) {
        this.enderecoIP = enderecoIP;
    }

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

    @Override
    public String toString(){
        return super.toString() + 
        " | Tipo de Conexão: " + tipoConexao +
        " | Endereço IP: " + enderecoIP + 
        " | Online: " + (online ? "Sim" : "Não");
    }
    
}
