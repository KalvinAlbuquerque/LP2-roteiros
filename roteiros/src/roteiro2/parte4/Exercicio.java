package roteiro2.parte4;

import java.util.Random;
import java.util.Scanner;

public class Exercicio 
{    
    public static void main(String[] args)
    {
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1;
        System.out.println("Num:" + numeroSecreto);
        Scanner entrada = new Scanner(System.in);

        while(true)
        {
            System.out.println("Tente advinhar o numero!");

            int numero = entrada.nextInt();

            if(numero == numeroSecreto)
            {
                System.out.println("Você acertou o número secreto!");
                break;
            }
            else if(numeroSecreto > numero)
            {
                System.out.println("Tente um pouco mais alto!");
            }
            else
            {
                System.out.println("Tente um pouco mais baixo!");
            }
        }

        entrada.close();
    }
}
