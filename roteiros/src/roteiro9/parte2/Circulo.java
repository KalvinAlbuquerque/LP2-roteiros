package roteiro9.parte2;


public class Circulo implements FiguraGeometrica
{

    /* BUILDERS */
    public Circulo(double raio) 
    {
        this.raio = raio;
    }

    /* GETTERS AND SETTERS */    
    public double getRaio() 
    {
        return this.raio;
    }
    

    public void setRaio(double raio) 
    {
        this.raio = raio;
    }

    /* GENERAL FUNCTIONS */
    

    /* ATTRIBUTES */
    private double raio;

    @Override
    public double getArea() 
    {

        return this.raio * Math.PI;
    }

    @Override
    public String getNomeFigura()
    {
        return "Círculo";
    }

    @Override
    public double getPerimetro() {

        return 2*(Math.PI * this.raio);
    }

    @Override
    public void printarInformacoes() 
    {
        System.out.println("Nome da figura: " + getNomeFigura());
        System.out.println("Area: " + getArea());
        System.out.println("Perímetro: " + getPerimetro());
        System.out.println("Raio: " + getRaio());    
    }
    
}
