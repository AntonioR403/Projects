package TrabalhoPratico3;

public class Principal {
    
    public static void main(String[] args) {
        Motor m = new Motor("Mercedes", 2.0);
        Terrestre a = new Terrestre(2001, "Toyota", "Corolla", 21000, "gasolina", "2.7", "Rodas Traseiras", m);
        Aquatico g = new Aquatico(2001, "Iate", "Grande", 2100, null, "compasso", "sim", "sim", "Por vela");

        System.out.println("Veículo Terrestre: ");
        System.out.println(a.toString());
        System.out.println("Veículo Aquatico: ");
        System.out.println(g.toString());
    }
}
