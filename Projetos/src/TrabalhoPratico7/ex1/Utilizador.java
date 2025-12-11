package TrabalhoPratico7.ex1;

public class Utilizador {
    String nome;
    String idade;
    String email;

    //construtor com parâmetros
    public Utilizador(String _nome, String _idade, String _email){
        this.nome = _nome;
        this.idade = _idade;
        this.email = _email;
    }

    //construtor sem parâmetros
    public Utilizador(){
        this.nome = "Nome Padrão";
        this.idade = "20";
        this.email ="emailpadrao@gmail.com";
    }

    //getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws InvalidNameException{
        Validador.validadorNome(nome);
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) throws InvalidAgeException{
        Validador.validadorIdade(idade);
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws InvalidEmailException{
        Validador.validadorEmail(email);
        this.email = email;
    }

    //método toString
    @Override
    public String toString(){
        return "Nome: " + nome + " Idade: " + idade + " Email: " + email;
    }
}
