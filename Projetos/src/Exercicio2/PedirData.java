package Exercicio2;

import java.util.Scanner;

public class PedirData{
    public static void main(String args[]){
        Data dt = new Data();
        Data dt2 = dt.clone();
        Scanner sc = new Scanner(System.in);

        int dia = 1, mes = 1, ano = 1900, op = 0;
        boolean verificar = false;

        do{
            System.out.println("""
                    ==================== Menu ====================
                    1 - Introduzir data
                    2 - Mostrar data
                    3 - Mostrar copia de data
                    4 - Verificar se o ano é Bissesto
                    5 - Mudar a data para a data atual
                    6 - Calcular data por dias
                    7 - Mostrar formatos de data
                    8 - Mostrar quantas datas estão guardadas
                    9 - Sair
                    ==============================================
                    """);
            verificar = sc.hasNextInt();
            if(verificar && (op > 0 && op < 10)){
                op = sc.nextInt();
            }else{
                System.out.println("Opção inválida. Introduza uma opção entre 1 - 9.");
                sc.nextInt();
            }

            switch (op) {
                case 1:
                    while(true){
                        //pede ao utilizador novos valores de data 
                        System.out.print("Introduza o dia: ");
                        dia = sc.nextInt();
                        System.out.print("Introduza o mês: ");
                        mes = sc.nextInt();
                        System.out.print("Introduza o ano: ");
                        ano = sc.nextInt();
                        
                        if(dt.verificarData(dia, mes, ano)){
                            dt.setDia(dia);
                            dt.setMes(mes);
                            dt.setAno(ano);
                            break;
                        }else{
                            System.out.println("Data Inválida. Tente novamente.");
                        }

                    }
                break;
                
                case 2:
                    //usa o método toString para mostrar o valor inicial do objeto
                    System.out.println(dt);
                break;

                case 3:
                    //usando o método toString no clone
                    System.out.println(dt2); 

                case 4:
                    //verificar se o ano é bissesto
                    dt.verificarAnoBisexto();
                break;

                case 5:
                    //mudar o valor da data do objeto para a data atual
                    dt.setDataAtual();
                break;

                case 6:
                    //Calcula os dias desda data por definição até a data atual do objeto
                    System.out.println("A diferença entre a data por definição é a data introduzida é: " + dt.calcularDias());
                break;

                case 7:
                    //escreve os dois formatos diferentes que a data pode ter
                    System.out.println(dt.formatarData());
                break;

                case 8:
                    //verifica quantas vezes uma data foi introduzida
                    System.out.println(Data.getContadorDatas());
                break;

                case 9:
                    System.out.println("A encerrar...");
                break;
            }
        }while(verificar == false || op != 9);

        sc.close();
    }
}
