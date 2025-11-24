package TrabalhoPratico5.Ex1;

public class Circulo extends Calculos {
    private double raio = 2;

    @Override
    public void calcArea(){
        System.out.printf("Área de um Círculo: %.2f%n", Math.PI * raio * raio);
    }

    @Override
    public void calcPerimetro(){
        System.out.printf("Perímetro de um Círculo: %.2f%n", 2 * Math.PI * raio);
    }
}
