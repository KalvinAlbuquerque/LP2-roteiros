package roteiro2.parte4;

import java.util.Scanner;

public class Programa09
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
         int nota = 0;
        for(int cont = 0; cont < 5; cont++)
        {
            /* Verificando se a nota é válida(se está no intervalo de 0~10)
             * Desta forma, caso não seja, ela ficará no looping infinito até que o usuário digite uma nota válida.
             * Fiz desta forma, para que o vetor seja preenchido totalmente com valores válidos. Ou seja, se o vetor
             * possui 5 índices, ele será preenchido com 5 valores válidos.
             */
            while(true)
            {
                System.out.println("Informe uma nota");
                nota = entrada.nextInt();
                if(nota >= 0 && nota <= 10)
                {
                    break;
                }
                else
                {
                    System.out.println("Por favor insira uma nota válida\n");
                }
            }

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
