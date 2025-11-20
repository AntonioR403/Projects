package TrabalhoPratico2.Ex2;

import java.util.PriorityQueue;

public class MetodoHondt{

    //class que representa cada partido no metodo hondt
    public static class MetodoH implements Comparable<MetodoH>{
        
        private String partido; //nome do partido
        private int votos; //numero de votos recebidos pelo partido 
        private int vagas; // numero de vagas atribuidas ao partido

        //Construtor para inicializar o partido com nome e votos, vagas começam a 0
        public MetodoH(String partido, int votos){
            this.partido = partido;
            this.votos = votos;
            this.vagas = 0;
        }

        //Metodo para obter o nome do partido
        public String getPartido(){
            return partido;
        }

        //método para obter numero dos votos
        public int getVotos(){
            return votos;
        }

        //metodo para obter o numero de vagas disponiveis
        public int getVagas(){
            return vagas;
        }

        //Incrementa o numero de vagas atribuidas ao partido em +1
        public void adicionarVagas(){
            this.vagas++;
        }

        //ordena partidos por número de votos, do maior para o menor
        public int compareTo(MetodoH outro){
            return Integer.compare(outro.votos, this.votos);
        }

        //reprensetação em String de objetos, útil para debug e visualização
        public String toString(){
            return partido + " tem " + votos + " votos e ficou com " + vagas + " vagas." ;
        }
    }

    //classe auxiliar que representa uma vaga a ser atribuido 
    public static class darVagas implements Comparable<MetodoHondt.darVagas>{
        MetodoH partido; //Partido associado à vaga
        double valor; //Valor calculado para comparação e ordenação

        //construtor 
        public darVagas(MetodoH partido, double valor){
            this.partido = partido;
            this.valor = valor;
        }

        //metodo para comparar vagas entre si para ordenação na PriorityQueue
        public int compareTo(darVagas outro){
            //orderna por valor de votos
            int cmp = Double.compare(outro.valor, this.valor);
            if(cmp != 0) return cmp;

            //em caso de empate no valor, desempata com base nos votos
            cmp = Integer.compare(this.partido.getVotos(), outro.partido.getVotos());
            if(cmp != 0) return cmp;

            //se presisitir o empate, desempata alfabeticamente 
            return this.partido.getPartido().compareTo(outro.partido.getPartido());
        }

    }

    //para armazenar os partidos conforme os votos
    private PriorityQueue<MetodoH> partidosT = new PriorityQueue<>();

    //Método para adicionar um novo partido à lista
    public void adicionarPartido(String partido, int votos){
        partidosT.add(new MetodoH(partido, votos));
    }

    //Método para obter uma cópia da PriorityQueue dos partidos
    public PriorityQueue<MetodoH> getPartidos(){
        return new PriorityQueue<>(partidosT);
    }
}