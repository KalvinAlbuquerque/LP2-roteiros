package roteiro5.parte2;

public class Principal
{
    public static void main(String[] args)
    {
        Loja loja01 = new Loja("Lojão da Cidade", "Lojão Comércio LTDA", "11223344");
        Loja loja02 = new Loja("Mercadão do Povo", "", "10101010");
        Loja loja03 = new Loja("Lojão da Cidade", "Lojão Comércio LTDA", "11223344");

        loja01.printarInformacoes(loja01);
        loja02.printarInformacoes(loja02);

        loja01.setValorFat(10000);
        loja02.setValorFat(20000);
        loja03.setValorFat(10000);

        /* Verficando se os nomes fantasias da loja 1 e 3 são iguais e printando de acordo 
         * A saída obviamente é "lojas iguais", pois os nomes fantasias são iguais
        */

        System.out.println(" \n****** Teste 1 ********");
        if ( loja01.getNomeFantasia() == loja03.getNomeFantasia() ){
            System.out.println("Lojas Iguais");
        }
        else {
            System.out.println("Lojas Diferentes");
        }
  
        /* Verficando se os nomes fantasias da loja 1 e 3 são iguais e printando de acordo 
         * A saída é "Lojas iguais"
         * O equals compara o conteúdo dos objetos e não se a referência é a mesma
        */
        System.out.println(" \n****** Teste 2 ********");
        if ( loja01.getNomeFantasia().equals(loja03.getNomeFantasia())  ){
            System.out.println("Lojas Iguais");
        }
        else {
            System.out.println("Lojas Diferentes");
        }
         
        /* Verificando se os objetos Loja1 e Loja3 apontam para a mesma referência, ou seja, 
         * se apontam para o mesmo endereço de memória. Caso o endereço de memória sejam diferentes,
         * retorna false. Que é o caso, em que a saída é "Lojas diferentes"
         */
        System.out.println(" \n****** Teste 3 ********");
        if ( loja01 == loja03  ){
            System.out.println("Lojas Iguais");
        }
        else {
            System.out.println("Lojas Diferentes");
        }
         
        /* Aqui deveria retornar "Lojas iguais", já que o método equals retorna true se o conteúdo dos objetos for iguais.
         * Entretanto está retornando "lojas diferentes" - perguntar ao professor.
         */
        System.out.println(" \n****** Teste 4 ********");
        if ( loja01.equals(loja03)  ){
            System.out.println("Lojas Iguais");
        }
        else {
            System.out.println("Lojas Diferentes");
        }
  
        /* Verifica se o valor de faturamente das duas lojas são iguais
         * A saída é "Faturamento iguais"
         */
        System.out.println(" \n****** Teste 5 ********");
        /*Não posso usar o equals, pois estou comparando doubles - um tipo primitivo.
        * E double não é um objeto (Object) logo não herda o método "equals"
        */
        //if(loja01.getValorFat().equals(loja03.getValorFat()))
        if ( loja01.getValorFat() == loja03.getValorFat()  )
        {
            System.out.println("Faturamentos Iguais");
        }
        else {
            System.out.println("Faturamentos Diferentes");
        }
  
    }   
}
