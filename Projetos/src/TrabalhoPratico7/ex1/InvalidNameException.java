package TrabalhoPratico7.ex1;

public class InvalidNameException extends Exception{
    //construtor padrão com a msg padrão
    public InvalidNameException(){
        super("Campo incorreto");
    }

    //construtor que permite defintir uma mensagem de erro especifico
    public InvalidNameException(String specificMessage){
        super(specificMessage);
    }
    
}
