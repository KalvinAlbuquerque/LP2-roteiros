package roteiro5.parte3;

public class Principal
{
    public static void main(String[] args)
    {
        Loja loja01 = new Loja("Lojão da Cidade", "Lojão Comércio LTDA", "11223344");
        Loja loja02 = new Loja("Mercado do Povo", "" , "10101010");
        Loja loja03 = new Loja("Lojão da Cidade", "Lojão Comércio LTDA", "11223344");

        loja01.setValorFat(10000);
        loja02.setValorFat(20000);
        loja03.setValorFat(10000);

        /* Não preciso utilizar o objeto para poder acessar o método estático, basta chamar a classe. */
        System.out.println(" ****** Comparação com método estático ********");
        Loja.compararFaturamentos(loja01, loja02);

        System.out.println(" \n****** Comparação com método NÃO estático ********");
        loja01.compararFaturamentosNaoStatic(loja02);

        System.out.println(" \n****** Comparação com método NÃO estático ********");
        loja02.compararFaturamentosNaoStatic(loja01);

        Loja lojaMaiorFaturamento = Loja.compararFaturamentoEntreLojas(loja02, loja03);
        System.out.println("\nLoja de Maior faturamento - Método Estático: " + lojaMaiorFaturamento.getNomeFantasia());

        lojaMaiorFaturamento = loja01.compararFaturamentoEntreLojasNaoEstatico(loja02);
        System.out.println("\nLoja de Maior faturamento - Método Não Estático: " + lojaMaiorFaturamento.getNomeFantasia());



    }   
}
