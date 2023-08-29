package roteiro3.parte1;

import java.util.Scanner;

public class Programa12 
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        double salarioBase, gratificacao, imposto, salarioResultante;
        
        System.out.println("Informe o salário base: ");
        salarioBase = entrada.nextDouble();

        gratificacao =  calcularPorcentagem(salarioBase,5);

        imposto = calcularPorcentagem(salarioBase,7);
        salarioResultante = (salarioBase + gratificacao) - imposto;

        System.out.println("Salário a receber: " + salarioResultante);
        
        entrada.close();
    }    
    
    /* A função calcularPorcentagem receber um numero base, do qual será obtido a porcentagem
     * e a porcentagem que desejamos obter.
     */
    public static double calcularPorcentagem(double numeroBase, double porcentagem)
    {
        return (numeroBase * porcentagem)/100;
    }
   
}
