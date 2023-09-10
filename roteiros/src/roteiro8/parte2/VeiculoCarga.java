package roteiro8.parte2;

public class VeiculoCarga extends Veiculo
{
    /* Builders */
    VeiculoCarga(){};
    
    public VeiculoCarga(String placa, int anoDeFabricacao, int pesoMax) 
    {
        super(placa, anoDeFabricacao);
        this.pesoMax = pesoMax;
    }

    public VeiculoCarga(int pesoMax) 
    {
        this.pesoMax = pesoMax;
    }

    /* GENERAL FUNCTIONS */

    /* Quando coloco @Override, ele sobreescreve a próxima função */
    @Override
    public double calculoPedagio()
    {
        /* Lembre-se que 'super' me faz acessar a classe pai. Logo Super() me faz acessar o construtor da classe pai */
        super.taxaPedagio = 2.0;
        
        return super.taxaPedagio * this.pesoMax;
    }

    /* GETTERS AND SETTERS */
    public int getPesoMax() {
        return pesoMax;
    }
    
    
    public void setPesoMax(int pesoMax) {
        this.pesoMax = pesoMax;
    }    
    
    /* ATTRIBUTES */
    private int pesoMax;

}
