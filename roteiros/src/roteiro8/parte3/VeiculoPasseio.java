package roteiro8.parte3;

public class VeiculoPasseio extends Veiculo
{
    /* BUILDERS */
    
    
    public VeiculoPasseio(String placa, int anoDeFabricacao, int qtdeMaxPassageiros) 
    {
        super(placa, anoDeFabricacao);
        this.qtdeMaxPassageiros = qtdeMaxPassageiros;
    }    

    /* General Functions */
    @Override
    public double calculoPedagio()
    {
        super.taxaPedagio = 5.0;

        return super.taxaPedagio * this.qtdeMaxPassageiros;
    }
    
    /* GETTERS AND SETTERS */
    public int getQtdeMaxPassageiros() {
        return qtdeMaxPassageiros;
    }

    public void setQtdeMaxPassageiros(int qtdeMaxPassageiros) {
        this.qtdeMaxPassageiros = qtdeMaxPassageiros;
    }
    
    /* ATTRIBUTES */
    private int qtdeMaxPassageiros;
}
