package roteiro2.parte3;

import javax.swing.JOptionPane;

public class Programa07
{
    public static void main(String[] args)
    {
        /* Definindo flag para sinalizar que o usuário deseja dar input em mais dados
         * Definindo variável em que guardarei todas as notas inseridas
         * Definindo contador para armazenar a quantidade de notas inseridas
         */
        int flag = 0;
        double notas = 0;
        int quantidadeNotas = 0;
        

        do
        {
            /* Perguntando se o usuário deseja informar uma nota.
             * Para isso, estou utilizando o método showConfirmDialog da biblioteca gráfica 
             * levantada nos roteiros anteriormente. Esse método irá gerar uma janela com "Yes" e "No".
             * O retorno será 1 ou 0 que irá indicar se o usuário deseja continuar informando notas ou não.
             */
            flag = JOptionPane.showConfirmDialog(null, "Deseja informar uma nota?", "Confirmação", JOptionPane.YES_NO_OPTION);
            
            /*Irei acessar a constante YES_OPTION e NO_OPTION, ao invés de flag == 1 ou flag == 0 apenas por estética */
            if(flag == JOptionPane.YES_OPTION)
            {
                String entrada = JOptionPane.showInputDialog("Informe a nota: ");
                double nota = Integer.parseInt(entrada);

                /* Estou armazenando somando todas as notas que foram inseridas para poder calcular a média */
                notas += nota;
                
                if(nota >= 7)
                {
                    JOptionPane.showMessageDialog(null, "A nota informada foi: " + nota + "\nAprovado");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "A nota informada foi: " + nota + "\nReprovado");
                }
                
                /* Contando quantas notas estão sendo inseridas para calcular a média */
                quantidadeNotas++;
            }
            else if(flag == JOptionPane.NO_OPTION)
            {
                break;
            }

        }while(flag == 0);
        
        /* Calculando a média das notas inseridas e printando-as */
        double media = notas/quantidadeNotas;
        JOptionPane.showMessageDialog((null), "A média das notas inseridos foi: " + media);
        JOptionPane.showMessageDialog(null," O programa será finalizado =)");
    }
}
