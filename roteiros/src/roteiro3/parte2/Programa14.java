package roteiro3.parte2;

import java.util.Scanner;

public class Programa14 
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        /* Solicitando primeiro operando */
        System.out.println("Digite o primeiro operando");
        double x = entrada.nextDouble();

        /* Solicitando operador */
        System.out.println("Digite qual operação deseja realizar (+, - , *, /)");
        String operador = entrada.next();

        /* Solicitando ultimo operando */
        System.out.println("Digite o segundo operando");
        double y = entrada.nextDouble();

        System.out.println(calculadora(operador,x,y));

        entrada.close();
    }

    /* Função que recebe um operador e dois operandos e retorna um double como resultado da operação*/
    static double calculadora(String operador, double x, double y)
    {
        double resultado =0;
        switch(operador)
        {
            case "+":
            {
                resultado = x + y;
                break;
            }
            case "-":
            {
                resultado = x-y;
                break;
            }
            case "*":
            {
                resultado = x * y;
                break;
            }
            case "/":
            {
                resultado = x / y;
                break;
            }
            default:
            {
                System.out.println("Operação inválida");
            }
        }

        return resultado;
    }
}
