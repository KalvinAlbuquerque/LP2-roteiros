package roteiro8.parte2;

/* Classes abstratas são somente moldes, não podem ser instanciadas, apenas herdadas.
 * Em outras palavras, são apenas modelos de onde outras classes vão herdar, não podemos criar objetos de uma classe abstrata.
 */
public abstract class Veiculo
{
    /* Builders */
    
    public Veiculo(){};
    
    public Veiculo(String placa, int anoDeFabricacao) {
        this.placa = placa;
        this.anoDeFabricacao = anoDeFabricacao;
    }

    /* General Functions */
    public void printandoInformacoes()
    {
        System.out.println("Placa: " + this.getPlaca());
        System.out.println("Ano de fabricação: " + this.getAnoDeFabricacao());
    }

    public double calculoPedagio()
    {
        return this.taxaPedagio;
    }

    /* GETTERS AND SETTERS */
    public String getPlaca() {
        return placa;
    }
    
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    public int getAnoDeFabricacao() {
        return anoDeFabricacao;
    }
    
    public void setAnoDeFabricacao(int anoDeFabricacao) {
        this.anoDeFabricacao = anoDeFabricacao;
    }
    
    /* ATTRIBUTES */
    private int anoDeFabricacao;
    private String placa;

    /* Protected -> somente classes filhas vão poder ter acesso ao atributo */
    protected double taxaPedagio = 6.0;
    
}
