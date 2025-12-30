package TrabalhoPratico8;

public class Teste {
    public static void main (String[] Args){
        //criar utilizador
        Utilizador utilizador = new Utilizador("António");

        //criar divisões da casa
        Divisoes sala = new Divisoes("Sala");
        Divisoes quarto = new Divisoes("Quarto");

        //criar dispositivos
        IluminacaoAdaptativa luzSala = new IluminacaoAdaptativa("Luz Sala", 1, false, 10, 0, "App");
        Climatizacao arQuarto = new Climatizacao("Ar Quarto", 2, false, 1200, 0, "App", "Wi-Fi", "192.168.1.12");
        CamaraVigilancia camaraSala = new CamaraVigilancia("Camara Sala", 3, false, 5, 0, "App", "1800p");
        SensorAmbiental sensorSala = new SensorAmbiental("Sensor Sala", 4, true, 2, 0, "App");

        sensorSala.setDados(24.1, 50.0);

        //Adiconar dispositivo a divisao
        sala.adicionarDispositivos(luzSala);
        sala.adicionarDispositivos(sensorSala);
        sala.adicionarDispositivos(camaraSala);
        quarto.adicionarDispositivos(arQuarto);

        //Criar casa
        Casa minhCasa = new Casa("Casa do António");
        minhCasa.adicionarDivisao(sala);
        minhCasa.adicionarDivisao(quarto);

        //Ativar Modos
        System.out.println("---Modo Eco---");
        minhCasa.ativarModoEco();

        System.out.println("---Modo Ferias---");
        minhCasa.activarModoFerias();

        System.out.println("---Modo Noturno---");
        minhCasa.activarModoNoturno();

        //simulacao de consumo
        int horasPorDia = 6;
        int dias = 7;
        double consumoSala = utilizador.consultarConsumo(sala, horasPorDia, dias);
        double consumoQuarto = utilizador.consultarConsumo(quarto, horasPorDia, dias);

        System.out.println("Consumo Sala: " + consumoSala + " kwh");
        System.out.println("Consumo Quarto: " + consumoQuarto + " kwh");

        //Mostrar estado final das divisões e dispositivos
        System.out.println("---Estado final das Divisões---");
        minhCasa.listarDispositivos();

        //Consultar historico de ações do utilizador
        System.out.println("---Histórico de Ações---");
        utilizador.consultarHistorico();
    }
}
