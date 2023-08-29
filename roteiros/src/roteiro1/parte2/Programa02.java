package roteiro1.parte2;

public class Programa02 {

    public static void main(String[] args)
    {

        /* Dados para calcular o salário total do funcionário  */
        double salarioBase = 2500.0; 
        double horasTotais = 40.0;
        double valorHoraExtra = salarioBase/horasTotais;
        int numHorasExtras = 10;

        /* Calculando o salário total do funcionário */
        double salario_total = salarioBase + (valorHoraExtra * numHorasExtras); 

        /* Prints */
        System.out.println("Salário base: " + salarioBase);
        System.out.println("Horas extras trabalhadas: " + numHorasExtras);
        System.out.println("Valor da hora extra: " + valorHoraExtra);
        System.out.println("Salário Total: " + salario_total);
    }
        
}
