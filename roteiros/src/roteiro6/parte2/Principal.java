package roteiro6.parte2;

public class Principal
{
    public static void main(String[] args)
    {
        Ligacao lig01 = new Ligacao("121212", "565656", "A", "B", new Tempo(20,30,40));
        lig01.setHoraFim(new Tempo(20,35,30));
        Ligacao.printarInformacoes(lig01);
    }    
}
