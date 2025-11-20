package Exercicio;

public class ConstruiCirculo {
    public static void main (String args[]){
        Circulo c1 = new Circulo(1.0, 1.0, 5.0);
        Circulo c2 = new Circulo(5.0, 2.0, 3.0);

        System.out.println("Antes das alterações:");
        System.out.println("Circulo 1 - perimentro: " + c1.calcularPerimentro());
        System.out.println("Circulo 1 - área: " + c1.calcularArea());

        System.out.println("Circulo 2 - perimentro: " + c2.calcularPerimentro());
        System.out.println("Circulo 2 - área: " + c2.calcularArea());

        c1.aumentarRaio(2.0);
        c2.diminuirRaio(1.5);

        System.out.println("\nApós alterações:");
        c1.escreveCirculo();
        c2.escreveCirculo();

        if(c1.raioMaior(c2)){
            System.out.println("o raio do circulo 1 é maior que o raio do circulo 2.");
        }else {
            System.out.println("o raio do circulo 1 é menor que o raio do ciruclo 2.");
        }

        System.out.println(c1);
        System.out.println(c2);
    }
}
