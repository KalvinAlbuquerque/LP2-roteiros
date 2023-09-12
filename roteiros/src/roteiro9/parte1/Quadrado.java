package roteiro9.parte1;

public class Quadrado implements FiguraGeometrica 
{
    /* BUILDERS */    
    public Quadrado(double tamanhoLado)
    {
        this.tamanhoLado = tamanhoLado;
    }

    /* GETTERS AND SETTERS */
    public double getLado() 
    {
        return this.tamanhoLado;
    }

    public void setLado(double tamanhoLado) {
        this.tamanhoLado = tamanhoLado;
    }
    
    /* GENERAL FUNCTIONS */
    @Override
    public double getArea() 
    {
        return this.tamanhoLado * this.tamanhoLado;
    }

    @Override
    public String getNomeFigura() 
    {
        return "Quadrado";
    }

    @Override
    public double getPerimetro() 
    {
        return this.tamanhoLado * 4;
    }

    @Override
    public void printarInformacoes()
    {
        System.out.println("Nome da figura: " + getNomeFigura());
        System.out.println("Area: " + getArea());
        System.out.println("Perímetro: " + getPerimetro());
        System.out.println("Tamanho de um lado: " + getLado());
    }
    
    /* ATTRIBUTES */
    private double tamanhoLado;

    
}
