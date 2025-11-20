package GestorDeBiblioteca;

import java.util.Scanner;
import java.util.ArrayList;

public class Biblioteca {
    public static void main(String[] args) {
        ArrayList<Livros> livros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int op = 0;
        boolean confirmar = false;
        char continuar = 'N'; 
        do{
            do{
                System.out.print("""
                        =============Menu==================
                        1 - Cadastrar Livro
                        2 - Lista Completa dos Livros
                        3 - Atualizar o Estado de um livro
                        4 - Procurar Livro
                        5 - Remover Livro
                        6 - Lista de Livros por Estado
                        7 - Sair
                        ===================================
                        """);
                if (sc.hasNextInt()) {
                    op = sc.nextInt();
                    sc.nextLine(); 
                    confirmar = true;
                } else {
                    System.out.println("Opção inválida. Digite um número entre 1 e 7.");
                    sc.nextLine(); 
                    confirmar = false;
                }

            }while(!confirmar);

            switch (op) {
                case 1:
                    CodigoBiblioteca.cadastrarLivro(sc, livros);
                break;

                case 2:
                    CodigoBiblioteca.ListarLivro(livros);
                break;
                
                case 7:
                    do {
                        System.out.println("Tem certeza que deseja sair ? (sim/não)");
                        continuar = sc.nextLine().toUpperCase().trim().charAt(0);

                        if(continuar != 'S' && continuar != 'N'){
                            System.out.println("Opção Inválida.");
                        }else if(continuar == 'S'){
                            System.out.println("A encerrar...");
                        }else{
                            System.out.println("Opção cancelada.");
                        }

            } while (continuar != 'S' && continuar != 'N');
                default:
                    break;
            }
            
        }while(op != 7 || continuar != 'S');
    }
}
