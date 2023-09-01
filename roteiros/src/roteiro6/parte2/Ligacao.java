package roteiro6.parte2;

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
    private String numOrigem;
    private String numDestino;
    private String localOrigem;
    private String localDestino;
    private Tempo horaInicio;
    private Tempo horaFim;
    
}
