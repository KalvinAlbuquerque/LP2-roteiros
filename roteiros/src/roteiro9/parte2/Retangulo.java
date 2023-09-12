package roteiro9.parte2;

public class Retangulo implements FiguraGeometrica 
{
    
    /* BUILDERS */
    public Retangulo(double altura, double largura) 
    {
        this.altura = altura;
        this.largura = largura;
    }

    /* GETTERS AND SETTERS */
    public double getAltura() 
    {
        return this.altura;
    }
    public void setAltura(double altura) 
    {
        this.altura = altura;
    }
    public double getLargura() 
    {
        return this.largura;
    }
    public void setLargura(double largura) 
    {
        this.largura = largura;
    }

    /* GENERAL FUNCTIONS */
    @Override
    public double getArea() 
    {
        return this.altura*this.largura;
    }
    @Override

    public String getNomeFigura() 
    {
        return "Retangulo";
    }

    @Override
    public double getPerimetro() 
    {
        return (this.largura *2) + (this.altura*2);
    }

    @Override
    public void printarInformacoes()
    {
        System.out.println("Nome da figura: " + getNomeFigura());
        System.out.println("Area: " + getArea());
        System.out.println("Perímetro: " + getPerimetro());
        System.out.println("Altura: " + getAltura());
        System.out.println("Largura: " + getLargura());
    }

    /* ATTRIBUTES */
    private double altura;
    private double largura;
}
