package roteiro5.parte3;

public class Loja 
{
    /* 
     * Não podemos usar o this para acessar os métodos ou atributos estáticos
     */
    public Loja(String nomeFantasia, String razaoSocial, String cnpj)
    {
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }

    public Loja(String nomeFantasia, String cnpj)
    {
        /* Posso chamar o construtor usando o this, é como se eu estivesse chamando a classe.*/
        this(nomeFantasia, nomeFantasia, cnpj);
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
    
    public void setCnpj(String cnpj)
    {
        this.cnpj = cnpj;
    }
    public String getCnpj()
    {
        return this.cnpj;
    }
    
    public void setValorFat(double valorFat)
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

    /* Métodos para comparar faturamentos entre lojas e printá-los */
    public static void compararFaturamentos(Loja lojaA, Loja lojaB)
    {
        if(lojaA.getValorFat() > lojaB.getValorFat())   
        {
            System.out.println("Loja de maior faturamento: " + lojaA.nomeFantasia);
        }
        else
        {
            System.out.println("Loja de maior faturamento: " + lojaB.nomeFantasia);
        }
    }

    public void compararFaturamentosNaoStatic(Loja lojaB)
    {
        /* Basta dar um this.método/atributo que estou me referindo ao objeto que está rodando essa função */
        if(this.getValorFat() > lojaB.getValorFat())   
        {
            System.out.println("Loja de maior faturamento: " + this.nomeFantasia);
        }
        else
        {
            System.out.println("Loja de maior faturamento: " + lojaB.nomeFantasia);
        }
    }

    /* Métodos que retornam a Loja com maior faturamento */
    public static Loja compararFaturamentoEntreLojas(Loja lojaA, Loja lojaB)
    {
        if(lojaA.getValorFat() > lojaB.getValorFat())
        {
            return lojaA;
        }
        else
        {
            return lojaB;
        }
    }

    public Loja compararFaturamentoEntreLojasNaoEstatico(Loja lojaA)
    {
        if(this.getValorFat() > lojaA.getValorFat())
        {
            return this;
        }
        else
        {
            return lojaA;
        }
    }
    
    private String nomeFantasia;
    private String razaoSocial;
    private String cnpj;
    private double valorFat;
    private double area;
    private String nomeProprietario;        
}
