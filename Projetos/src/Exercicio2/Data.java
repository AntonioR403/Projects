package Exercicio2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class Data implements Cloneable{
    private int dia;
    private int mes;
    private int ano;

    private static int contadorDatas = 0;
    //construtor
    public Data(){
        //Uso de this como referência
        this.dia = 1;
        this.mes = 1;
        this.ano = 1900;
        contadorDatas++;
    }

    //método para ler a variavel de classe
    public static int getContadorDatas(){
        return contadorDatas;
    }

    //getters
    public int getDia(){
        return this.dia;
    }

    public int getMes(){
        return this.mes;
    }

    public int getAno(){
        return this.ano;
    }

    //setters 
    public void setDia(int novoDia){
        this.dia = novoDia;
    }

    public void setMes(int novoMes){
        this.mes = novoMes;
    }

    public void setAno(int novoAno){
        this.ano = novoAno;
    }

    //construtor de copia
    public Data(Data novaData){
        this.dia = novaData.dia;
        this.mes = novaData.mes;
        this.ano = novaData.ano;
    }

    public boolean isAnoBissexto(int ano){
        return (this.ano % 4 == 0 && this.ano % 100 != 0) || (this.ano % 400 == 0);
    }
    /// Verifica se uma data (dia, mês, ano) é válida conforme as regras do calendário
    public boolean verificarData(int dia, int mes, int ano){
        // Verifica se o ano está dentro de um intervalo válido
        if(ano < 1900 || ano > 2100){
            return false;
        }

        // Verifica se o mês é válido
        if(mes < 1 || mes > 12){
            return false;
        }

        // Verifica se o dia é válido em geral (1-31)
        if(dia < 1 || dia > 31){
            return false;
        }

        // Verificações específicas para fevereiro
        if(mes == 2){
            if(dia > 29){
                return false;
            }

            if(dia == 29 && isAnoBissexto(ano)){
                return false;
            }
        }

        //meses com 30 dias
        if((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30){
            return false;
        }

        return true;
    }

    //método toString
    @Override
    public String toString(){
        return dia + "/" + mes + "/" + ano;
    }

    //método clone
    public Data clone(){
        try{
            return (Data) super.clone();
        }catch(CloneNotSupportedException e){
            throw new RuntimeException("Não para realizar a copia da data.");
        }
    }

    //método equals
    public boolean equals(Object obj){
        //use de this como método
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        
        Data outra = (Data) obj;

        return this.dia == outra.dia && this.mes == outra.mes && this.ano == outra.ano;
    }

    //método para mudar o valor da variaveis para a data atual do sistema do computador
    public void setDataAtual(){
        LocalDate DataAtual = LocalDate.now();
        this.dia = DataAtual.getDayOfMonth();
        this.mes = DataAtual.getMonthValue();
        this.ano = DataAtual.getYear();
    }

    // Método para calcular os dias entre a data base (01/01/1900) e a data atual do objeto
    public long calcularDias(){
        LocalDate dataInicial = LocalDate.of(1900, 1, 1);
        LocalDate dataAtual = LocalDate.of(this.ano, this.mes, this.dia);

        return ChronoUnit.DAYS.between(dataInicial, dataAtual);
    }

    // Verifica se o ano do objeto é bissexto (divisível por 4)
    public void verificarAnoBisexto(){
        if((isAnoBissexto(this.ano))){
            System.out.println("O ano introduzido é Bissexto.");
        }else{
            System.out.println("O ano introduzido não é Bissexto");
        }
    }

    //método para formatar a data
    public String formatarData(){
        LocalDate dataIntroduzida = LocalDate.of(this.ano, this.mes, this.dia);
        
        DateTimeFormatter formatoNumerico = DateTimeFormatter.ofPattern("d/M/yyyy");
        
        DateTimeFormatter formatoEscrito = DateTimeFormatter.ofPattern("d 'de' MMMM 'de' yyyy", new Locale("pt", "PT"));

        return dataIntroduzida.format(formatoNumerico) + "\n" + dataIntroduzida.format(formatoEscrito);
    }
}
