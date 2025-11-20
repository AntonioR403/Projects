package TrabalhoPratico4;

import java.util.ArrayList;

public class InserirAparelho {
    public static void main(String[] args) {

        //Criar Teclado
        Teclado tecl1 = new Teclado("Teclado TUF Gaming", 59.99, "Asus", "DD77P98"
        , 5001, "USB", "Sim", "Layout PT- pt");

        //Criar Monitor
        Monitor mt1 = new Monitor("Monitor Gaming 27G2ZNE", 172.99, "AOC", "MO78NI77TOR", 6001, 240, "1900x1200"
        , "E", "DisplayPort e HDMI", "formato", "22 Polegadas");

        //Criar um Rato padrão
        Rato r1 = new Rato();

        //Criação de computadores
        Computador c1 = new Computador("Portátil Gamer", 1199.99, "Asus", "PC001", 1001, "Intel i7"
        , "16GB", "RTX 4060", "DDR5", 16, r1, tecl1, mt1);

        Computador c2 = new Computador("Portátil Gamer", 1199.99, "Asus", "PC001", 1001, "Intel i7"
        , "16GB", "RTX 4060", "DDR5", 16, r1, tecl1, mt1);

        //Criar Telemóvel
        Telemovel t1 = new Telemovel("iPhone 14",999.99, "Apple", "TM001",3001, "A15", "IOS"
        , "A++", "6.1", "6GB", "12MP", "3000mAh");

        //Criar Tablet
        Tablet tab1 = new Tablet("iPad Pro", 1200.99, "Apple", "TB001", 4001, "M1", "128GB"
        , "Apple Pencil", "8GB", "iPadOS", "7500mAh");
        
        //Lista para armazenar todos os aparelhos
        ArrayList<Tecnologia> produtosList = new ArrayList<>();
        produtosList.add(c1);
        produtosList.add(c2);
        produtosList.add(t1);
        produtosList.add(tab1);

        //imprimir os aparelhos utilizando o método print()
        for(Tecnologia t : produtosList){
            t.print();
            System.out.println("------------------------------------------------------------------------------------------------------------");
        }

        //verificar se existe duplicados de um aparelho
        for(int i = 0; i < produtosList.size(); i++){
            for(int j = i + 1; j < produtosList.size(); j++){
                Tecnologia p1 = produtosList.get(i);
                Tecnologia p2 = produtosList.get(j);

                if(p1.equals(p2)){
                    System.out.println("Exemplo para o Equals");
                    System.out.println(p1.getNome() + " e " + p2.getNome() + " tem o mesmo nome e código de barras.");
                    System.out.println("-------------------------------------------------------------------");
                }
            }
        }

        System.out.println("Exemplo de clone");

        //clonar o telemovel
        Telemovel tOriginal = t1;
        Telemovel tClone = tOriginal.clone();

        System.out.println("Telemóvel Original: ");
        tOriginal.print();
        System.out.println("\nTelemóvel Clonado: ");
        tClone.toString();

        System.out.println("---------------------------------------");

        //Criar e imprimir um setup de computador completo
        ComputadorSetup meuSetup = new ComputadorSetup();
        meuSetup.printSetup();
    }
}