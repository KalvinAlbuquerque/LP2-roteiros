package roteiro8.parte3;

public class Principal
{
  

    public static void main(String[] args)
    {
        /* Instanciando 3 clientes diferentes para que cada um tenha um veículo diferente */
        VeiculoCarga veiculoCarga = new VeiculoCarga("1111-BA", 2010, 5000);
        VeiculoPasseio veiculoPasseio = new VeiculoPasseio("2222-BA",2011, 5);
        VeiculoPequeno veiculoPequeno = new VeiculoPequeno("3333-BA", 2012, "Moto");

        Cliente cliente01 = new Cliente("1111", "Leo", "ACSO", "@uneb", "1111", veiculoCarga);
        Cliente cliente02 = new Cliente("2222", "Lucas", "ACSO", "@uneb", "2222", veiculoPasseio);  
        Cliente cliente03 = new Cliente("33333", "José", "ACSO", "@uneb", "3333", veiculoPequeno);

        /* Printando informações dos clientes - juntamento com o valor do pedágio */
        cliente01.printandoInformacoes();
        cliente02.printandoInformacoes();
        cliente03.printandoInformacoes();
        
    }

}
