package TrabalhoPratico5.Ex2;

//Classe que representa um setup completo 
public class ComputadorSetup {
    
    private Tecnologia computador;

    //Construtor default para criar um setup
    public ComputadorSetup(){
        this.computador = new Computador();
    }

    //Construtor princiapl
    public ComputadorSetup(Tecnologia computador){
        this.computador = computador;
    }

    public Tecnologia getComputador() {
        return computador;
    }

    public void setComputador(Tecnologia computador) {
        this.computador = computador;
    }

    //imprime os detalhes do setup
    public void printSetup(){
        System.out.println("Detalhes do Setup: ");
        computador.print();
   }

}