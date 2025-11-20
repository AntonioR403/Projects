package ExerciciosRevisao1;

import java.util.Scanner;

public class Ex2 {

    public static void msg (){
        System.out.println("É necessário introduzir o mês antes de poder realizar outras operações");
    }

    public static void Correta(){
        System.out.println("Estação Correta");
    }

    public static void Incorreta(){
        System.out.println("Estação Incorreta");
    }

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        boolean confirmar = false, valido = false;
        int opcao = 0, mes = 0;
        
        do{
            do{
                System.out.println("""
                        ===== Menu =====
                        1 - Inserir Mês
                        2 - Primavera
                        3 - Verão
                        4 - Outono
                        5 - Inverno
                        6 - Sair
                        ================
                        """);
                confirmar = sc.hasNextInt();

                if(confirmar == true){
                    opcao = sc.nextInt();
                    if(opcao < 1 || opcao > 6){
                        System.out.println("Opção Inválida. Selecione umas das opções disponiveis. (1 a 6)");
                        sc.nextLine();
                    }
                }else{
                    System.out.println("Opção Inválida. Tem de ser umas das opções do menu (1 a 6).");
                    sc.nextLine();
                }

            }while(confirmar == false || opcao < 1 || opcao > 6);

            switch (opcao) {
                case 1:
                    do{
                        System.out.println("Indique o número do mês que deseja escolher?");
                        confirmar = sc.hasNextInt();
                        if(confirmar == true){
                            mes = sc.nextInt();
                            valido = true;
                            if(mes < 1 || mes > 12){
                                System.out.println("O mês introduzido é inválido.Tem de ser entre 1 e 12.");
                                sc.nextLine();
                                valido = false;
                            }
                        }else{
                            System.out.println("Opção Inválida. Tem de ser o número correspodente ao mès (1 a 12).");
                            sc.nextLine();
                            valido = false;
                        }

                        if(mes == 3 || mes == 6 || mes == 9 || mes == 12){
                            System.out.println("Este mês é dividido em duas estações.");
                        }
                    }while(valido != true);
                break;

                case 2:
                    if(mes == 0){
                        msg();
                    }else{
                        if(mes >= 3 && mes <= 6){
                            Correta();
                        }else{
                            Incorreta();
                        }
                    }
                break;

                case 3:
                    if(mes == 0){
                        msg();
                    }else{
                        if(mes >= 6 && mes <= 9){
                            Correta();
                        }else{
                            Incorreta();
                        }
                    }
                break;

                case 4:
                    if(mes == 0){
                        msg();
                    }else{
                        if(mes >= 10 && mes <= 12){
                            Correta();
                        }else{
                            Incorreta();
                        }
                    }
                break;

                case 5:
                    if(mes == 0){
                        msg();
                    }else{
                        if(mes == 12 || mes <= 3 && mes >= 1){
                            Correta();
                        }else{
                            Incorreta();
                        }
                    }
                default:
                    System.out.println("A encerrar...");    
                break;
            }

        }while(opcao != 6);
    sc.close();
    }
}
