package roteiro6.parte3;

public class Tempo
{
    
    
    public Tempo(int hora, int minuto, int segundo) 
    {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public Tempo(){};

    public int getHora() 
    {
        return this.hora;
    }
    public void setHora(int hora) 
    {
        this.hora = hora;
    }
    public int getMinuto() 
    {
        return this.minuto;
    }
    public void setMinuto(int minuto)
    {
        this.minuto = minuto;
    }
    public int getSegundo() 
    {
        return this.segundo;
    }
    public void setSegundo(int segundo) 
    {
        this.segundo = segundo;
    }

    /* Método que transforma hora em segundos */
    public double horasParaMinuto()
    {
        double minutos =  this.getHora() * 60;
        return minutos;
    }

    /* Método para calcular um intervalo de tempo a partir de dois horários 
     * Retorna um objeto tempo que irá conter esse intervalo.
    */
    public static Tempo calcularIntervaloDeTempo(Tempo tempoA, Tempo tempoB)
    {
        Tempo intervalo = new Tempo();
        intervalo.setHora(Math.abs(tempoA.getHora() - tempoB.getHora()));
        intervalo.setMinuto(Math.abs(tempoA.getMinuto() - tempoB.getMinuto()));
        intervalo.setSegundo(Math.abs(tempoA.getSegundo() - tempoB.getSegundo()));

        return intervalo;
    }

    /* Método que transforma minutos para segundos */
    public double minutosParaSegundo()
    {
        double segundos = this.getMinuto() * 60;
        return segundos;
    }

    public static double minutosParaSegundo(double minutos)
    {
        double segundos = minutos * 60;
        return segundos;
    }

        
    private int hora;
    private int minuto;
    private int segundo;
}
