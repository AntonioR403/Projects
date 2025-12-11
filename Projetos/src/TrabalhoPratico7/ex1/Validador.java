package TrabalhoPratico7.ex1;

public class Validador {
    //validador próprio para o nome, verifica e vê se tem algum erro, se tiver manda msg de erro
    public static void validadorNome(String nome) throws InvalidNameException{
        if(nome.isEmpty() ){
            //verifica se o campo nome não está vazio
            throw new InvalidNameException("O campo não pode ficar vazio.");
        }
        else{
            //verifica se o campo nome não contém nada para além de letras
            for(char c : nome.toCharArray()){
                if(Character.isDigit(c)){
                    throw new InvalidNameException("O campo não pode conter nenhum número.");
                }
            }
        }
    }

    //validador próprio para a idade, verifica e vê se tem algum erro, se tiver manda msg de erro
    public static void validadorIdade(String idade) throws InvalidAgeException{
        int idadeTemp = 0;
        if(idade.isEmpty()){
            throw new InvalidAgeException("O campo não pode estar vazio.");
        }
        try {
            idadeTemp = Integer.parseInt(idade);
            if(idadeTemp < 1){
                throw new InvalidAgeException("A idade não pode ser a baixo de 0.");
            }
            else if(idadeTemp > 120){
                throw new InvalidAgeException("A idade não pode ser a cima de 120.");
            }
        } catch (NumberFormatException e) {
            throw new InvalidAgeException("Só pode conter números");
        }
        
    }

    //validador próprio para o email, verifica e vê se tem algum erro, se tiver manda msg de erro
    public static void validadorEmail(String email) throws InvalidEmailException{
        if(email.isEmpty()){
            //verifica se a variavel email não está vazia
            throw new InvalidEmailException("Este campo não pode ficar vazio.");
        }else if(!email.contains("@")){
            //verifica se a variavel email contém o @ para ser válido
            throw new InvalidEmailException("Este campo necessita de ter @ para poder ser válido.");
        }else if(!email.endsWith(".com") && !email.endsWith(".pt")){
            //verifica se a variavel email contém no fim .com ou o .pt
            throw new InvalidEmailException("Este campo necessita de acabar em .com ou em .pt.");
        }
    }
}
