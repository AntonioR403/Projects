package TrabalhoPratico5.Ex2;

//Classe que representa um computador, herda da tecnologia
public class Computador extends Usar {
    private Rato mouse; //Classe Mouse
    private Teclado teclado; //Classe Teclado
    private Monitor monitor; //CLasse Monitor
    private String processador;
    private String memoria_raam;
    private String placa_grafica;
    private String tipo_de_memoria;
    private int tamanho_da_memoria;
    private boolean configurado;

    //Construtor default do computador
    public Computador(){
        this("Portátil Gamer", 999.99f, "Asus", "12345", 1001,
                "Intel i7", "16GB", "RTX 4060", "DDR5", 16, new Rato(), new Teclado(), new Monitor());
    }

    //Construtor principal
    public Computador(String _nome, double _preco, String _marca, String _numero_de_serie, int _codigo_de_barras, String _processador, String _memoria_raam,
        String _placa_grafica, String _tipo_de_memoria, int _tamanho_da_memoria, Rato mouse, Teclado teclado, Monitor monitor){

        super(_nome, _preco, _marca, _numero_de_serie, _codigo_de_barras);
        this.mouse = mouse;
        this.processador = _processador;
        this.memoria_raam = _memoria_raam;
        this.placa_grafica = _placa_grafica;
        this.tipo_de_memoria = _tipo_de_memoria;
        this.tamanho_da_memoria = _tamanho_da_memoria;
        this.mouse = mouse;
        this.teclado = teclado;
        this.monitor = monitor;
        this.configurado = false;
    }

    //Getters e Setters 
    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String getMemoria_raam() {
        return memoria_raam;
    }

    public void setMemoria_raam(String memoria_raam) {
        this.memoria_raam = memoria_raam;
    }

    public String getPlaca_grafica() {
        return placa_grafica;
    }

    public void setPlaca_grafica(String placa_grafica) {
        this.placa_grafica = placa_grafica;
    }

    public String getTipo_de_memoria() {
        return tipo_de_memoria;
    }

    public void setTipo_de_memoria(String tipo_de_memoria) {
        this.tipo_de_memoria = tipo_de_memoria;
    }

    public int getTamanho_da_memoria() {
        return tamanho_da_memoria;
    }

    public void setTamanho_da_memoria(int tamanho_da_memoria) {
        this.tamanho_da_memoria = tamanho_da_memoria;
    }

    public Rato getMouse() {
        return mouse;
    }
    public void setMouse(Rato mouse) {
        this.mouse = mouse;
    }
    
    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    //serve para realizar um cópia completo do computador
    public Computador clone(){
        Computador C = (Computador) super.clone();
        C.mouse = this.mouse.clone();
        C.teclado = this.teclado.clone();
        C.monitor = this.monitor.clone();
        return C;
    }

    //imprime os atributos do computador
    public void print(){
        super.print();
        System.out.println("Processador: " + processador +
                           " | RAM: " + memoria_raam +
                           " | Placa Gráfica: " + placa_grafica +
                           " | Tipo de Memória: " + tipo_de_memoria +
                           " | Tamanho da Memória: " + tamanho_da_memoria);
        mouse.print();
        teclado.print();
        monitor.print();
    }

    //mostra um detalhe específico do rato
    public void mostrarMouse(){
        System.out.println("Mouse do computador: " + mouse.getTecnologia_de_sensor());
    }

    //imrpime os atributos do computador
    public String toString() {
        return super.toString() + " | Processador: " + processador + " | RAM: " + memoria_raam;
    }
    
    public void configurar(){
        this.configurado = true;
        System.out.println("\n A ser configurado...");
    }

    @Override
    public boolean prontoParaUsar(){
        return configurado;
    }

    @Override
    public void podeUsar(){
        if(configurado){
            System.out.println("\n" + getNome() + " está pronto a ser usado.");
        }else{
            System.out.println("\n" + getNome() + " não está pronto a ser usado.");
        }
    }
}