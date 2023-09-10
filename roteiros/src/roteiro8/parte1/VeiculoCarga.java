package roteiro8.parte1;

public class VeiculoCarga extends Veiculo
{
    /* Builders */
    VeiculoCarga(){};

    
    /* Como havia o construtor na classe pai, a classe filha o mesmo método  */
    public VeiculoCarga(String placa, int anoDeFabricacao, int pesoMax) 
    {
        /* Super() é uma chamada, realizada pelas classes filhas, do construtor da classe pai, assim a classe pai é 
         * inicializada antes da classe filha.
         * 
         * O compilador sempre irá colocar o super() mesmo que você não informe, nesse caso provavelmente ele irá 
         * inicializar o construtor default.
         * 
         * Você pode escolher qual construtor deseja usar para iniciar a classe pai, basta mudar os parâmetros 
         */
        super(placa, anoDeFabricacao);
        this.pesoMax = pesoMax;
    }

    /* Aqui por exemplo, estou escolhendo o construtor default do Veiculo. 
     * Embora não tenha a chamada com o Super, o compilador irá inicializar por default a classe pai.
     */
    public VeiculoCarga(int pesoMax) 
    {
        this.pesoMax = pesoMax;
    }
    /* GETTERS AND SETTERS */
    



    /* ATTRIBUTES */
    private int pesoMax;

    public int getPesoMax() {
        return pesoMax;
    }


    public void setPesoMax(int pesoMax) {
        this.pesoMax = pesoMax;
    }    


}
