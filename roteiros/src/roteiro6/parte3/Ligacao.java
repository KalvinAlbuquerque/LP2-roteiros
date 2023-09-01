package roteiro6.parte3;

public class Ligacao 
{
    
    
    public Ligacao(String numOrigem, String numDestino, String localOrigem, String localDestino, Tempo horaInicio) 
    {
        this.numOrigem = numOrigem;
        this.numDestino = numDestino;
        this.localOrigem = localOrigem;
        this.localDestino = localDestino;
        this.horaInicio = horaInicio;
        this.horaFim = null;
    }
    public String getNumOrigem() 
    {
        return this.numOrigem;
    }
    public void setNumOrigem(String numOrigem) 
    {
        this.numOrigem = numOrigem;
    }
    public String getNumDestino()
    {
        return this.numDestino;
    }
    public void setNumDestino(String numDestino)
    {
        this.numDestino = numDestino;
    }
    public String getLocalOrigem()
    {
        return this.localOrigem;
    }
    public void setLocalOrigem(String localOrigem) 
    {
        this.localOrigem = localOrigem;
    }
    public String getLocalDestino() 
    {
        return this.localDestino;
    }
    public void setLocalDestino(String localDestino) 
    {
        this.localDestino = localDestino;
    }
    public Tempo getHoraInicio() 
    {
        return this.horaInicio;
    }
    public void setHoraInicio(Tempo horaInicio) 
    {
        this.horaInicio = horaInicio;
    }
    public Tempo getHoraFim() 
    {
        return this.horaFim;
    }
    public void setHoraFim(Tempo horaFim) 
    {
        this.horaFim = horaFim;
    }
    
    /* Método para printar informações da ligação */
    public static void printarInformacoes(Ligacao ligacao)
    {
        System.out.println("Número de origem: " + ligacao.getNumOrigem());
        System.out.println("Número de destino: " + ligacao.getNumDestino());
        System.out.println("Local de origem: " + ligacao.getLocalOrigem());
        System.out.println("Local de destino: " + ligacao.getLocalDestino());
        System.out.println("Hora de início: " + ligacao.getHoraInicio().getHora() + ":" + ligacao.getHoraInicio().getMinuto() + ":" + ligacao.getHoraInicio().getSegundo());
        System.out.println("Hora de fim: " + ligacao.getHoraFim().getHora() + ":" + ligacao.getHoraFim().getMinuto() + ":" + ligacao.getHoraFim().getSegundo());
    }

    /* Método para verificar se um número faz parte da ligacação (É o número de origem ou o de destino) */
    public void numeroFazParteDaLigacao(String numero)
    {
        if(numero == this.getNumDestino())
        {
            System.out.println("É o número de destino");
        }
        else if(numero == this.getLocalOrigem())
        {
            System.out.println("É o número de origem");
        }
        else
        {
            System.out.println("Esse número não faz parte da ligacação");
        }
    }

    /* Método para calcular o valor dos minutos da ligacação */
    public static double calcularMinutosDeLigacao(Ligacao ligacao)
    {
        double valorMinuto = 1.0;

        /* Calculando a duração da ligacação */
        Tempo duracaoLigacao = Tempo.calcularIntervaloDeTempo(ligacao.getHoraInicio(), ligacao.getHoraFim());

        /*Transformando as horas em minutos de ligação*/
        double minutosDeLigacao = duracaoLigacao.horasParaMinuto() + duracaoLigacao.getMinuto();

        /* Calculando o valor da ligação */
        double valorDaLigacao = valorMinuto*minutosDeLigacao;

        return valorDaLigacao;
    }

    /* Método que calcula o valor de até 20 segundos de ligacação */
    public static double calcularSegundosDeLigacao(Ligacao ligacao)
    {
        double valorMinuto = 1.0; 

        /* Calculando o tempo de duração da ligacação */
        Tempo duracaoLigacao = Tempo.calcularIntervaloDeTempo(ligacao.getHoraInicio(),ligacao.getHoraFim()); 

        /* Calculando os minutos da ligação */
        double minutosLigacao = duracaoLigacao.horasParaMinuto() + duracaoLigacao.getMinuto();

        double valorLigacao = 0;
        if(duracaoLigacao.getSegundo() >= 20 && duracaoLigacao.getMinuto() < 1)
        {
            valorLigacao = 1.0;
        } 
        else if(duracaoLigacao.getSegundo() >= 20 && minutosLigacao > 0)
        {
            valorLigacao = minutosLigacao * valorMinuto;
        }

        return valorLigacao;    
    }



    private String numOrigem;
    private String numDestino;
    private String localOrigem;
    private String localDestino;
    private Tempo horaInicio;
    private Tempo horaFim;
    
}
