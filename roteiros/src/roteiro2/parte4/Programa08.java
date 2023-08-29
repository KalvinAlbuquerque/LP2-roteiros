package roteiro2.parte4;

import java.util.Scanner;

public class Programa08 
{
    public static void main(String[] args)
    {
        /* O java cria vetores estáticos, ou seja, preciso definir um tamanho para compilá-los
         * Embora em sua sintaxe é necessário especificar os colchetes [] depois do tipo, pode ser depois 
         * do nome do array/vetor , entretanto a convenção é que seja depois do tipo e antes do nome
         */

         Scanner entrada = new Scanner(System.in);

         int[] vetorNotas =  new int[5];

         /*Solicitando a entrada de notas */
         for(int cont = 0 ; cont < 5 ; cont++)
         {
            System.out.println("Informe uma nota");
            int nota = entrada.nextInt();

            vetorNotas[cont] = nota;
         }

         /* Exibindo as notas inseridas */
         System.out.println("Foram inseridas as seguintes notas:");
         for(int i = 0 ; i < 5 ; i++)
         {
            System.out.println(vetorNotas[i]);
         }
         entrada.close();
    }
}
