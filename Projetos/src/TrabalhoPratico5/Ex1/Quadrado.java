package TrabalhoPratico5.Ex1;

public class Quadrado extends Calculos{
    private float lado = 2;

    @Override
    public void calcArea(){
        System.out.println("Área de um quadrado: " + lado * lado);
    }

    @Override
    public void calcPerimetro(){
        System.out.println("Perímetro de um quadrado: " + 4 * lado);
    }
}
