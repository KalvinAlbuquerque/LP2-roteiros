package roteiro2.parte3;

import java.util.Scanner;

public class Programa04 
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        int cont = 0;
        while(cont < 5)
        {
            System.out.println("Informe uma nota ");
            int nota = entrada.nextInt();

            if(nota >= 7)
            {
                System.out.println("Aprovado");
            }
            else
            {
                System.out.println("Reprovado");
            }
        
            cont++;
        }

        /* Faltou fechar o Scanner no exemplo descrito no roteiro */
        entrada.close();
    }
    
}
