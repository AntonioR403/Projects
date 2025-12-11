package TrabalhoPratico7.ex1;

public class InvalidEmailException extends Exception{
    //construtor padrão com a msg padrão
    public InvalidEmailException(){
        super("Email inválido.");
    }
    
    //construtor que permite defintir uma mensagem de erro especifico
    public InvalidEmailException(String specificmessage){
        super(specificmessage);
    }
}
