package TrabalhoPratico8;

public class CamaraVigilancia extends Dispositivos{
    public boolean estaGravando;
    public String resolucao;

    public CamaraVigilancia(String _nome, int _id, boolean _estado, double _watts, double _consumoAcumulado, String _controloRemoto, String _resolucao){
        super(_nome, _id, _estado, _watts, _consumoAcumulado, _controloRemoto);
        this.estaGravando = false;
        this.resolucao = _resolucao;
    }

    //inicia gravacao
    public void iniciarGravacao(){
        this.estaGravando = true;
        System.out.println("A camerâ " + nome + " começou a gravar em " + resolucao);
    }

    //para a gravação
    public void pararGravacao(){
        this.estaGravando = false;
        System.out.println("A camera " + nome + " para de gravar.");
    }

    public boolean isEstaGravando() {
        return estaGravando;
    }

    public void setEstaGravando(boolean estaGravando) {
        this.estaGravando = estaGravando;
    }

    public String getResolucao() {
        return resolucao;
    }

    public void setResolucao(String resolucao) {
        this.resolucao = resolucao;
    }

    public String toString(){
        return super.toString() + 
        " | Gravação: " + (estaGravando ? "Ativa" : "Inativa") + 
        " | Resolução: " + resolucao;
    }
}
