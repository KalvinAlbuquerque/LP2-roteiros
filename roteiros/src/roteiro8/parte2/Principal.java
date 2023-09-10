package roteiro8.parte2;

public class Principal
{
    /* Polimorfismo 
    * Habilidade de objetos de classes diferentes responderem a mesma mensagem de diferentes maneiras.

    * Sobrecarga(Overload):
    * Métodos com o mesmo nome, mas com diferentes parâmetros

    * Sobreposição(Overrride):
    * Herança: conceito de POO que permite que as classes compartilhem atributos ou métodos através de "heranças".
    * Usada na intenção de reaproveitar código. As classes filhas(subclasses) irão herdar atributos ou métodos da 
    * classe mãe(superClasse)
    *
    * A sobreposição entra ai, quando uma classe filha, que herdou um método da classe mãe, pode sobreescreer/implementar
    * novamente este método para que ela tenha um comportamento diferente do que a implementação da classe mãe que possui
    * o mesmo nome.
    *
    * Para fazer uma classe herdar de outra , no Java, usamos o comando extends. ClasseFilha extends ClassePai
    */    

    public static void main(String[] args)
    {
        //Veiculo v01 = new Veiculo("11111-BA", 2010);
        VeiculoCarga v02 = new VeiculoCarga("2222-BA", 2011, 5000);
        VeiculoPasseio v03 = new VeiculoPasseio("33333-BA", 2012, 5);
        VeiculoPequeno v04 = new VeiculoPequeno("444444-BA", 2015, "moto");

        v02.printandoInformacoes();
        System.out.println("Peso máximo: " + v02.getPesoMax());
        System.out.println("Pedágio V02: " + v02.calculoPedagio());

        v03.printandoInformacoes();
        System.out.println("Quantidade Máxima de Passageiros: " + v03.getQtdeMaxPassageiros());
        System.out.println("Pedágio V03: " + v03.calculoPedagio());

        v04.printandoInformacoes();
        System.out.println("Modelo do veículo: " + v04.getModelo());
        System.out.println("Pedágio V04: " + v04.calculoPedagio());
    }

}
