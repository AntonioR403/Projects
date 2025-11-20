package JogoDeAdivinhar;
import java.util.Scanner;
import java.util.Random;
import java.time.LocalTime;
import java.time.Duration;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int numeroMaximo = 0;
        boolean confirmacao = false;
        int numeroIntroduzido = 0;
        int contador = 0;
        LocalTime horaInicial = LocalTime.MIDNIGHT;
        LocalTime horaFinal;
        char op = 'S';
        int tipo = 0;
        
        do{

            System.out.println("Jogo de adivinhar o Número.");
            do{
                System.out.println("Indique o número maximo do intervalo.(ex. 1 - 100)");
                confirmacao = sc.hasNextInt();

                if(!confirmacao){
                    System.out.println("Opção inválida. Tem de ser um número inteiro.");
                    sc.nextLine();
                }
        
            }while(!confirmacao);

            numeroMaximo = sc.nextInt();
            
            do{
                do{
                    System.out.println("""
                                        Menu
                        ================================
                            1 - Jogador tenta adivinhar
                            2 - Computador tenta adivinhar
                            3 - Sair
                        ================================
                            """);
                            confirmacao = sc.hasNextInt();
                            if(!confirmacao){
                                System.out.println("Tem de ser um número inteiro e uma das opção válida.");
                                sc.nextLine();
                            }
                }while(!confirmacao);

                tipo = sc.nextInt();

                if(tipo < 1 || tipo > 3){
                    System.out.println("Opção inválida.");
                    sc.nextLine();
                }

            }while(tipo < 1 || tipo > 3);

            int numeroEscolhido = rd.nextInt(numeroMaximo) + 1;

            switch(tipo){

                case 1:

                    while(numeroEscolhido != numeroIntroduzido){
                        do{
                            if(contador == 0){
                                horaInicial = LocalTime.now();
                            }
                            contador++;
                            System.out.println("Tente adivinhar o número escolhido: ");
                            confirmacao = sc.hasNextInt();
                            if(!confirmacao){
                                System.out.println("Opção Inválida. Tem de ser um número inteiro.");
                                sc.nextLine();
                            }
                            numeroIntroduzido = sc.nextInt();
                            if(numeroIntroduzido < 1 || numeroIntroduzido > numeroMaximo ){
                                System.out.println("Número estar fora do intervalo escolhido.");
                                sc.nextLine();
                                confirmacao = false;
                            }
                        }while(!confirmacao);
                        
                        if(numeroIntroduzido < numeroEscolhido){
                            System.out.println("Mais alto.");
                        }
                        else if(numeroIntroduzido > numeroEscolhido){
                            System.out.println("Mais baixo.");
                        }
                        else{
                            horaFinal = LocalTime.now();
                            Duration duracao = Duration.between(horaInicial, horaFinal);
                            long horas = duracao.toHours();
                            long minutos = duracao.toMinutes() % 60;
                            long segundos = duracao.getSeconds() % 60;
                            String tempoFormatado = String.format("%02d:%02d:%02d", horas, minutos, segundos);
                            System.out.println("Parabéns acertou.");
                            System.out.println("Demorou " + contador + " tentativas, o tempo que demorou a encontrar o numero foi  " + tempoFormatado);
                        }
                    }
                    sc.nextLine();
                break;

                case 2:
                    do{
                        System.out.println("""
                            O sistema não vai ter acesso é só para evitar batota;
                            Indica o numero que escolhes-te.
                            """);
                        confirmacao = sc.hasNextInt();

                        if(!confirmacao){
                            System.out.println("Tem de ser um número inteiro.");
                            sc.nextLine();
                            continue;
                        }

                        numeroIntroduzido = sc.nextInt();
                        sc.nextLine();
                        if(numeroIntroduzido < 1 || numeroIntroduzido > numeroMaximo ){
                            System.out.println("Número estar fora do intervalo escolhido.");
                            sc.nextLine();
                            confirmacao = false;
                        }
                    }while(!confirmacao);

                    int baixo = 1;
                    int maior = numeroMaximo;
                    contador = 0;
                    horaInicial = LocalTime.now();

                    while(baixo <= maior){
                        contador++;
                        int meio = (baixo + maior) / 2;
                        System.out.println("O computador tenta: " + meio);

                        if(meio < numeroIntroduzido){
                            baixo = meio + 1;
                        }else if(meio > numeroIntroduzido){
                            maior = meio - 1;
                        }else{
                            horaFinal = LocalTime.now();
                            Duration duracao = Duration.between(horaInicial, horaFinal);
                            long horas = duracao.toHours();
                            long minutos = duracao.toMinutes() % 60;
                            long segundos = duracao.getSeconds() % 60;
                            String tempoFormatado = String.format("%02d:%02d:%02d", horas, minutos, segundos);
                            System.out.println("Parabéns! O computador acertou.");
                            System.out.println("Demorou " + contador + " tentativas, o tempo que demorou foi: " + tempoFormatado);
                            break;
                        }
                    }
                break;     
                    
            }
            do{
                System.out.println("Quer jogar outra vez? (sim/nao)");
                op = sc.nextLine().toUpperCase().charAt(0);
            }while(op != 'S' && op  != 'N');

        }while(op == 'S');

        sc.close();
    }
}