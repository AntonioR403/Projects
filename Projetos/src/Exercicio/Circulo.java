package Exercicio;

public class Circulo {
    private double x;
    private double y;
    private double raio;

    public Circulo(){
        this.x = 0.0;
        this.y = 0.0;
        this.raio = 1.0;
    }

    public Circulo(double x, double y, double raio){
        this.x = x;
        this.y = y;

        if(raio > 0){
            this.raio = raio;
        }else{
            this.raio = 1.0;
        }
    }

    public double getRaio(){
        return this.raio;
    }

    public double getX(){
        return this.x;
    }

    public double getY(){
        return this.y;
    }

    public double calcularPerimentro(){
        return 2 * Math.PI * this.raio;
    }

    public double calcularArea(){
        return Math.PI * Math.pow(this.raio, 2);
    }

    public void aumentarRaio(double incremento){
        if(incremento > 0){
            this.raio += incremento;
        }
    }

    public void diminuirRaio(double decremento){
        if(decremento > 0 && (this.raio - decremento) > 0){
            this.raio -= decremento;
        }
    }

    public boolean raioMaior(Circulo outro){
        return this.raio > outro.raio;
    }

    public void escreveCirculo(){
        System.out.println("centro: (" + this.x + "," + this.y + ")");
        System.out.println("Raio: " + this.raio);
        System.out.println("Perímetro: " + this.calcularPerimentro());
        System.out.println("Área: " + this.calcularArea());
        System.out.println("==========================");
    }

    public String toString(){
        return "Circulo [Centro = ("+ x + ", " + y + "), Raio=" + raio + "]";
    }
}
