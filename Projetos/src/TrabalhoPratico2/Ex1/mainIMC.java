package TrabalhoPratico2.Ex1;

import java.util.Scanner;

public class mainIMC{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        IMC imc = new IMC();
        String nome;
        float peso, altura;

        System.out.print("Nome: ");
        nome = sc.nextLine();
        System.out.print("Altura: ");
        altura = sc.nextFloat();
        System.out.print("Peso: ");
        peso = sc.nextFloat();

        imc.setNome(nome);
        imc.setAltura(altura);
        imc.setPeso(peso);

        System.out.println(imc.calcularIMC());

        System.out.println(imc);

        sc.close();
    }
}