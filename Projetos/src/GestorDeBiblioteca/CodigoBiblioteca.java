package GestorDeBiblioteca;

import java.util.Scanner;
import java.util.ArrayList;

public class CodigoBiblioteca {
    
    Scanner sc = new Scanner(System.in);

    public static void cadastrarLivro(Scanner sc, ArrayList<Livros> livros){
        String titulo, autor, editora, estados;
        int anoPublicados = 0, codigoUnicos = 0;
        boolean verificar;
        do{
            System.out.print("Indique o Título do livro: ");
            titulo = sc.nextLine();
            verificar = isStringOnly(titulo);
            if(!verificar){
                System.out.println("Opção Inválida.");
            }
            
            System.out.print("Indique o Autor do livro: ");
            autor = sc.nextLine();
            verificar = isStringOnly(autor);
            if(!verificar){
                System.out.println("Opção Inválida.");
            }

            System.out.print("Indique a Editora do Livro: ");
            editora = sc.nextLine();
            verificar = isStringOnly(editora);
            if(!verificar){
                System.out.println("Opção Inválida");
            }

            System.out.print("Indique o Ano de Publicação: ");
            verificar = sc.hasNextInt();
            if(!verificar){
                System.out.print("Opção Inválida.");
            }else{
                anoPublicados = sc.nextInt();
                sc.nextLine();
            }

            System.out.print("Indique o Código Único do livro: ");
            verificar = sc.hasNextInt();
            if(!verificar){
                System.out.println("Opção Inválida.");
            }else{
                codigoUnicos = sc.nextInt();
                sc.nextLine();
            }

            System.out.println("Indique o estado do livro: ");
            estados = sc.nextLine();
            verificar = isStringOnly(estados);
            if(!verificar){
                System.out.println("Opção Inválida.");
            }
            
            Livros novoLivro = new Livros(titulo, autor, editora, anoPublicados, codigoUnicos, estados);
            livros.add(novoLivro);

        }while(!verificar);
    }

    public static void ListarLivro(ArrayList<Livros> livros){
        for(int i = 0; i < livros.size(); i++){
            livros.toString();
        }
    }

    public static boolean isStringOnly(String str){
        return str.matches("^[\\p{L}0-9 .,:;!?@$%&=£§€ºª+()'\"\\-]+$");
    }
}
