package roteiro6.parte3;

public class Principal
{
    public static void main(String[] args)
    {
        Ligacao lig01 = new Ligacao("121212", "565656", "A", "B", new Tempo(20,30,40));
        lig01.setHoraFim(new Tempo(21,35,30));
        Ligacao.printarInformacoes(lig01);

        Ligacao lig02 = new Ligacao("1", "2", "A", "B", new Tempo(10,20,30));
        lig02.setHoraFim(new Tempo(10,22,51));
        
        /* Teste para verificar se as funções "calcularIntervaloDeTempo , calcularLigacao e horasParaMinuto estão funcionando" */
        Tempo duracaoLig02 = Tempo.calcularIntervaloDeTempo(lig02.getHoraInicio(), lig02.getHoraFim());
        double minutosDeLigacao = duracaoLig02.getMinuto() + duracaoLig02.horasParaMinuto();

        System.out.println("Quantidade de minutos da Ligacação: " + minutosDeLigacao);

        /* Utilizando o primeiro método de cálculo do valor da ligação */
        System.out.println("Valor da ligacação: " + Ligacao.calcularMinutosDeLigacao(lig02));

        /* Utiliziando o segundo método de cálculo do valor da ligação */
        System.out.println("Valor da ligação: " + Ligacao.calcularSegundosDeLigacao(lig02));
    }    
}
