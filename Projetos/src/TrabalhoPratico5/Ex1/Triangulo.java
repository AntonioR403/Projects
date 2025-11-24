package TrabalhoPratico5.Ex1;

public class Triangulo extends Calculos{
    private float lado1 = 3;
    private float lado2 = 4;
    private float lado3 = 5;
    private float base = 3;
    private float altura = 4;

    @Override
    public void calcArea(){
        System.out.println("A área de um Triângulo: " + (lado1 + lado2 + lado3));
    }

    @Override
    public void calcPerimetro(){
        System.out.println("O perímetro de um Triângilo: " + (base * altura) / 2);
    }
}
