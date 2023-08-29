package roteiro3.parte1;

import java.util.Scanner;

public class Programa11 
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        double salarioBase, gratificacao, imposto, salarioResultante;
        
        System.out.println("Informe o salário base: ");
        salarioBase = entrada.nextDouble();

        /* Por ser estática, não preciso instanciar nenhum objeto. Já que estou dentro da classe */
        /* Eu poderia fazer Programa11.calcularGratificacao(salarioBase) também */
        gratificacao =  calcularGratificacao(salarioBase);

        //imposto = salarioBase * 7/100;
        imposto = calcularImposto(salarioBase);
        salarioResultante = (salarioBase + gratificacao) - imposto;

        System.out.println("Salário a receber: " + salarioResultante);
        
        entrada.close();
    }    
    
    public static double calcularGratificacao(double salarioBase)
    {
        return (salarioBase*5)/100;
    }
   
    public static double calcularImposto(double salarioBase)
    {
        return (salarioBase *7) /100;
    }
}
