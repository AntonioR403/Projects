package TrabalhoPratico5.Ex1;

public class MostrarResultados {
    public static void main(String[] args) {
        Calculos C = new Circulo();
        Calculos Q = new Quadrado();
        Calculos T = new Triangulo();

        C.calcArea();
        C.calcPerimetro();

        Q.calcArea();
        Q.calcPerimetro();

        T.calcArea();
        T.calcPerimetro();
    }
}
