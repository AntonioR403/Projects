package TrabalhoPratico7.ex1;

import java.util.Scanner;

public class Teste extends Utilizador{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        boolean inputValido = false;

        Utilizador user = new Utilizador();

        //pede os dados ao utilizador e caso tenha algum erro, manda uma mensagem de erro especifica
        while (!inputValido){
            try{
                System.out.println("Introduza o nome: ");
                String inputnome = sc.nextLine();
                user.setNome(inputnome);
                inputValido = true;
            }catch(InvalidNameException e){
                System.out.println("Erro: " + e.getMessage());
            }
        }
        
        inputValido = false;

        //pede os dados ao utilizador e caso tenha algum erro, manda uma mensagem de erro especifica
        while(!inputValido){
            try{
                System.out.println("Introduza a sua idade: ");
                String idade = sc.nextLine();
                user.setIdade(idade);
                inputValido = true;
            }catch(InvalidAgeException e){
                System.out.println("Erro: " + e.getMessage());
            }
        }

        inputValido = false;

        //pede os dados ao utilizador e caso tenha algum erro, manda uma mensagem de erro eAntonio98specifica
        while(!inputValido){
            try {
                System.out.println("Introduza o seu email: ");
                String email = sc.nextLine();
                user.setEmail(email);
                inputValido = true;
            } catch (InvalidEmailException e) {
                System.out.println("Erro: " + e.getMessage());
            }finally{
                //escrever os dados introduzidos de volta para o utilizador
                System.out.println(user.toString());
            }
        }

        sc.close();
    }
}
