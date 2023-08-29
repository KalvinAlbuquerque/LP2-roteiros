package roteiro5.parte1;

public class Loja 
{
    /* 
     * Não podemos usar o this para acessar os métodos ou atributos estáticos
     */
    public Loja(String nomeFantasia, String razaoSocial, String cnpj, String nomePropietario, double valorFat, double area)
    {
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
        this.nomeProprietario = nomePropietario;
        this.area = area;
        this.valorFat = valorFat;

        if(razaoSocial.equals(""))
        {
            this.razaoSocial = nomeFantasia;
        }
        else
        {
            this.razaoSocial = razaoSocial;
        }
    }
    
    public void setNomeFantasia(String nomeFantasia)
    {
        this.nomeFantasia = nomeFantasia;
    }
    public String getNomeFantasia()
    {
        return this.nomeFantasia;
    }
    
    public void setRazaoSocial(String razaoSocial)
    {
        this.razaoSocial = razaoSocial;
    }
    public String getRazaoSocial()
    {
        return this.razaoSocial;
    }
    
    public void SetCnpj(String cnpj)
    {
        this.cnpj = cnpj;
    }
    public String getCnpj()
    {
        return this.cnpj;
    }
    
    public void SetValorFat(double valorFat)
    {
        this.valorFat = valorFat;
    }
    public double getValorFat()
    {
        return this.valorFat;
    }
    
    public void setArea(double area)
    {
        this.area = area;
    }
    public double getArea()
    {
        return this.area;
    }
    
    public void setNomePropietario(String nomeProprietario)
    {
        this.nomeProprietario = nomeProprietario;   
    }
    public String getNomePropietario()
    {
        return this.nomeProprietario;
    }

    /* Função que recebe uma loja como parâmetro e printa todas as suas informações */
    public void printarInformacoes(Loja loja)
    {
        System.out.println("\nNome Fantasia: " + loja.nomeFantasia);
        System.out.println("Razão Social: " + loja.razaoSocial);
        System.out.println("Cnpj: " + loja.cnpj);
        System.out.println("Nome do Proprietário: " + loja.nomeProprietario);
        System.out.println("Valor Faturamento:" + loja.valorFat);
        System.out.println("Área: " + loja.area);
    }
    
    private String nomeFantasia;
    private String razaoSocial;
    private String cnpj;
    private double valorFat;
    private double area;
    private String nomeProprietario;        
}
