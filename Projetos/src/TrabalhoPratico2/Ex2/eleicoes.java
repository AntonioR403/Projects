package TrabalhoPratico2.Ex2;

import java.util.PriorityQueue;
import java.util.Scanner;

public class eleicoes {
 
    public static void main(String[] args) {
        String partido;
        int votos, numeroDePartidos = 0, numeroDeVagas = 0;
        boolean verificar = false;
        MetodoHondt listaDePartidos = new MetodoHondt();

        Scanner sc = new Scanner(System.in);

        //pedir o numero de partidos e validação de dados
        do{
            System.out.println("Quantos partidos vão participar do ciclo eleitoral?");
            verificar = sc.hasNextInt();

            if(verificar){
                numeroDePartidos = sc.nextInt();
                sc.nextLine();
                if(numeroDePartidos <= 0){
                    System.out.println("O número de partidos não pode ser negativo nem zero.");
                }
            }else{
                System.out.println("O número de partidos tem de ser um número interiro.");
                sc.nextLine();
            }
            
        }while(!verificar || numeroDePartidos <= 0);

        //pedir o nome e os votos de cada partido
        for(int i = 0; i < numeroDePartidos; i++){
            System.out.print("Nome do partido: ");
            partido = sc.nextLine();

            System.out.print("Quantos votos recebeu o partido: ");
            votos = sc.nextInt();
            sc.nextLine();

            listaDePartidos.adicionarPartido(partido, votos);
        }

        //pedir o numero de mandatos para distruibuir com validação
        do{
            System.out.println("Quantos mandatos tem para distribuir? ");
            verificar = sc.hasNextInt();

            if(verificar){
                numeroDeVagas = sc.nextInt();
                sc.nextLine();
                if(numeroDeVagas <= 0){
                    System.out.println("O número de mandatos tem de ser maior que zero.");
                }
            }else{
                System.out.println("Introduza um número inteiro válido.");
                sc.nextLine();
            }
        }while(!verificar || numeroDeVagas <= 0);

        //fazer uma cópia da lista dos partidos
        PriorityQueue<MetodoHondt.MetodoH> partidos = listaDePartidos.getPartidos();
        //transforma a lista num array para facilitar a interação
        MetodoHondt.MetodoH[] arrayPartidos = partidos.toArray(new MetodoHondt.MetodoH[0]);

        //cria uma priorityQueue para armazenar as vagas com seus valores para ordenação
        PriorityQueue<MetodoHondt.darVagas> copia = new PriorityQueue<>();

        // Para cada partido, calcula os valores das divisões para cada vaga possível e adiciona à PriorityQueue
        for(MetodoHondt.MetodoH p: arrayPartidos){
            for(int i = 1; i <= numeroDeVagas; i++){
                double valor = (double) p.getVotos() / i;
                copia.add(new MetodoHondt.darVagas(p, valor));
            }
        }

        // Atribui as vagas: retira da PriorityQueue os maiores valores e incrementa as vagas do partido correspondente
        for(int i = 0; i < numeroDeVagas; i++){
            MetodoHondt.darVagas q = copia.poll();
            q.partido.adicionarVagas();
        }

        //Mostrar resultados
        System.out.println("Resultado da distribuição das vagas: ");
        for(MetodoHondt.MetodoH p: arrayPartidos){
            System.out.println(p);
        }
        
        sc.close();
    }
}
