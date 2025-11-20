package ExerciciosRevisao1;

import java.util.Scanner;

public class Ex1 {
    public static boolean validarNum(String num){
        num = num.trim();

        if(num.isEmpty()){
            System.out.println("Não pode deixar o campo vazio.");
            return false;
        }

        try{
            int numero = Integer.parseInt(num);
            if(numero >= 0){
                return true;
            }
            else{
                System.out.println("Tem de ser um número inteiro positivo.");
            }
        } catch (NumberFormatException e){
            System.out.println("Tem de ser um número inteiro positivo.");
        }

        return false;
    }

    public static void erroMensagem(){
        System.out.println("Tem de inserir os operadores primeiro.");
    }

    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);

        boolean confirmar = true;
        String verificar;
        int n1 = -1, n2 = -1;
        int opcao = 0;

        do{
            System.out.println("""
                    ======= Menu =======
                    1 - Inserir Operadores
                    2 - Soma     
                    3 - Subtração
                    4 - Multiplicação
                    5 - Divisão
                    6 - Sair
                    ====================   
                    """);
            confirmar = sc.hasNextInt();

            if(confirmar == false){
                System.out.println("Têm de introduzir umas das opções");
                sc.nextLine();
            }else{
                opcao = sc.nextInt();
                sc.nextLine();

                if(opcao < 1 || opcao > 6){
                    System.out.println("Opcão inválida. Introduza um número de 1 a 6.");
                }
            }

            boolean inseridos = (n1 != -1 && n2 != -1);

            switch (opcao) {
            case 1:
                do{
                System.out.println("Indique o Primeiro Número.");
                verificar = sc.nextLine();
                
                if(validarNum(verificar))
                {
                    n1 = Integer.parseInt(verificar);
                }

                }while (n1 < 0);

                do{
                    System.out.println("Indique o Segundo Número.");
                    verificar = sc.nextLine();
                    
                    if(validarNum(verificar))
                    {
                        n2 = Integer.parseInt(verificar);
                    }

                }while (n2 < 0);
            break;
            
            case 2:
                if(inseridos){
                    System.out.println("A soma dos dois números dá: " + (n1 + n2));
                }else{
                    erroMensagem();
                }
            break;

            case 3:
                if(inseridos){
                    if(n2 < n1){
                        System.out.println("A subtração dos dois operadores dá: " + (n1 - n2));
                    }else{
                        System.out.println("A primeiro operador necessita de ser maior que o segundo.");
                    }
                }else{
                    erroMensagem();
                }
            break;

            case 4:
                if(inseridos){
                    System.out.println("A multiplicação dos dois operadores dá: " + (n1 * n2));
                }else{
                    erroMensagem();
                }
            break;

            case 5:
                if(inseridos){
                    if(n2 != 0){
                        System.out.println("A divisão dos dois operador dá: " + (n1 / n2));
                    }else{
                        System.out.println("O segundo operador não pode ser 0 para realizar a divisão");
                    }
                }else{
                    erroMensagem();
                }
            break;
            
            default:
                System.out.println("A encerrar...");
            break;
            }

        }while(confirmar == false || opcao != 6);

        sc.close(); 
    }
}
