package ExerciciosRevisao1;

import java.util.Scanner;

public class Ex3 {

    public static void msg(){
        System.out.println("É necessário introduzir o rendimento antes de selecionar outra opção.");
    }

    public static void Correto(){
        System.out.println("Escalão Correto.");
    }

    public static void Incorreto(){
        System.out.println("Escalão Incorreto.");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean confirmar = false;
        int opcao = 0;
        double rendimento = 0.0;

        do{
            do{
                System.out.println("""
                        ============= Menu =============
                        1 - Inserir valor do rendimento
                        2 - Taxa de 14,5%
                        3 - Taxa de 28,5%
                        4 - Taxa de 37%
                        5 - Taxa de 45%
                        6 - Taxa de 48%
                        7 - Sair
                        ================================
                        """);
                confirmar = sc.hasNextInt();

                if(confirmar == true){
                    opcao = sc.nextInt();
                    sc.nextLine();
                    if(opcao < 1 || opcao > 7){
                        System.out.println("Opção Inválida.");
                        confirmar = false;
                    }
                }else{
                    System.out.println("Tem de ser uma das opções. (1-7)");
                    sc.nextLine();
                }
            }while(confirmar == false);

            switch(opcao){
                case 1:
                    do{
                        System.out.println("Indique o seu rendimento.(ex 10000)");
                        confirmar = sc.hasNextDouble();

                        if(confirmar = true){
                            rendimento = sc.nextDouble();
                            sc.nextLine();
                            if(rendimento < 0){
                                System.out.println("Não se pode ter um rendimento nulo ou negativo.");
                                confirmar = false;
                            }else{
                                System.out.println("Rendimento introduzido com sucesso.");
                            }
                        }
                    }while(confirmar == false);
                break;
                
                case 2:
                    if(rendimento <= 0){
                        msg();
                    }else{
                        if(rendimento < 7000){
                            Correto();
                        }
                        else{
                            Incorreto();
                        }
                    }
                break;

                case 3:
                    if(rendimento <= 0){
                        msg();
                    }else{
                        if(rendimento >= 7000 && rendimento < 20000){
                            Correto();
                        }
                        else{
                            Incorreto();
                        }
                    }
                break;
                
                case 4:
                    if(rendimento <= 0){
                        msg();
                    }else{
                        if(rendimento >= 20000 && rendimento < 40000){
                            Correto();
                        }else{
                            Incorreto();
                        }
                    }
                break;

                case 5:
                    if(rendimento <= 0){
                        msg();
                    }else{
                        if(rendimento >= 40000 && rendimento < 80000){
                            Correto();
                        }else{
                            Incorreto();
                        }
                    }
                break;

                case 6:
                    if(rendimento <= 0){
                        msg();
                    }else{
                        if(rendimento >= 80000){
                            Correto();
                        }else{
                            Incorreto();
                        }
                    }
                break;

                default:
                    System.out.println("A encerrar..."); 
            }
            

        }while(opcao != 7);

        sc.close();
    }
}
