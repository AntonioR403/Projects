package TrabalhoPratico8;

import java.util.ArrayList;

public class Registo implements IRegisto {
    
    private ArrayList<String> historicoAcoes;

    public Registo(){
        this.historicoAcoes = new ArrayList<>();
    }

    @Override
    public void registarAcao(String acao){
        historicoAcoes.add(acao);
    }

    @Override
    public void consultarHistorico(){
        System.out.println("Historico de ações: ");
        for(String acao : historicoAcoes){
            System.out.println("- " + acao);
        }
    }

}
