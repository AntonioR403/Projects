package TrabalhoPratico2.Ex1;

public class IMC {
    //parâmetros da classe
    private String nome;
    private float altura;
    private float peso;

    //Getters
    public String getNome(){
        return this.nome;
    }

    public float getAltura(){
        return this.altura;
    }

    public float getPeso(){
        return this.peso;
    }

    //Setters
    public void setNome(String novoNome){
        this.nome = novoNome;
    }

    public void setAltura(float novaAltura){
        this.altura = novaAltura;
    }

    public void setPeso(float novoPeso){
        this.peso = novoPeso;
    }

    public String calcularIMC(){
        return nome + " o seu índice de massa corporal é " + (peso / (altura * altura));
    }

    public String toString(){
        return "nome: " + nome + " altura: " + altura + " peso: " + peso;
    }
}
