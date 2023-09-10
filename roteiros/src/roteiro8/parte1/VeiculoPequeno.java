package roteiro8.parte1;

public class VeiculoPequeno extends Veiculo
{
    /* BUILDERS */
    public VeiculoPequeno(String placa, int anoDeFabricacao, String modelo)
    {
        super(placa, anoDeFabricacao);
        this.modelo = modelo;
    }    

    /* GETTERS AND SETTERS */
    public String getModelo() {
        return modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
        /* ATTRIBUTES */
        private String modelo;
}
