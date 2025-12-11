package TrabalhoPratico7.ex1;

public class InvalidAgeException extends Exception{
    //construtor padrão com a msg padrão
    public InvalidAgeException(){
        super("A idade não pode ser abaixo de 0 e nem acima de 120.");
    }

    //construtor que permite defintir uma mensagem de erro especifico
    public InvalidAgeException(String specificMessage){
        super(specificMessage);
    }
}
