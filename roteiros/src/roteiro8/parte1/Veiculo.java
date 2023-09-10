package roteiro8.parte1;

/* Classes abstratas são somente moldes, não podem ser instanciadas, apenas herdadas.
 * Em outras palavras, são apenas modelos de onde outras classes vão herdar, não podemos criar objetos de uma classe abstrata.
 */
public abstract class Veiculo
{
    /* Builders */
    
    Veiculo(){};
    
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
    
}
