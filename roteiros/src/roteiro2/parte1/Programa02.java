package roteiro2.parte1;

import java.util.Scanner;

public class Programa02 {
    
    public static void main(String[] args)
    {
        /* Recebendo um input e armazenando o conteúdo em entrada.
         * Para fazer isso, tenho que habilitar o input, portanto estou criando o Scanner
         * No fim devemos desabilitá-lo, chamanado o método close. (Provavelmente é um delete)
         */
        Scanner entrada = new Scanner(System.in);

        /* Solicitando a entrada */
        System.out.println("Informe seu nome");

        /* Preciso acessar o método nextline() para a linha digitada ser lida */
        String nome = entrada.nextLine();

        /* Printando o nome inserido */
        System.out.println("Nome informado: " + nome);

        /* Solicitando o input de um dado numérico
         * Um erro aparece, pois o método nextline() retorna uma string, logo não consigo armazená-la em um inteiro.
         */
        //int num = entrada.nextLine();
        

        entrada.close();
    }
}
